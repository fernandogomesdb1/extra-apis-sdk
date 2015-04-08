package br.com.extra.api.resources.v2;

import br.com.extra.api.core.AppToken;
import br.com.extra.api.core.AuthToken;
import br.com.extra.api.core.CoreAPIImpl;
import br.com.extra.api.core.Hosts;
import br.com.extra.api.core.exception.ServiceDataManipulationException;
import br.com.extra.api.core.exception.ServiceException;
import br.com.extra.api.pojo.v2.orders.*;
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

    public Orders(){}

    /**
     * Construtor que cria uma inst�ncia do servi�o.
     *
     * @param host      Endere�o principal do servi�o.
     * @param appToken  Token de Aplica��o.
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
     * Recupera detalhes de um item espec�fico do pedido.
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
     * Recupera uma lista de pedidos Novos que est�o relacionados com o token do lojista informado.
     *
     * GET /orders/status/new
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param purchasedAt Data de compra. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                       purchasedAt={data inicial},{data final}
     *                       purchasedAt={data inicial},*
     *                       purchasedAt=*,{data final}
     *                       onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return lista de pedidos Novos que est�o relacionados com o token do lojista informado.
     * @throws ServiceException
     */
    public List<Order> getNewOrders(Integer offset, Integer limit, String purchasedAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/new");
        return getListOfOrders(String.valueOf(offset), String.valueOf(limit), "purchasedAt", purchasedAt, customerName, customerDocumentNumber);
    }

    /**
     * Recupera uma lista de pedidos Aprovados que est�o relacionados com o token do lojista informado.
     *
     * GET /orders/status/approved
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param purchasedAt Data de compra. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                       purchasedAt={data inicial},{data final}
     *                       purchasedAt={data inicial},*
     *                       purchasedAt=*,{data final}
     *                       onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return lista de pedidos Aprovados que est�o relacionados com o token do lojista informado.
     * @throws ServiceException
     */
    public List<Order> getApprovedOrders(String offset, Integer limit, String purchasedAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/approved");
        return getListOfOrders(offset, String.valueOf(limit), "purchasedAt", purchasedAt, customerName, customerDocumentNumber);
    }

    /**
     * Retorna uma lista de pedidos Cancelados que est�o relacionados com o token do lojista informado.
     *
     * GET /orders/status/canceled
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param canceledAt Data de cancelemento. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                       canceledAt={data inicial},{data final}
     *                       canceledAt={data inicial},*
     *                       canceledAt=*,{data final}
     *                       onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return
     * @throws ServiceException
     */
    public List<Order> getCanceledOrders(String offset, Integer limit, String canceledAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/canceled");
        return getListOfOrders(offset, String.valueOf(limit), "canceledAt", canceledAt, customerName, customerDocumentNumber);
    }

    /**
     * Recupera uma lista de pedidos Enviados que est�o relacionados com o token do lojista informado. Este estado representa os pedidos cujos itens foram todos entregues.
     *
     * GET /orders/status/sent
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param sentAt Data de envio. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                   sentAt={data inicial},{data final}
     *                   sentAt={data inicial},*
     *                   sentAt=*,{data final}
     *                   onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return
     * @throws ServiceException
     */
    public List<Order> getSentOrders(String offset, String limit, String sentAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/sent");
        return getListOfOrders(offset, String.valueOf(limit), "sentAt", sentAt, customerName, customerDocumentNumber);
    }

    /**
     * Retorna uma lista de pedidos Parcialmente Enviados que est�o relacionados com o token do lojista informado.
     *
     * GET /orders/status/partiallySent
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param sentAt Data de envio. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                   sentAt={data inicial},{data final}
     *                   sentAt={data inicial},*
     *                   sentAt=*,{data final}
     *                   onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return
     * @throws ServiceException
     */
    public List<Order> getSentPartiallyOrders(String offset, String limit, String sentAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/partiallySent");
        return getListOfOrders(offset, String.valueOf(limit), "sentAt", sentAt, customerName, customerDocumentNumber);
    }

    /**
     * Retorna uma lista de pedidos Parcialmente Entregues que est�o relacionados com o token do lojista informado.
     *
     * GET /orders/status/partiallyDelivered
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param sentAt Data de envio. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                   sentAt={data inicial},{data final}
     *                   sentAt={data inicial},*
     *                   sentAt=*,{data final}
     *                   onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return
     * @throws ServiceException
     */
    public List<Order> getPartiallyDeliveredOrders(String offset, String limit, String sentAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/partiallyDelivered");
        return getListOfOrders(offset, String.valueOf(limit), "sentAt", sentAt, customerName, customerDocumentNumber);
    }

    /**
     * Recupera uma lista de pedidos Entregues que est�o relacionados com o token do lojista informado. Este estado representa os pedidos cujos itens foram todos entregues.
     *
     * GET /orders/status/delivered
     *
     * @param offset Par�metro utilizado para indicar a posi��o inicial da consulta. O registro inicial tem �ndice zero (0),
     *               ou seja, para trazer os 10 primeiros registros, informa 0 para _offset e 10 para _limit.
     * @param limit Par�metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
     * @param deliveredAt Data de entrega. Esse campo aceita um range de datas separados por v�rgula, e os formatos aceitos para o campo s�o os seguintes:
     *                       deliveredAt={data inicial},{data final}
     *                       deliveredAt={data inicial},*
     *                       deliveredAt=*,{data final}
     *                       onde, o * � obrigat�rio e indica a que todas as datas antes ou depois da outra data passada devem ser consideradas
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return
     * @throws ServiceException
     */
    public List<Order> getDeliveredOrders(String offset, String limit, String deliveredAt, String customerName, String customerDocumentNumber) throws ServiceException {
        setResource("/orders/status/delivered");
        return getListOfOrders(offset, String.valueOf(limit), "deliveredAt", deliveredAt, customerName, customerDocumentNumber);
    }

    // *****************************************************************************************************************
    // NOVOS
    // *****************************************************************************************************************

    /**
     * Registra uma nova opera��o de tracking de Envio para os itens do pedido.
     *
     * POST /orders/{orderId}/trackings/sent
     *
     * @param orderId ID do pedido.
     * @param body
     * @return
     * @throws ServiceException
     */
    public Boolean requestShipmentTracking(String orderId, TrackingUpdateSend body) throws ServiceException {
        setResource("/orders/" + orderId + "/trackings/sent");

        ClientResponse response = post(body);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * Registra uma nova opera��o de tracking de Entrega para os itens do pedido.
     *
     * POST /orders/{orderId}/trackings/delivered
     *
     * @param orderId ID do pedido.
     * @param body
     * @return
     * @throws ServiceException
     */
    public Boolean requestDeliveryTracking(String orderId, TrackingUpdateDelivery body) throws ServiceException {
        setResource("/orders/" + orderId + "/trackings/delivered");

        ClientResponse response = post(body);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * Opera��o utilizada para confirmar o cancelamento de um item de um pedido que foi aberto pelo cliente (via protocolo) ou cancelamento acionado pelo lojista.
     *
     * POST /orders/{orderId}/trackings/cancel
     *
     * @param orderId
     * @param body
     * @return
     * @throws ServiceException
     */
    public Boolean cancelOrderItem(String orderId, TrackingCancel body) throws ServiceException {
        setResource("/orders/" + orderId + "/trackings/cancel");

        ClientResponse response = post(body);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * Opera��o utilizada para confirmar a troca de um item de um pedido que foi aberto pelo cliente (via protocolo).
     *
     * POST /orders/{orderId}/trackings/exchange
     *
     * @param orderId
     * @param body
     * @return
     * @throws ServiceException
     */
    public Boolean exchangeOrderItem(String orderId, TrackingUpdateDelivery body) throws ServiceException {
        setResource("/orders/" + orderId + "/trackings/exchange");

        ClientResponse response = post(body);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * Opera��o utilizada para confirma��o de devolu��o (reembolso) de item do pedido atrav�s de protocolo aberto pelo cliente.
     *
     * POST /orders/{orderId}/trackings/return
     *
     * @param orderId
     * @param body
     * @return
     * @throws ServiceException
     */
    public Boolean returnOrderItem(String orderId, TrackingUpdateDelivery body) throws ServiceException {
        setResource("/orders/" + orderId + "/trackings/return");

        ClientResponse response = post(body);

        if (response.getStatus() != ClientResponse.Status.CREATED.getStatusCode()) {
            throw errorHandler(response);
        }

        return true;
    }

    /**
     * M�todo utilizado para realizar as consultas de pedidos.
     *
     * @param offset Par�metro utilizado para limitar a quantidade de registros trazidos por p�gina.
     * @param limit Par�metro utilizado para limitar a quantidade de registros trazidos pela opera��o.
     * @param dateName Nome do par�metro Data para filtrar.
     * @param date Data para filtrar.
     * @param customerName Nome do Cliente.
     * @param customerDocumentNumber Documento do Cliente.
     * @return Lista de pedidos do lojista.
     * @throws ServiceException
     */
    private List<Order> getListOfOrders(String offset, String limit, String dateName, String date, String customerName, String customerDocumentNumber) throws ServiceException {
        MultivaluedMap<String, String> queryParameters = new MultivaluedMapImpl();
        queryParameters.add("_offset", offset);
        queryParameters.add("_limit", limit);
        queryParameters.add(dateName, date);
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
     * M�todo que recupera do response uma lista de objeto que dever� ser retornado.
     *
     * @param response Response da requisi��o realizada.
     * @return Lista de objetos pedidos.
     * @throws IOException Exce��o lan�ada no parse da lista de retorno.
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