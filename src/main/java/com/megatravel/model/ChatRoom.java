package com.megatravel.model;

import com.megatravel.dtos.ChatRoomDTO;

import javax.persistence.*;

@SuppressWarnings("WeakerAccess")
@Entity
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected String name;

    @ManyToOne
    protected Reservation reservation;

    public ChatRoom() {
    }

    public  ChatRoom(ChatRoomDTO chatRoomDTO){
        this.id = chatRoomDTO.getId();
        this.name = chatRoomDTO.getName();
        this.reservation = chatRoomDTO.getReservationDTO() == null ? null : new Reservation(chatRoomDTO.getReservationDTO());
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
