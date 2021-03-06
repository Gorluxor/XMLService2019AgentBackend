//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 02:37:09 AM CEST 
//


package com.megatravel.model;

import com.megatravel.dtos.MessageDTO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




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

    protected Date lastChangedDate;

    public Message() {
        this.lastChangedDate = new Date();
    }

    public Message(String msg) {
        this.msg = msg;
        this.timeStamp = new Date();
    }

    public Message(MessageDTO messageDTO) {
        this.msg = messageDTO.getMsg();
        this.chatRoom = messageDTO.getChatRoomDTO() == null ? null : new ChatRoom(messageDTO.getChatRoomDTO());
        this.receiver = new User(messageDTO.getReceiver());
        this.sender = new User(messageDTO.getSender());
        this.lastChangedDate = messageDTO.getLastChangedDate();
        this.timeStamp = messageDTO.getTimeStamp();
        this.id = messageDTO.getId();
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

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }
}
