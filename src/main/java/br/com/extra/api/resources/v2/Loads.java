package br.com.extra.api.resources.v2;

import br.com.extra.api.core.AppToken;
import br.com.extra.api.core.AuthToken;
import br.com.extra.api.core.CoreAPIImpl;
import br.com.extra.api.core.Hosts;
import br.com.extra.api.core.exception.ServiceDataManipulationException;
import br.com.extra.api.core.exception.ServiceException;
import br.com.extra.api.pojo.v2.loads.ProductLoad;
import br.com.extra.api.pojo.v2.loads.*;
import br.com.extra.api.pojo.v2.loads.Product;
import br.com.extra.api.utils.Utils;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.core.MultivaluedMap;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/**
 * Implementação do Serviço Restful /loads na versão 2.
 *
 * Operações de cargas.
 *
 * Created by marcos.tanaka on 06/04/2015.
 */
public class Loads extends CoreAPIImpl<Product> {

    /**
     * Construtor que cria uma instância do serviço.
     *
     * @param host      Endereço principal do serviço.
     * @param appToken  Token de Aplicação.
     * @param authToken
     */
    public Loads(Hosts host, AppToken appToken, AuthToken authToken) {
        super(host, appToken, authToken);
    }

    @Override
    protected Class<Product> getPojoClass() {
        return Product.class;
    }

    /**
     * POST /loads/products Operação utilizada para enviar uma nova carga de produtos. (assíncrono)
     */
    public Boolean loadProducts(ProductLoad products) throws ServiceException {
        setResource("/loads/products");

        byte[] compressedByteArray;
        try {
            if (!Utils.isEmpty(products.getGzFile())) {
                compressedByteArray = getBytesFromFile(products.getGzFile());
            } else {
                compressedByteArray = compress(products);
            }
        } catch (IOException e1) {
            throw new ServiceException("Error while trying compact content.", e1);
        }

        ClientResponse response = setMediaType("application/json").post(compressedByteArray);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * GET /loads/products Operação utilizada para consultar o status dos produtos enviados
     */
    public ProductsStatus getLoadedProductsStatus(String createdAt, String status, String offset, Integer limit) throws ServiceException {
        setResource("/loads/products");
        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit.toString());
        queryParameters.add("createdAt", createdAt);
        queryParameters.add("status", status);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                return new ObjectMapper().readValue(response.getEntityInputStream(), ProductsStatus.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }
    }

    /**
     * GET /loads/products/{skuSellerId} Operação para consultar os detalhes dos produtos
     */
    public ProductsDetail getProductsDetail(String skuSellerId) throws ServiceDataManipulationException {
        setResource("/loads/products/" + skuSellerId);

        ClientResponse response = get();

        ProductsDetail productsDetail = null;
        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                productsDetail = new ObjectMapper().readValue(response.getEntityInputStream(), ProductsDetail.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        }

        return productsDetail;
    }

    /**
     * PUT /loads/products/{skuSellerId} Operação para alterar um produto enviado na carga
     */
    public Boolean updateLoadedProduct(String skuSellerId, Product product) throws ServiceException {
        setResource("/loads/products/" + skuSellerId);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("body", product);
        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * GET /loads/sellerItems/status Operação para consulta de status da atualização massiva de status
     */
    public UpdatedStatusSituation getUpdatedStatusSituation(Integer offset, Integer limit, String skuSellerId) throws ServiceException {
        setResource("/loads/sellerItems/status");
        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset.toString());
        queryParameters.add("_limit", limit.toString());
        queryParameters.add("skuSellerId", skuSellerId);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                return new ObjectMapper().readValue(response.getEntityInputStream(), UpdatedStatusSituation.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }
    }

    /**
     * PUT /loads/sellerItems/status Operação para atualização de ativação/desativação massiva de produtos
     */
    public Boolean enableDisableProducts(String skuSellerId, LoadsSellerItemsStatus status) throws ServiceException {
        setResource("/loads/sellerItems/status" + skuSellerId);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("body", status);
        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * GET /loads/sellerItems/prices Operação para consulta de status da atualização massiva de preços
     */
    public UpdatedStatusSituation getUpdatedPricesSituation(Integer offset, Integer limit, String skuSellerId) throws ServiceException {
        setResource("/loads/sellerItems/prices");

        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset.toString());
        queryParameters.add("_limit", limit.toString());
        queryParameters.add("skuSellerId", skuSellerId);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                return new ObjectMapper().readValue(response.getEntityInputStream(), UpdatedStatusSituation.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }
    }

    /**
     * PUT /loads/sellerItems/prices Operação para atualização de preço de produtos em massa
     */
    public Boolean updateProductsPrice(String skuSellerId, LoadsSellerItemsPrices prices) throws ServiceException {
        setResource("/loads/sellerItems/prices" + skuSellerId);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("body", prices);
        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * GET /loads/sellerItems/stocks Operação para consulta de status da atualização massiva de estoque
     */
    public UpdatedStockSituation getUpdatedStockSituation(Integer offset, Integer limit, String skuSellerId) throws ServiceException {
        setResource("/loads/sellerItems/stocks");

        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset.toString());
        queryParameters.add("_limit", limit.toString());
        queryParameters.add("skuSellerId", skuSellerId);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                return new ObjectMapper().readValue(response.getEntityInputStream(), UpdatedStockSituation.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }
    }

    /**
     * PUT /loads/sellerItems/stocks Operação para atualização de estoque massivo
     */
    public Boolean updateStock(String skuSellerId, LoadsSellerItemsStocks stock) throws ServiceException {
        setResource("/loads/sellerItems/stocks" + skuSellerId);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("body", stock);
        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * POST /loads/orders/trackings/sent Operação responsável por criar trackings massivos
     */
    public Boolean createSentTrack(ProductLoad products) throws ServiceException {
        setResource("/loads/orders/trackings/sent");

        byte[] compressedByteArray;
        try {
            if (!Utils.isEmpty(products.getGzFile())) {
                compressedByteArray = getBytesFromFile(products.getGzFile());
            } else {
                compressedByteArray = compress(products);
            }
        } catch (IOException e1) {
            throw new ServiceException("Error while trying compact content.", e1);
        }

        ClientResponse response = setMediaType("application/json").post(compressedByteArray);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * GET /loads/orders/trackings/sent Operação utilizada para consultar o status da atualização massiva de tracking
     */
    public UpdatedSentTrackingSituation getUpdatedSentTrackingSituation(String offset, Integer limit) throws ServiceException {
        setResource("/loads/orders/trackings/sent");

        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit.toString());

        ClientResponse response = super.setQueryParams(queryParameters).get();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                return new ObjectMapper().readValue(response.getEntityInputStream(), UpdatedSentTrackingSituation.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }
    }

    /**
     * POST /loads/orders/trackings/delivered Operação responsável por criar trackings massivos
     */
    public Boolean createDeliveredTrack(ProductLoad products) throws ServiceException {
        setResource("/loads/orders/trackings/delivered");

        byte[] compressedByteArray;
        try {
            if (!Utils.isEmpty(products.getGzFile())) {
                compressedByteArray = getBytesFromFile(products.getGzFile());
            } else {
                compressedByteArray = compress(products);
            }
        } catch (IOException e1) {
            throw new ServiceException("Error while trying compact content.", e1);
        }

        ClientResponse response = setMediaType("application/json").post(compressedByteArray);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * GET /loads/orders/trackings/delivered Operação utilizada para consultar o status da atualização massiva de tracking
     */
    public UpdatedSentTrackingSituation getUpdatedDeliveredTrackingSituation(String offset, Integer limit) throws ServiceException {
        setResource("/loads/orders/trackings/delivered");

        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit.toString());

        ClientResponse response = super.setQueryParams(queryParameters).get();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                return new ObjectMapper().readValue(response.getEntityInputStream(), UpdatedSentTrackingSituation.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }
    }

    private byte[] getBytesFromFile(File file) throws FileNotFoundException, IOException {
        byte[] bytesToCompress;
        // Criação do InputStream do Arquivo
        FileInputStream stream = new FileInputStream(file);
        byte[] buffer = new byte[8192];
        int bytesRead;
        // Conversão do arquivo em um Array de Bytes para ser compactado via GZip
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while ((bytesRead = stream.read(buffer)) != -1) {
            output.write(buffer, 0, bytesRead);
        }
        bytesToCompress = output.toByteArray();
        // Tratamento para compactar a String que contém o JSON
        return bytesToCompress;
    }

    private byte[] compress(ProductLoad products) throws IOException, ServiceDataManipulationException {
        // Array de bytes que será enviado para o serviço
        byte[] compressedByteArray = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            GZIPOutputStream gzos = new GZIPOutputStream(baos);
            byte[] bytesToCompress = null;

            // Tratamento para compactar o arquivo JSON
            if (!Utils.isEmpty(products.getJsonFile())) {
                bytesToCompress = getBytesFromFile(products.getJsonFile());
            } else if (!Utils.isEmpty(products.getProductsJson())) {
                bytesToCompress = products.getProductsJson().getBytes();
                // Lançamento de Exceção caso não seja enviado nem o arquivo nem a String.
            } else {
                throw new ServiceDataManipulationException("Error while trying gziping content. There is no content to be compressed.");
            }

            // Compactação do Array de Bytes
            gzos.write(bytesToCompress);

            gzos.finish();
            gzos.close();

            // Recuperação do Array de Bytes
            compressedByteArray = baos.toByteArray();
            baos.close();

        } catch (IOException e) {
            throw e;
        }
        return compressedByteArray;
    }

}
