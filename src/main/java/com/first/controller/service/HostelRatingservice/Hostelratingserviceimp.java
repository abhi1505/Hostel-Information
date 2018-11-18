package com.first.controller.service.HostelRatingservice;

import com.first.controller.dao.HostelRating.HostelRatingdao;
import com.first.controller.domain.HostelRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 10/29/2017.
 */
@Service
public class Hostelratingserviceimp implements Hostelratingservice {

    @Autowired
    private HostelRatingdao hostelratingdao;

    @Override
    @Transactional
    public void insert(HostelRating hr) {
        hostelratingdao.insert(hr);
    }

    @Override
    @Transactional
    public HostelRating getPersonById(String id) {
        return hostelratingdao.getPersonById(id);
    }
}
