package com.megatravel.controller;

import com.megatravel.dtos.MessageDTO;
import com.megatravel.model.ChatRoom;
import com.megatravel.model.Message;
import com.megatravel.model.User;
import com.megatravel.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/messages")
public class MessageController {
    
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<MessageDTO>> getAll() {
        List<Message> accommodations = messageService.findAll();
        List<MessageDTO> rentACarDTOS = new ArrayList<>();

        for (Message aCar : accommodations){
            rentACarDTOS.add(new MessageDTO(aCar));
        }
        return new ResponseEntity<>(rentACarDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<MessageDTO> posaljiPoruku(@RequestBody MessageDTO reservationDTO) {

        Message message = new Message();

        message.setMsg(reservationDTO.getMsg());
        message.setChatRoom(new ChatRoom(reservationDTO.getChatRoomDTO()));
        message.setReceiver(new User(reservationDTO.getReceiver()));
        message.setSender(new User(reservationDTO.getSender()));
        message.setTimeStamp(reservationDTO.getTimeStamp());

        message=messageService.save(message);

        return new ResponseEntity<>(new MessageDTO(message),HttpStatus.OK);

    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){




        return "Done";
    }

}
