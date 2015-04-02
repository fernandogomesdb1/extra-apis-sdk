package br.com.extra.api.resources.v2;

import br.com.extra.api.core.AppToken;
import br.com.extra.api.core.AuthToken;
import br.com.extra.api.core.CoreAPIImpl;
import br.com.extra.api.core.Hosts;
import br.com.extra.api.core.exception.ServiceDataManipulationException;
import br.com.extra.api.core.exception.ServiceException;
import br.com.extra.api.pojo.v2.orders.Item;
import br.com.extra.api.pojo.v2.orders.Order;
import br.com.extra.api.utils.Utils;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcos.tanaka on 02/04/2015.
 */
public class Orders extends CoreAPIImpl<Order> {

    /**
     * Construtor que cria uma instância do serviço.
     *
     * @param host      Endereço principal do serviço.
     * @param appToken  Token de Aplicação.
     * @param authToken
     */
    public Orders(Hosts host, AppToken appToken, AuthToken authToken) {
        super(host, appToken, authToken);
    }

    @Override
    protected Class<Order> getPojoClass() {
        return Order.class;
    }

    /**
     * Recupera detalhes do pedido informado.
     *
     * GET /orders/{orderId}
     *
     * @param orderId ID do pedido.
     * @return Recupera detalhes do pedido informado.
     * @throws ServiceException
     */
    public Order getOrder(String orderId) throws ServiceException {
        if (!Utils.isEmpty(orderId)) {
            setResource("/orders/" + orderId);
        } else {
            throw new ServiceDataManipulationException("Parameter orderId is mandatory.");
        }

        ClientResponse response = get();

        Order order = null;

        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                order = getObjectFromResponse(response);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        } else if (response.getStatus() != ClientResponse.Status.NOT_FOUND.getStatusCode()) {
            throw errorHandler(response);
        }

        return order;
    }

    /**
     * Recupera detalhes de um item específico do pedido.
     *
     * GET /orders/{orderId}/items/{orderItemId}
     *
     * @param orderId ID do pedido.
     * @param skuSellerId SKU ID do produto do Lojista.
     * @return item do pedido.
     * @throws ServiceException
     */
    public Item getOrderItem(String orderId, String skuSellerId) throws ServiceException {
        if (!Utils.isEmpty(orderId) && !Utils.isEmpty(skuSellerId)) {
            setResource("/orders/" + orderId + "/items/" + skuSellerId);
        } else {
            throw new ServiceDataManipulationException("Parameters orderId and orderItemId are mandatory.");
        }

        ClientResponse response = get();

        Item orderItem = null;
        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                orderItem = new ObjectMapper().readValue(response.getEntityInputStream(), Item.class);
            } catch (IOException e) {
                throw new ServiceDataManipulationException("Error handling response. ", e);
            }
        }

        return orderItem;
    }

    /**
     * Recupera uma lista de pedidos Novos que estão relacionados com o token do lojista informado.
     *
     * GET /orders/status/new
     *
     * @param offset Parâmetro utilizado para indicar a posição inicial da consulta. O registro inicial tem índice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Parâmetro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param purchasedAt Data de compra. Esse campo aceita um range de datas separados por vírgula, e os formatos aceitos para o campo são os seguintes:
     *                       purchasedAt={data inicial},{data final}
     *                       purchasedAt={data inicial},*
     *                       purchasedAt=*,{data final}
     *                       onde, o * é obrigatório e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return lista de pedidos Novos que estão relacionados com o token do lojista informado.
     * @throws ServiceException
     */
    public List<Order> getNewOrders(Integer offset, Integer limit, String purchasedAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/new");
        return getListOfOrders(String.valueOf(offset), String.valueOf(limit), purchasedAt, customerName, customerDocumentNumber);
    }

    /**
     * Recupera uma lista de pedidos Aprovados que estão relacionados com o token do lojista informado.
     *
     * GET /orders/status/approved
     *
     * @param offset Parâmetro utilizado para indicar a posição inicial da consulta. O registro inicial tem índice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Parâmetro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param purchasedAt Data de compra. Esse campo aceita um range de datas separados por vírgula, e os formatos aceitos para o campo são os seguintes:
     *                       purchasedAt={data inicial},{data final}
     *                       purchasedAt={data inicial},*
     *                       purchasedAt=*,{data final}
     *                       onde, o * é obrigatório e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return lista de pedidos Aprovados que estão relacionados com o token do lojista informado.
     * @throws ServiceException
     */
    public List<Order> getApprovedOrders(String offset, Integer limit, String purchasedAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/approved");
        return getListOfOrders(offset, String.valueOf(limit), purchasedAt, customerName, customerDocumentNumber);
    }

    /**
     * Retorna uma lista de pedidos Cancelados que estão relacionados com o token do lojista informado.
     *
     * GET /orders/status/canceled
     *
     * @param offset Parâmetro utilizado para indicar a posição inicial da consulta. O registro inicial tem índice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Parâmetro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param canceledAt Data de cancelemento. Esse campo aceita um range de datas separados por vírgula, e os formatos aceitos para o campo são os seguintes:
     *                       canceledAt={data inicial},{data final}
     *                       canceledAt={data inicial},*
     *                       canceledAt=*,{data final}
     *                       onde, o * é obrigatório e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return
     * @throws ServiceException
     */
    public List<Order> getCanceledOrders(String offset, Integer limit, String canceledAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/canceled/");
        return getListOfOrders(offset, String.valueOf(limit), canceledAt, customerName, customerDocumentNumber);
    }

    // GET /orders/status/sent
    public List<Order> getSentOrders(String offset, String limit) throws ServiceException {
        return null;
    }

    // GET /orders/status/partiallySent
    public List<Order> getSentPartiallyOrders(String offset, String limit) throws ServiceException {
        return null;
    }

    // GET /orders/status/partiallyDelivered
    public List<Order> getPartiallyDeliveredOrders(String offset, String limit) throws ServiceException {
        return null;
    }

    // GET /orders/status/delivered
    public List<Order> getDeliveredOrders(String offset, String limit) throws ServiceException {
        return null;
    }

    // *****************************************************************************************************************
    // NOVOS
    // *****************************************************************************************************************

    // POST /orders/{orderId}/trackings/sent
    public Boolean requestShipmentTracking(String orderId, String reason) throws ServiceException {
        return null;
    }

    // POST /orders/{orderId}/trackings/delivered
    public Boolean requestDeliveryTracking(String orderId, String reason) throws ServiceException {
        return null;
    }

    // POST /orders/{orderId}/trackings/cancel
    public Boolean cancelOrderItem(String orderId, String reason) throws ServiceException {
        return null;
    }

    // POST /orders/{orderId}/trackings/exchange
    public Boolean exchangeOrderItem(String orderId, String reason) throws ServiceException {
        return null;
    }

    // POST /orders/{orderId}/trackings/return
    public Boolean returnOrderItem(String orderId, String reason) throws ServiceException {
        return null;
    }

    /**
     * Método utilizado para realizar as consultas de pedidos.
     *
     * @param offset Parâmetro utilizado para limitar a quantidade de registros trazidos por página.
     * @param limit Parâmetro utilizado para limitar a quantidade de registros trazidos pela operação.
     * @param purchasedAt Data de compra. Esse campo aceita um range de datas separados por vírgula, e os formatos aceitos para o campo são os seguintes:
     *                       purchasedAt={data inicial},{data final}
     *                       purchasedAt={data inicial},*
     *                       purchasedAt=*,{data final}
     *                       onde, o * é obrigatório e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return Lista de pedidos do lojista.
     * @throws ServiceException
     */
    private List<Order> getListOfOrders(String offset, String limit, String purchasedAt, String customerName, String customerDocumentNumber) throws ServiceException {
        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit);
        queryParameters.add("purchasedAt", purchasedAt);
        queryParameters.add("customer.name", customerName);
        queryParameters.add("customer.documentNumber", customerDocumentNumber);

        ClientResponse response = super.setQueryParams(queryParameters).get();

        List<Order> orders = new ArrayList<Order>();
        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            try {
                orders = getListFromResponse(response);
            } catch (IOException e) {
                throw new ServiceDataManipulationException(
                        "Error handling response. ", e);
            }
        } else {
            throw errorHandler(response);
        }

        return orders;
    }

    /**
     * Método que recupera do response uma lista de objeto que deverá ser retornado.
     *
     * @param response Response da requisição realizada.
     * @return Lista de objetos pedidos.
     * @throws IOException Exceção lançada no parse da lista de retorno.
     */
    protected List<Order> getListFromResponse(ClientResponse response) throws IOException {
        List<Order> pojos = new ArrayList<Order>();
        try {
            pojos = new ObjectMapper().readValue(
                    response.getEntityInputStream(),
                    new TypeReference<List<Order>>() {
                    });
        } catch (IOException e) {
            throw e;
        }
        return pojos;
    }

}