package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by abhilasha on 03-10-2017.
 */
@Entity
public class Offer {
    @Id
    private String id;
    private String offer;
    private Date expiry;

    public Offer() {
    }

    public Offer(String id, String offer, Date expiry) {
        this.id = id;
        this.offer = offer;
        this.expiry = expiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
