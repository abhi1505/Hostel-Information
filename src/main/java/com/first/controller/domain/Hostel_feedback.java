package com.first.controller.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by admin on 10/31/2017.
 */
@Entity
public class Hostel_feedback {

    @Id
    private String student_id;
    private String hostel_id;
    private String feedback;




    public Hostel_feedback() {
    }

    public Hostel_feedback(String student_id, String hostel_id, String feedback) {
        this.student_id = student_id;
        this.hostel_id = hostel_id;
        this.feedback = feedback;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(String hostel_id) {
        this.hostel_id = hostel_id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
