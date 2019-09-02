package com.megatravel.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class ReservationClient extends WebServiceGatewaySupport {

    public GetListReservationsForAgentResponse getAllReservations(GetListReservationsForAgent request) {
        return (GetListReservationsForAgentResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public ConfirmReservationResponse confirmReservation(ConfirmReservation request) {
        return (ConfirmReservationResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public CreateReservationResponse createReservation(CreateReservation request) {
        return (CreateReservationResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}
