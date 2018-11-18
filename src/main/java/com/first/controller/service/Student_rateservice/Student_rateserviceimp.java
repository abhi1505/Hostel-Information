package com.first.controller.service.Student_rateservice;

import com.first.controller.dao.Student_rate.Student_ratedao;
import com.first.controller.domain.Student_rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 10/27/2017.
 */
public class Student_rateserviceimp implements Student_rateservice {
    @Autowired
    private Student_ratedao studentratedao;

    @Override
    @Transactional
    public void insert(Student_rate sr) {
        studentratedao.insert(sr);
    }

    @Override
    @Transactional
    public Student_rate getPersonById(String id) {
        return studentratedao.getPersonById(id);
    }

    @Override
    @Transactional
    public List<Student_rate> getAllhostel(String id) {
        return studentratedao.getAllhostel(id);
    }
}
