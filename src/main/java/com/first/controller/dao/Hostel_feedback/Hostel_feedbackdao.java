package com.first.controller.dao.Hostel_feedback;

import com.first.controller.domain.Hostel_feedback;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admin on 10/31/2017.
 */

public interface Hostel_feedbackdao {
    void insert(Hostel_feedback hostel);
    Hostel_feedback getPersonById(String id);
    public List<Hostel_feedback> getAllhostel(String hid);
}
