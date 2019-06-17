package com.megatravel.model;

import com.megatravel.dtos.MessageDTO;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String msg;

    protected Date timeStamp;

    @ManyToOne
    protected User sender;

    @ManyToOne
    protected User receiver;

    @ManyToOne
    protected ChatRoom chatRoom;


    public Message() {
    }

    public Message(String msg) {
        this.msg = msg;
        this.timeStamp = new Date();
    }

    public Message(MessageDTO messageDTO){
        this.msg = messageDTO.getMsg();
        this.id = messageDTO.getId();
        this.chatRoom = new ChatRoom(messageDTO.getChatRoomDTO());
        this.receiver = new User(messageDTO.getReceiver());
        this.sender = new User(messageDTO.getSender());

    }


    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String value) {
        this.msg = value;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date value) {
        this.timeStamp = value;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User value) {
        this.sender = value;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User value) {
        this.receiver = value;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom value) {
        this.chatRoom = value;
    }

}
