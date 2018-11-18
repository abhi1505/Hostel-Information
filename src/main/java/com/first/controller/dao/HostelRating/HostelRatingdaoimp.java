package com.first.controller.dao.HostelRating;

import com.first.controller.domain.HostelRating;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 10/29/2017.
 */
@Repository
public class HostelRatingdaoimp implements HostelRatingdao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(HostelRating hr) {
        sessionFactory.getCurrentSession().saveOrUpdate(hr);
    }

    @Override
    public HostelRating getPersonById(String id) {
        Session session = sessionFactory.getCurrentSession();
        HostelRating p=  (HostelRating)session.get(HostelRating.class, new String(id));
        //   logger.info(com.first.controller.domain.Student loaded successfully, com.first.controller.domain.Student details="+p);
        // System.out.println(id+" yo");
        return p;
    }
}
