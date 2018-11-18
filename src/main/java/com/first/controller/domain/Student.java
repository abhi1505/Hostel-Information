package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by abhilasha on 20-08-2017.
 */

@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String hostel_admit;



    public Student() {
    }
    public Student(Student h) {
        this.id = h.id;
        this.name = h.name;
        this.address = h.address;
        this.contact = h.contact;
        this.hostel_admit=h.hostel_admit;

    }

    public Student(String id, String name, String address, String contact,String hostel_admit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.hostel_admit=hostel_admit;

    }

    public String getHostel_admit() {
        return hostel_admit;
    }

    public void setHostel_admit(String hostel_admit) {
        this.hostel_admit = hostel_admit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


}