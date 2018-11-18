package com.first.controller.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by abhilasha on 09-10-2017.
 */
@Entity
@IdClass(MyKey.class)
public class Hostel_Photos {
    @Id
    private String id;
    @Id
    private String photoid;

    private String name;

    public Hostel_Photos() {
    }

    public Hostel_Photos(String id, String photoid, String name) {
        this.id = id;
        this.photoid = photoid;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoid() {
        return photoid;
    }

    public void setPhotoid(String photoid) {
        this.photoid = photoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
