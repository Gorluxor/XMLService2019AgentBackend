package com.megatravel.service;

import com.megatravel.dtos.ChatRoomDTO;
import com.megatravel.dtos.MessageDTO;
import com.megatravel.model.*;
import com.megatravel.repository.ChatRoomRepository;
import com.megatravel.repository.MessageRepository;
import com.megatravel.repository.ReservationRepository;
import com.megatravel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private UserRepository userRepository;


    public Message findById(Long  id){
        return messageRepository.findById(id).get();
    }

    public List<Message> findAll(){
        return messageRepository.findAll();
    }

    public Message save(Message user){
        return messageRepository.save(user);
    }

    public void remove(Long id){messageRepository.deleteById(id);}

    public ChatRoom createChatRoom(ChatRoomDTO chatRoomDTO) throws ResponseStatusException {

        ChatRoom chatRoom = new ChatRoom(chatRoomDTO);

        if (chatRoom.getReservation() == null){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No such object in database");
        }

        Reservation reservation = reservationRepository.getOne(chatRoom.getReservation().getId());

        Message starterMessage = new Message();
        starterMessage.setSender(reservation.getUser());
        starterMessage.setTimeStamp(new Date());
        starterMessage.setMsg("Your chat has started");
        AccommodationUnit accommodationUnit = reservation.getAccommodationUnit().get(0);
        if (accommodationUnit == null){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No such object in database");
        }
        starterMessage.setReceiver(accommodationUnit.getAccommodation().getUser());
        chatRoom.setLastChangedDate(new Date());
        chatRoom.setReservation(reservation);
        chatRoomRepository.save(chatRoom);

        starterMessage.setChatRoom(chatRoom);
        messageRepository.save(starterMessage);

        return chatRoom;
    }

    public List<ChatRoom> getChatRooms(Long userId) throws ResponseStatusException {
        if (!userRepository.existsById(userId)){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No such object in database");
        }

        List<ChatRoom> results = chatRoomRepository.allByUserId(userId);
        return results;
    }

    public List<Message> getListMessagesForChatRoom(Long userId, Long chatRoomId) throws ResponseStatusException {
        List<Message> results = messageRepository.allMessagesToChat(chatRoomId, userId);
        if (!userRepository.existsById(userId)){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No such object in database");
        }
        return results;
    }

    public Message sendMessage(Long chatRoomIdOrReservationId, MessageDTO messageDTO) throws ResponseStatusException {


        Message msg = new Message(messageDTO);

        if (msg.getSender() == null || msg.getReceiver() == null ){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No such object in database");
        }
        User sender = userRepository.getOne(msg.getSender().getId());
        User receiver = userRepository.getOne(msg.getReceiver().getId());

        Date date = new Date();
        // sender and receiver are not null by .getId (otherwise throws exception)
        msg.setTimeStamp(date);
        ChatRoom chatRoom = chatRoomRepository.getOne(chatRoomIdOrReservationId);

        msg.setChatRoom(chatRoom);
        msg.setReceiver(receiver);
        msg.setSender(sender);
        msg.setLastChangedDate(date);
        messageRepository.save(msg);

        return msg;
    }

    public ChatRoom getChatRoomForReservationId(Long id){
        return chatRoomRepository.findFirstByReservation_Id(id);
    }


    public List<ChatRoomDTO> convertToChatroomDTO(List<ChatRoom> list){
        List<ChatRoomDTO> results = new ArrayList<>();
        if (list != null){

            for (ChatRoom chat: list ) {
                results.add(new ChatRoomDTO(chat));
            }
        }
        return results;
    }

    public List<MessageDTO> convertToMessageDTO(List<Message> list){
        List<MessageDTO> results = new ArrayList<>();
        if (list != null){
            for (Message message : list){
                results.add(new MessageDTO(message));
            }
        }
        return results;
    }
}
