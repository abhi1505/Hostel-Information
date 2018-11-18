package com.first.controller.service.Hostel_feedbackservice;

import com.first.controller.dao.Hostel_feedback.Hostel_feedbackdao;
import com.first.controller.domain.Hostel_feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 10/31/2017.
 */
@Service
public class Hostel_feedbackserviceimp implements Hostel_feedbackservice {


    @Autowired
    private Hostel_feedbackdao hostelfeedbackdao;

    @Override
    @Transactional
    public void insert(Hostel_feedback hostel) {
        hostelfeedbackdao.insert(hostel);
    }

    @Override
    @Transactional
    public Hostel_feedback getPersonById(String id) {
        return hostelfeedbackdao.getPersonById(id);
    }

    @Override
    @Transactional
    public List<Hostel_feedback> getAllhostel(String hid) {
        return hostelfeedbackdao.getAllhostel(hid);
    }
}
