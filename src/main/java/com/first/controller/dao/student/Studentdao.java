package com.first.controller.dao.student;

import com.first.controller.domain.HostelInfo;
import com.first.controller.domain.Student;

import java.util.List;

/**
 * Created by admin on 8/20/2017.
 */
public interface Studentdao {
    void insert(Student student);
    public Student getPersonById(String id);
    //public  List<HostelInfo> getAllhostel();
    public List<HostelInfo> getAllhostel();
    public Student update(Student s);
    public void deleteHostel(String id);
}
