package com.megatravel.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AuthClient extends WebServiceGatewaySupport {

    public LoginResponse login(Login request) {
        return (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}
