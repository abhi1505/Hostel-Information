package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by admin on 10/8/2017.
 */
@Entity
public class Admin_Board {

    @Id
    private int id;
    private String dateofmeet;

    public Admin_Board() {
    }

    public Admin_Board(int id, String dateofmeet) {
        this.id = id;
        this.dateofmeet = dateofmeet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateofmeet() {
        return dateofmeet;
    }

    public void setDateofmeet(String dateofmeet) {
        this.dateofmeet = dateofmeet;
    }
}
