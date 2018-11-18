package com.first.controller.dao.Photos;

import com.first.controller.domain.Hostel_Photos;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abhilasha on 09-10-2017.
 */
@Repository
public class Hostel_photosdaoimp implements Hostel_photosdao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Hostel_Photos p) {
        sessionFactory.getCurrentSession().saveOrUpdate(p);
    }

    @Override
    public List<Hostel_Photos> getpics(String id) {
        List<Hostel_Photos> temp=new ArrayList<Hostel_Photos>();
        temp=sessionFactory.getCurrentSession().createQuery("from Hostel_Photos").list();

        Iterator<Hostel_Photos> it=temp.iterator();
        while(it.hasNext()){
            Hostel_Photos h=it.next();
            if(!(h.getId().equals(id))){it.remove();
            }
        }






        return temp;
    }
}
