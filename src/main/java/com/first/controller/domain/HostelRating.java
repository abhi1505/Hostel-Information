package com.first.controller.domain;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;

/**
 * Created by admin on 10/29/2017.
 */
@javax.persistence.Entity
public class HostelRating {

    @Id
    private String hostel_id;

    private int rate;


    public HostelRating() {
    }

    public HostelRating(String hostel_id, int rate) {
        this.hostel_id = hostel_id;
        this.rate = rate;
    }

    public String getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(String hostel_id) {
        this.hostel_id = hostel_id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
