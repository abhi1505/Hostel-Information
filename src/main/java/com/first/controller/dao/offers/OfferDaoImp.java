package com.first.controller.dao.offers;

import com.first.controller.domain.Offer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abhilasha on 03-10-2017.
 */
@Repository
public class OfferDaoImp implements OfferDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void insert(Offer lg) {
        sessionFactory.getCurrentSession().saveOrUpdate(lg);

    }

    @Override
    public List<Offer> getAllhostel() {

        List<Offer> temp=new ArrayList<Offer>();
        temp=sessionFactory.getCurrentSession().createQuery("from Offer").list();
        Iterator<Offer> itr = temp.iterator();
        // remove all even numbers



        return temp;
    }
}
