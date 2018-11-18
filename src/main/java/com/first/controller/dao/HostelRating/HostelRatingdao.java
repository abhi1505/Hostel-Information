package com.first.controller.dao.HostelRating;

import com.first.controller.domain.HostelRating;

/**
 * Created by admin on 10/29/2017.
 */
public interface HostelRatingdao {

    void insert(HostelRating hr);
    HostelRating getPersonById(String id);
}
