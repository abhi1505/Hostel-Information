package com.first.controller.dao.Student_rate;

import com.first.controller.domain.HostelInfo;
import com.first.controller.domain.Student_rate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 10/27/2017.
 */
@Repository
public class Student_ratedaoimp implements Student_ratedao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Student_rate sr) {
        sessionFactory.getCurrentSession().saveOrUpdate(sr);
    }

    @Override
    public Student_rate getPersonById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Student_rate p=  (Student_rate) session.get(Student_rate.class, new String(id));
        //   logger.info(com.first.controller.domain.Student loaded successfully, com.first.controller.domain.Student details="+p);
        // System.out.println(id+" yo");
        return p;
    }

    @Override
    public List<Student_rate> getAllhostel( String id) {
        List<Student_rate> temp=new ArrayList<Student_rate>();
        temp=sessionFactory.getCurrentSession().createQuery("from Student_rate").list();
        Iterator<Student_rate> itr = temp.iterator();

        while (itr.hasNext()) {
            Student_rate h = itr.next();
            if (!(h.getHostelid().equals(id))) { itr.remove(); }
        }



        return temp;
    }
}
