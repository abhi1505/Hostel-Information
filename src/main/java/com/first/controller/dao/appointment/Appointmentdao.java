package com.first.controller.dao.appointment;

import com.first.controller.domain.Appointment;

import java.text.ParseException;
import java.util.List;

/**
 * Created by abhilasha on 08-10-2017.
 */
public interface Appointmentdao {
    void insert(Appointment p);
    Appointment getappointments(String id);
    List<Appointment> getAll() throws ParseException;
}
