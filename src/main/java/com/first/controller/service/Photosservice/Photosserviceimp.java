package com.first.controller.service.Photosservice;

import com.first.controller.dao.Photos.Hostel_photosdao;
import com.first.controller.domain.Hostel_Photos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abhilasha on 09-10-2017.
 */
@Service
public class Photosserviceimp implements Photosservice {

    @Autowired
    Hostel_photosdao photosdao;

    @Override
    @Transactional
    public void insert(Hostel_Photos p) {
        photosdao.insert(p);
    }

    @Override
    @Transactional
    public List<Hostel_Photos> getpics(String id) {
        return photosdao.getpics(id);
    }
}
