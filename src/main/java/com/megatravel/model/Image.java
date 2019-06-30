//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 02:37:11 AM CEST 
//


package com.megatravel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.megatravel.agent.ImageDTO;



@SuppressWarnings("WeakerAccess")
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String title;

    protected String uri;

    @ManyToOne
    protected AccommodationUnit belongsToAccommodationUnit;

    protected Date lastChangedDate;


    public Image() {
        this.lastChangedDate = new Date();
    }

    public Image(ImageDTO imageDTO){
        this.id = imageDTO.getId();
        this.title = imageDTO.getTitle();
        this.uri = imageDTO.getUri();
        this.lastChangedDate = new Date();
    }

    public Image(String title, String uri) {
        this.title = title;
        this.uri = uri;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public AccommodationUnit getBelongsToAccommodationUnit() {
        return belongsToAccommodationUnit;
    }

    public void setBelongsToAccommodationUnit(AccommodationUnit belongsToAccommodationUnit) {
        this.belongsToAccommodationUnit = belongsToAccommodationUnit;
    }

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String value) {
        this.title = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }

}
