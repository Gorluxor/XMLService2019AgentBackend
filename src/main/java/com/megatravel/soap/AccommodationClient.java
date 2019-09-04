package com.megatravel.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AccommodationClient extends WebServiceGatewaySupport {

    public GetAllAccommodationsResponse getAllReservations(GetAllAccommodations request) {
        return (GetAllAccommodationsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAllAccommodationsForAgentResponse getAllAccommodationsForAgent(GetAllAccommodationsForAgent request) {
        return (GetAllAccommodationsForAgentResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAllServicesResponse getAllServices(GetAllServices request) {
        return (GetAllServicesResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAllUnitsResponse getAllUnits(GetAllUnits request) {
        return (GetAllUnitsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAllUnitsForAgentResponse getAllUnitsForAgent(GetAllUnitsForAgent request) {
        return (GetAllUnitsForAgentResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAllUnitTypeResponse getAllUnitType(GetAllUnitType request) {
        return (GetAllUnitTypeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public CreateUnitResponse createUnit(CreateUnit request) {
        return (CreateUnitResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public CreateUnitProsireniResponse createUnitProsireni(CreateUnitProsireni request) {
        return (CreateUnitProsireniResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}


