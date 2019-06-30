package com.megatravel.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-30T11:47:29.337+02:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://interfaces.megatravel.com/", name = "MessageService")
@XmlSeeAlso({ObjectFactory.class, com.megatravel.admin.ObjectFactory.class, com.megatravel.reservations.ObjectFactory.class, com.megatravel.messages.ObjectFactory.class, com.megatravel.agent.ObjectFactory.class, com.megatravel.types.ObjectFactory.class})
public interface MessageService {

    @WebMethod
    @RequestWrapper(localName = "sendMessage", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.SendMessage")
    @ResponseWrapper(localName = "sendMessageResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.SendMessageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.messages.MessageDTO sendMessage(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        com.megatravel.messages.MessageDTO arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getListMessagesForChatRoom", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetListMessagesForChatRoom")
    @ResponseWrapper(localName = "getListMessagesForChatRoomResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetListMessagesForChatRoomResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.megatravel.messages.MessageDTO> getListMessagesForChatRoom(

        @WebParam(name = "UserId", targetNamespace = "")
        java.lang.Long userId,
        @WebParam(name = "ChatroomId", targetNamespace = "")
        java.lang.Long chatroomId
    );

    @WebMethod
    @RequestWrapper(localName = "createChatRoom", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CreateChatRoom")
    @ResponseWrapper(localName = "createChatRoomResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CreateChatRoomResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.messages.ChatRoomDTO createChatRoom(

        @WebParam(name = "arg0", targetNamespace = "")
        com.megatravel.messages.ChatRoomDTO arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getChatRooms", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetChatRooms")
    @ResponseWrapper(localName = "getChatRoomsResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetChatRoomsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.megatravel.messages.ChatRoomDTO> getChatRooms(

        @WebParam(name = "UserId", targetNamespace = "")
        java.lang.Long userId
    );
}
