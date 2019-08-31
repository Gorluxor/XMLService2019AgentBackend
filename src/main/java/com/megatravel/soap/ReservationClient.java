package com.megatravel.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class ReservationClient extends WebServiceGatewaySupport {

    public GetListReservationsForAgentResponse getAllReservations(GetListReservationsForAgent request) {
        return (GetListReservationsForAgentResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}
