package com.megatravel.controller;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

/*
public class Test {
	
	public static void main(String[] args) {
	try {
		
		
		URL url = new URL("http://localhost:9999/api/message/services/msg?wsdl");
		//MessageService_Service service = new MessageService_Service(url);
		System.out.println("A");
	
		MessageServiceInterface service = new MessageServiceInterface(url);
		System.out.println("A");
		MessageService servicePort = service.getMessageServicePort();
		System.out.println("A");
		List<MessageDTO> response = servicePort.getListMessagesForChatRoom(1L, 1L).stream().map(el -> (MessageDTO) el).collect(Collectors.toList());
		
		System.out.println("Uspesno zavrsena komunikacija");
		
		for (MessageDTO messageDTO : response) {
			System.out.println();
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
*/