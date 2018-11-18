package com.first.controller.dao.hostelinfo;

import com.first.controller.dao.hostelinfo.HostelInfodao;
import com.first.controller.domain.HostelInfo;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abhilasha on 02-10-2017.
 */
@Repository
public class HostelInfodaoimp implements HostelInfodao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(HostelInfo hostel) {

        sessionFactory.getCurrentSession().saveOrUpdate(hostel);
    }


    @Override
    public HostelInfo getPersonById(String id) {
        Session session = sessionFactory.getCurrentSession();
        HostelInfo p=  (HostelInfo)session.get(HostelInfo.class, new String(id));
        return p;
    }

    @Override
    public HostelInfo update(HostelInfo h) {
        sessionFactory.getCurrentSession().update(h);
        return h;
    }

    @Override
    public List<HostelInfo> getAllhostel() {
        List<HostelInfo> temp=new ArrayList<HostelInfo>();
        temp=sessionFactory.getCurrentSession().createQuery("from HostelInfo").list();
        Iterator<HostelInfo> itr = temp.iterator();
        // remove all even numbers
      /*  while (itr.hasNext()) {
            HostelInfo h = itr.next();
            if (!(h.getFlag_req().equals("New"))) { itr.remove(); }
        }*/



        return temp;
    }

    @Override
    public List<HostelInfo> getAllhostelNew() {
        List<HostelInfo> temp=new ArrayList<HostelInfo>();
        temp=sessionFactory.getCurrentSession().createQuery("from HostelInfo").list();
        Iterator<HostelInfo> itr = temp.iterator();
        // remove all even numbers
        while (itr.hasNext()) {
            HostelInfo h = itr.next();
            if (!(h.getFlag_req().equals("New"))) { itr.remove(); }
        }



        return temp;
    }

    @Override
    public List<HostelInfo> getAllhostelY() {
        List<HostelInfo> temp=new ArrayList<HostelInfo>();
        temp=sessionFactory.getCurrentSession().createQuery("from HostelInfo").list();
        Iterator<HostelInfo> itr = temp.iterator();
        // remove all even numbers
        while (itr.hasNext()) {
            HostelInfo h = itr.next();
            if (!(h.getFlag_req().equals("Yes"))) { itr.remove(); }
}



        return temp;
                }

    @Override
    public List<HostelInfo> getAllhostelN() {
        List<HostelInfo> temp=new ArrayList<HostelInfo>();
        temp=sessionFactory.getCurrentSession().createQuery("from HostelInfo").list();
        Iterator<HostelInfo> itr = temp.iterator();
        // remove all even numbers
        while (itr.hasNext()) {
            HostelInfo h = itr.next();
            if (!(h.getFlag_req().equals("No"))) { itr.remove(); }
        }



        return temp;
    }

    @Override
    public void UpdateFlagY(HostelInfo h) {
        Session session = sessionFactory.getCurrentSession();
        h.setFlag_req("Yes");
        session.update(h);
    }

    @Override
    public void UpdateFlagN(HostelInfo h) {
        Session session = sessionFactory.getCurrentSession();
        h.setFlag_req("No");
        session.update(h);

    }

    @Override
    public void UpdateFlagD(HostelInfo h) {
        Session session = sessionFactory.getCurrentSession();
        h.setFlag_req("delete");
        session.update(h);
    }

}
