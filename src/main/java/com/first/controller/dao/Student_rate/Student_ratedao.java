package com.first.controller.dao.Student_rate;

import com.first.controller.domain.Student_rate;

import java.util.List;

/**
 * Created by admin on 10/27/2017.
 */
public interface Student_ratedao {
    void insert(Student_rate sr);
    Student_rate getPersonById(String id);
    public List<Student_rate> getAllhostel(String id);
}
