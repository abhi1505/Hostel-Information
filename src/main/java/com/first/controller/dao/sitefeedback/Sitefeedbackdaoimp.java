package com.first.controller.dao.sitefeedback;

import com.first.controller.domain.Sitefeedback;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abhilasha on 06-10-2017.
 */
@Repository
public class Sitefeedbackdaoimp implements Sitefeedbackdao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void insert(Sitefeedback s) {
        sessionFactory.getCurrentSession().saveOrUpdate(s);
    }

    @Override
    public List<Sitefeedback> getAllfeedback() {
        List<Sitefeedback> temp=new ArrayList<Sitefeedback>();
        temp=sessionFactory.getCurrentSession().createQuery("from Sitefeedback").list();
        return temp;
    }
}
