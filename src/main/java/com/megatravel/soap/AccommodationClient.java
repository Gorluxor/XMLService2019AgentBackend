package com.megatravel.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AccommodationClient extends WebServiceGatewaySupport {

    public GetAllAccommodationsResponse getAllReservations(GetAllAccommodations request) {
        return (GetAllAccommodationsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}


