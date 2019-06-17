package com.megatravel.dtos;


import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.megatravel.model.Message;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.megatravel.com/types}id"/>
 *         &lt;element name="Msg" type="{http://www.megatravel.com/types}msg"/>
 *         &lt;element name="TimeStamp" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element ref="{http://www.megatravel.com/admin}userDTO"/>
 *         &lt;element ref="{http://www.megatravel.com/admin}userDTO"/>
 *         &lt;element ref="{http://www.megatravel.com/messages}chatRoomDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "msg",
        "timeStamp",
        "sender",
        "receiver",
        "chatRoomDTO"
})
@XmlRootElement(name = "messageDTO")
public class MessageDTO {

    protected long id;
    @XmlElement(name = "Msg", required = true)
    protected String msg;
    @XmlElement(name = "TimeStamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date timeStamp;
    @XmlElement(name = "userDTO", namespace = "http://www.megatravel.com/admin", required = true)
    protected UserDTO sender;
    @XmlElement(name = "userDTO", namespace = "http://www.megatravel.com/admin", required = true)
    protected UserDTO receiver;
    @XmlElement(required = true)
    protected ChatRoomDTO chatRoomDTO;


    public MessageDTO() {
    }

    public MessageDTO(Message message) {
        this.id = message.getId();
        this.msg = message.getMsg();
        this.timeStamp = message.getTimeStamp();
        this.sender = new UserDTO(message.getSender());
        this.receiver = new UserDTO(message.getReceiver());
        this.chatRoomDTO = new ChatRoomDTO(message.getChatRoom());
    }

    /**
     * Gets the value of the id property.
     *
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the msg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Gets the value of the timeStamp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeStamp(Date value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the sender property.
     *
     * @return
     *     possible object is
     *     {@link UserDTO }
     *
     */
    public UserDTO getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     *
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *
     */
    public void setSender(UserDTO value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     *
     * @return
     *     possible object is
     *     {@link UserDTO }
     *
     */
    public UserDTO getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     *
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *
     */
    public void setReceiver(UserDTO value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the chatRoomDTO property.
     *
     * @return
     *     possible object is
     *     {@link ChatRoomDTO }
     *
     */
    public ChatRoomDTO getChatRoomDTO() {
        return chatRoomDTO;
    }

    /**
     * Sets the value of the chatRoomDTO property.
     *
     * @param value
     *     allowed object is
     *     {@link ChatRoomDTO }
     *
     */
    public void setChatRoomDTO(ChatRoomDTO value) {
        this.chatRoomDTO = value;
    }

}
