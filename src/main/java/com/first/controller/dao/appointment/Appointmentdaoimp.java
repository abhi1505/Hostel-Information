package com.first.controller.dao.appointment;

import com.first.controller.domain.Appointment;
import com.first.controller.domain.HostelInfo;
import javafx.beans.binding.When;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by abhilasha on 08-10-2017.
 */
@Repository
public class Appointmentdaoimp implements Appointmentdao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Appointment hostel) {
        sessionFactory.getCurrentSession().saveOrUpdate(hostel);
    }

    @Override
    public Appointment getappointments(String id) {
        Session session = sessionFactory.getCurrentSession();
        Appointment p=  (Appointment) session.get(Appointment.class, new String(id));
        //   logger.info(com.first.controller.domain.Student loaded successfully, com.first.controller.domain.Student details="+p);
        // System.out.println(id+" yo");
        return p;
    }

    @Override
    public List<Appointment> getAll() throws ParseException {
        List<Appointment> temp=new ArrayList<Appointment>();
        temp=sessionFactory.getCurrentSession().createQuery("from Appointment").list();


       ListIterator<Appointment> i= (ListIterator<Appointment>) temp.listIterator();
        while (i.hasNext())
        {
            Appointment p=i.next();
            DateFormat outputFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String output = outputFormatter.format(p.getDate());
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(output);
            p.setDate(date1);
            i.set(p);
            Date date = new Date();
            if(p.getDate().compareTo(date)<0)
                i.remove();
        }
        return temp;
    }


}
