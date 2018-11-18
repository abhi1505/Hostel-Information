package com.first.controller.domain;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by admin on 10/27/2017.
 */
@Entity
public class Student_rate {
    @Id
    private String sid;

    private String hostelid;
    private int rate;
    private String complaint;
    private String flag_comp;

    public Student_rate() {
    }


    public Student_rate(String sid, String hostelid, int rate, String complaint,String flag) {
        this.sid = sid;
        this.hostelid = hostelid;
        this.rate = rate;
        this.complaint = complaint;
        this.flag_comp=flag;
    }


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFlag_comp() {
        return flag_comp;
    }

    public void setFlag_comp(String flag_comp) {
        this.flag_comp = flag_comp;
    }

    public String getHostelid() {
        return hostelid;
    }

    public void setHostelid(String hostelid) {
        this.hostelid = hostelid;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}
