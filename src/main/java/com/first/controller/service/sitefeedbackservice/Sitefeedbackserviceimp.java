package com.first.controller.service.sitefeedbackservice;

import com.first.controller.dao.sitefeedback.Sitefeedbackdao;
import com.first.controller.domain.Sitefeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abhilasha on 06-10-2017.
 */
@Service
public class Sitefeedbackserviceimp implements Sitefeedbackservice {
    @Autowired
    Sitefeedbackdao sitefeedbackdao;
    @Override
    @Transactional
    public void insert(Sitefeedback s) {
        sitefeedbackdao.insert(s);
    }

    @Override
    @Transactional
    public List<Sitefeedback> getAllfeedback() {
        return sitefeedbackdao.getAllfeedback();
    }
}
