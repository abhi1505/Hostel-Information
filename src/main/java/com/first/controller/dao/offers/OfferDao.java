package com.first.controller.dao.offers;

import com.first.controller.domain.Offer;

import java.util.List;

/**
 * Created by abhilasha on 03-10-2017.
 */
public interface OfferDao {
    public void insert(Offer offer);

    public List<Offer> getAllhostel();
}
