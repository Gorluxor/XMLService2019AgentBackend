package com.megatravel.model;


import com.megatravel.dtos.ImageDTO;

import javax.persistence.*;

@SuppressWarnings("WeakerAccess")
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String title;

    protected String uri;

    @ManyToOne
    protected Image belongsToAccommodation;

    public Image() {
    }

    public Image(ImageDTO imageDTO){
        this.id = imageDTO.getId();
        this.title = imageDTO.getTitle();
        this.uri = imageDTO.getUri();
    }

    public Image(String title, String uri) {
        this.title = title;
        this.uri = uri;
    }

    public Image getBelongsToAccommodation() {
        return belongsToAccommodation;
    }

    public void setBelongsToAccommodation(Image belongsToAccommodation) {
        this.belongsToAccommodation = belongsToAccommodation;
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
