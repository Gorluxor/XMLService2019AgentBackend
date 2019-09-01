package com.megatravel.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class MessageClient extends WebServiceGatewaySupport {

    public GetChatRoomsResponse getChatRooms(GetChatRooms request) {
        return (GetChatRoomsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public SendMessageResponse sendMessage(SendMessage request) {
        return (SendMessageResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetListMessagesForChatRoomResponse getListMessagesForChatRoom(GetListMessagesForChatRoom request) {
        return (GetListMessagesForChatRoomResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
