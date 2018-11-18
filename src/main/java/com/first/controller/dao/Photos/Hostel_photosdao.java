package com.first.controller.dao.Photos;

import com.first.controller.domain.Hostel_Photos;

import java.util.List;

/**
 * Created by abhilasha on 09-10-2017.
 */
public interface Hostel_photosdao {
    void insert(Hostel_Photos p);
    List<Hostel_Photos> getpics(String id);
}
