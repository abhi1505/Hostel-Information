package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by abhilasha on 02-10-2017.
 */
@Entity
public class LoginInfo {
    @Id
    private String id;
    private String type_hs;
    private String password;
    public LoginInfo() {
    }

    public LoginInfo(String id, String type_hs, String password) {
        this.id = id;
        this.type_hs = type_hs;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType_hs() {
        return type_hs;
    }

    public void setType_hs(String type_hs) {
        this.type_hs = type_hs;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
