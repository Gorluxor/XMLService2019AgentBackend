//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 02:37:09 AM CEST 
//


package com.megatravel.model;

import com.megatravel.dtos.ChatRoomDTO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@SuppressWarnings("WeakerAccess")
@Entity
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String name;

    protected Date lastChangedDate;

    @ManyToOne
    protected Reservation reservation;

    public ChatRoom() {
        this.lastChangedDate = new Date();
    }

    public ChatRoom(ChatRoomDTO chatRoomDTO) {
        this.id = chatRoomDTO.getId();
        this.name = chatRoomDTO.getName();
        this.reservation = chatRoomDTO.getReservationDTO() == null ? null : new Reservation(chatRoomDTO.getReservationDTO());
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public ChatRoom(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }


    public void setId(long value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation value) {
        this.reservation = value;
    }

}
