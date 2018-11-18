package com.first.controller.service.appointmentservice;

import com.first.controller.dao.appointment.Appointmentdao;
import com.first.controller.domain.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.List;

/**
 * Created by abhilasha on 08-10-2017.
 */
@Service
public class appointmentserviceimp implements appointmentservice {
    @Autowired
    Appointmentdao appdao;
    @Override
    @Transactional
    public void insert(Appointment p) {
        appdao.insert(p);
    }

    @Override
    @Transactional
    public Appointment getappointments(String id) {
        return appdao.getappointments(id);
    }

    @Override
    @Transactional
    public List<Appointment> getAll() throws ParseException {
        return appdao.getAll();
    }
}
