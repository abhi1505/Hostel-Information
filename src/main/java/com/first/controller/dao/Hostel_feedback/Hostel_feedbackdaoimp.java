package com.first.controller.dao.Hostel_feedback;

import com.first.controller.domain.Hostel_feedback;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 10/31/2017.
 */
@Repository
public class Hostel_feedbackdaoimp implements Hostel_feedbackdao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Hostel_feedback hostel) {
        sessionFactory.getCurrentSession().saveOrUpdate(hostel);
    }

    @Override
    public Hostel_feedback getPersonById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Hostel_feedback p=  (Hostel_feedback) session.get(Hostel_feedback.class, new String(id));
        return p;
    }

    @Override
    public List<Hostel_feedback> getAllhostel(String hid) {
        List<Hostel_feedback> temp=new ArrayList<Hostel_feedback>();
        temp=sessionFactory.getCurrentSession().createQuery("from Hostel_feedback").list();

        Iterator<Hostel_feedback> it=temp.iterator();
        while(it.hasNext()){
            Hostel_feedback h=it.next();
            if(!(h.getHostel_id().equals(hid))){it.remove();}
        }


        return temp;
    }
}
