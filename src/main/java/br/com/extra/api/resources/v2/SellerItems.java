package br.com.extra.api.resources.v2;

import br.com.extra.api.core.AppToken;
import br.com.extra.api.core.AuthToken;
import br.com.extra.api.core.CoreAPIImpl;
import br.com.extra.api.core.Hosts;
import br.com.extra.api.core.exception.ServiceDataManipulationException;
import br.com.extra.api.core.exception.ServiceException;
import br.com.extra.api.pojo.v2.sellerItems.SellerItem;
import br.com.extra.api.pojo.v2.sellerItems.SellerItemResponse;
import br.com.extra.api.utils.Utils;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.com.extra.api.utils.Utils.isEmpty;

/**
 * Implementa��o do Servi�o Restful /sellerItems na vers�o 2.
 *
 * Servi�o que possibilita ao lojista gerenciar os seus produtos vendidos.
 *
 * Created by marcos.tanaka on 02/04/2015.
 */
public class SellerItems extends CoreAPIImpl<SellerItem> {

    public SellerItems() {
    }

    /**
     * Construtor que cria uma inst�ncia do servi�o.
     *
     * @param host      Endere�o principal do servi�o.
     * @param appToken  Token de Aplica��o.
     * @param authToken
     */
    public SellerItems(Hosts host, AppToken appToken, AuthToken authToken) {
        super(host, appToken, authToken);
    }

    @Override
    protected Class<SellerItem> getPojoClass() {
        return SellerItem.class;
    }

    /**
     * M�todo utilizado para realizar a chamada ao WebService Restful que
     * atualiza o status do produto no Marketplace. Se setado para false, o produto � desativado e deixa de ser vendido no Marketplace.
     *
     * PUT /sellerItems/{skuSellerId}/status
     *
     * @param skuSellerId SKU ID do Lojista.
     * @param active
     * @param site Site no qual o produto ficar� ou n�o dispon�vel. Consulte a lista completa de sites dispon�veis no servi�o GET /sites.
     * @return Confirma��o da execu��o da opera��o.
     * @throws ServiceException Exce��o lan�ada caso ocorra algum erro na execu��o do servi�o.
     */
    public Boolean uptadeStatus(String skuSellerId, Boolean active, String site) throws ServiceException {
        setResource("/sellerItems/" + skuSellerId + "/status");

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("active", active);
        data.put("site", site);

        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * M�todo utilizado para realizar a chamada ao WebService Restful que
     * recupera apenas os produtos do Lojista que est�o dispon�veis para venda, ou seja, que possuem estoque e pre�o atualizados e imagem(ns) v�lida(s).
     *
     * GET /sellerItems/status/selling
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param site Site do qual deseja consultar os produtos. Se o par�metro n�o for informado, ser�o trazidos apenas produtos do Extra. Consulte a lista completa de sites dispon�veis no servi�o GET /sites.
     * @return produtos do Lojista que est�o dispon�veis para venda, ou seja, que possuem estoque e pre�o atualizados e imagem(ns) v�lida(s).
     * @throws ServiceException Exce��o lan�ada caso ocorra algum erro na execu��o do servi�o.
     */
    public List<SellerItem> getAvailableSellerItems(String offset, String limit, String site) throws ServiceException {
        if (Utils.isEmpty(offset) || Utils.isEmpty(limit)) {
            throw new ServiceDataManipulationException("Parameters offset, limit are mandatory.");
        }

        setResource("/sellerItems/status/selling");

        // Par�metros da requisi��o
        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit);
        queryParameters.add("site", site);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        List<SellerItem> sellerItems = new ArrayList<SellerItem>();
        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                sellerItems = getListFromResponse(response);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }

        return sellerItems;
    }

    /**
     * M�todo utilizado para realizar a chamada ao WebService Restful que
     * recupera apenas os produtos do Lojista que est�o dispon�veis para venda, ou seja, que possuem estoque e pre�o atualizados e imagem(ns) v�lida(s).
     *
     * GET /sellerItems/{skuSellerId}
     *
     * @param skuSellerId SKU ID do Lojista.
     * @param site Site do qual deseja consultar o produto. Se o par�metro n�o for informado, ser�o trazidos apenas produtos do Extra. Consulte a lista completa de sites dispon�veis no servi�o GET /sites.
     * @return produtos do Lojista que est�o dispon�veis para venda, ou seja, que possuem estoque e pre�o atualizados e imagem(ns) v�lida(s).
     * @throws ServiceException Exce��o lan�ada caso ocorra algum erro na execu��o do servi�o.
     */
    public SellerItem getSellerItemBySkuID(String skuSellerId, String site) throws ServiceException {
        if (!Utils.isEmpty(skuSellerId)) {
            setResource("/sellerItems/" + skuSellerId);
        } else {
            throw new ServiceDataManipulationException("Parameter skuId is mandatory.");
        }

        ClientResponse response = get();
        SellerItem sellerItem = null;

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                sellerItem = getObjectFromResponse(response);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else if (response.getStatus() != ClientResponse.Status.NOT_FOUND.getStatusCode()) {
            throw errorHandler(response);
        }

        return sellerItem;
    }

    /**
     * M�todo utilizado para realizar a chamada ao WebService Restful que
     * recupera todos os produtos que est�o associados ao Lojista, mesmo
     * os que n�o est�o dispon�veis para venda.
     *
     * GET /sellerItems
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0), ou seja,
     *               para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param site Site do qual deseja consultar os produtos. Se o par�metro n�o for informado, ser�o trazidos apenas produtos do Extra.
     *             Consulte a lista completa de sites dispon�veis no servi�o GET /sites.
     * @param active Indica se o produto est� ativo ou n�o.
     * @param levelIds Lista de IDs de categorias. Separado por v�gulas.
     * @param title T�lulo de venda do produto.
     * @param brand Marca do produto.
     * @param skuId SKU ID do produto no Marketplace.
     * @param skuSellerId SKU ID do produto do Lojista.
     * @param quantity Quantidade total do produto.
     * @param price Pre�o de venda do produto.
     * @param crossDockingTime Tempo de prepara��o/fabrica��o do produto. Esse tempo � inclu�do no c�lculo de frete.
     * @return Lista de produtos que est�o associados ao Lojista, mesmo os que n�o est�o dispon�veis para venda.
     * @throws ServiceException Exce��o lan�ada caso ocorra algum erro na execu��o do servi�o.
     */
    public List<SellerItem> getSellerItems(String offset, String limit, String site, Boolean active, String levelIds, String title, String brand, String skuId, String skuSellerId, Integer quantity, Double price, Integer crossDockingTime) throws ServiceException {
        if (Utils.isEmpty(offset) || Utils.isEmpty(limit)) {
            throw new ServiceDataManipulationException("Parameters offset, limit are mandatory.");
        }

        setResource("/sellerItems");

        // Par�metros da requisi��o
        MultivaluedMapImpl queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit);
        if (!isEmpty(site)) {
            queryParameters.add("site", site);
        }
        if (!isEmpty(active)) {
            queryParameters.add("active", active);
        }
        if (!isEmpty(levelIds)) {
            queryParameters.add("levelIds", levelIds);
        }
        if (!isEmpty(title)) {
            queryParameters.add("title", title);
        }
        if (!isEmpty(brand)) {
            queryParameters.add("brand", brand);
        }
        if (!isEmpty(skuId)) {
            queryParameters.add("skuId", skuId);
        }
        if (!isEmpty(skuSellerId)) {
            queryParameters.add("skuSellerId", skuSellerId);
        }
        if (!isEmpty(quantity)) {
            queryParameters.add("quantity", quantity);
        }
        if (!isEmpty(price)) {
            queryParameters.add("price", price);
        }
        if (!isEmpty(crossDockingTime)) {
            queryParameters.add("crossDockingTime", crossDockingTime);
        }

        ClientResponse response = super.setQueryParams(queryParameters).get();

        List<SellerItem> sellerItems = new ArrayList<SellerItem>();
        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                sellerItems = getListFromResponse(response);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }

        return sellerItems;
    }

    /**
     * Executa o GET /sellerItems, porém aqui apenas os parâmetros offset e limit são passados.
     *
     * @param offset Parâmetro utilizado para indicar a posição inicial da consulta. O registro inicial tem índice zero (0), ou seja,
     *               para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Parâmetro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @return Lista de produtos que estão associados ao Lojista, mesmo os que não estão disponíveis para venda.
     * @throws ServiceException
     */
    public List<SellerItem> getSellerItems(String offset, String limit) throws ServiceException {
        if (Utils.isEmpty(offset) || Utils.isEmpty(limit)) {
            throw new ServiceDataManipulationException("Parameters offset, limit are mandatory.");
        }

        setResource("/sellerItems");

        MultivaluedMapImpl queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        List<SellerItem> sellerItems = new ArrayList<SellerItem>();

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                sellerItems = getListFromResponse(response);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }

        return sellerItems;
    }

    /**
     * M�todo utilizado para realizar a chamada ao WebService Restful que
     * Atualiza o pre�o "de" e o pre�o "por" (pre�o real para venda) do item do Lojista informado.
     *
     * PUT /sellerItems/{skuSellerId}/prices
     *
     * @param skuSellerId SKU ID do Lojista.
     * @param defaultPrice Pre�o "de" do produto no Marketplace.
     * @param offer Pre�o real de venda. Pre�o "por" do produto no Marketplace.
     * @param site Site no qual o produto ficar� ou n�o dispon�vel. Consulte a lista completa de sites dispon�veis no servi�o GET /sites.
     * @return Confirma��o da execu��o da opera��o.
     * @throws ServiceException Exce��o lan�ada caso ocorra algum erro na execu��o do servi�o.
     */
    public Boolean uptadePrice(String skuSellerId, Double defaultPrice, Double offer, String site) throws ServiceException {
        setResource("/sellerItems/" + skuSellerId + "/prices");

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("default", defaultPrice);
        data.put("offer", offer);
        data.put("site", site);

        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * M�todo utilizado para realizar a chamada ao WebService Restful que
     * atualiza a quantidade dispon�vel para venda do Item do Lojista informado.
     *
     * PUT /sellerItems/{skuSellerId}/stock
     *
     * @param skuSellerId SKU ID do Lojista.
     * @param quantity Quantidade de produtos dispon�veis.
     * @param crossDockingTime Tempo de prepara��o/fabrica��o do produto. Esse tempo � inclu�do no c�lculo de frete.
     * @param warehouse ID do dep�sito no qual o estoque do produto est� sendo considerado. Consulte a lista completa de warehouses dispon�veis no servi�o GET /warehouses.
     * @return Confirma��o da execu��o da opera��o.
     * @throws ServiceException Exce��o lan�ada caso ocorra algum erro na execu��o do servi�o.
     */
    public Boolean uptadeStock(String skuSellerId, Integer quantity, Integer crossDockingTime , Integer warehouse) throws ServiceException {
        setResource("/sellerItems/" + skuSellerId + "/stock");

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("quantity", quantity);
        data.put("crossDockingTime", (crossDockingTime == null ? 0 : crossDockingTime));
        data.put("warehouse", warehouse);

        ClientResponse response = put(data);

        if (response.getStatus() != ClientResponse.Status.NO_CONTENT.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * M�todo que recupera do response uma lista de objeto que dever� ser retornado.
     *
     * @param response Response da requisi��o realizada.
     * @return Lista de objetos items do lojista.
     * @throws IOException Exce��o lan�ada no parse da lista de retorno.
     */
    protected List<SellerItem> getListFromResponse(ClientResponse response) throws IOException {
        SellerItemResponse pojos;
        try {
            pojos = new ObjectMapper().readValue(response.getEntityInputStream(), new TypeReference<SellerItemResponse>() {});
        } catch (IOException e) {
            throw e;
        }
        return pojos.getSellerItemList();
    }
}
