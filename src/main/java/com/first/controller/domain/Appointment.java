package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by abhilasha on 08-10-2017.
 */
@Entity
public class Appointment {
    @Id
    private String id;
    private String description;
    private Date date;

    public Appointment() {
    }

    public Appointment(String id, String description, Date date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
