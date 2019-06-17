package com.megatravel.service;

import com.megatravel.model.Message;
import com.megatravel.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository accomodationRepository;

    public Message findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Message> findAll(){
        return accomodationRepository.findAll();
    }

    public Message save(Message user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
