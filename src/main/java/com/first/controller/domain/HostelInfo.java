package com.first.controller.domain;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by abhilasha on 02-10-2017.
 */
@Entity
public class HostelInfo {
    @Id
    private String id;
    private String name;
    private String owner;
    private String street;
    private String area;
    private String land;
    private String contact;
    private int vacancies;
    private String flag_req;


    public HostelInfo() {
    }

    public HostelInfo(String id, String name, String owner, String street, String area, String land, String contact, int vacancies) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.street = street;
        this.area = area;
        this.land = land;
        this.contact = contact;
        this.vacancies=vacancies;
        this.flag_req="New";
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    public String getFlag_req() {
        return flag_req;
    }

    public void setFlag_req(String flag_req) {
        this.flag_req = flag_req;
    }
}
