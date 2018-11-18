package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by abhilasha on 06-10-2017.
 */
@Entity
public class Sitefeedback {
    @Id
    private String email;
    private String feedback;

    public Sitefeedback() {
    }

    public Sitefeedback(String email, String feedback) {
        this.email = email;
        this.feedback = feedback;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
