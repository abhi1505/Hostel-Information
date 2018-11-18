package com.first.controller.service.studentservice;

import com.first.controller.dao.student.Studentdao;
import com.first.controller.domain.HostelInfo;
import com.first.controller.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 8/20/2017.
 */
@Service
public class Studentserviceimp implements Studentservice {
    @Autowired
    private Studentdao hostelDao;
    @Override
    @Transactional
    public void insert(Student student) {
        hostelDao.insert(student);
    }

    @Override
    @Transactional
    public Student getPersonById(String id) {
        System.out.println(id);
        return hostelDao.getPersonById(id);
    }

    @Override
    @Transactional
    public List<HostelInfo> getAllhostel() {
        return hostelDao.getAllhostel();
    }
    /*@Override
    @Transactional
    public List<Student> getAllhostel(){
        return hostelDao.getAllhostel();
    }*/


    @Override
    @Transactional
    public void deleteHostel(String id){
        hostelDao.deleteHostel(id);
    };

    @Override
    @Transactional
    public Student update(Student s){
        return hostelDao.update(s);
    }
}
