package com.first.controller.service.offerservice;

import com.first.controller.dao.offers.OfferDao;
import com.first.controller.domain.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abhilasha on 03-10-2017.
 */
@Service
public class Offerserviceimp implements Offerservice {
    @Autowired
    OfferDao offerdao;
    @Override
    @Transactional
    public void insert(Offer offer) {
        offerdao.insert(offer);
    }

    @Override
    @Transactional
    public List<Offer> getAllhostel() {
        return offerdao.getAllhostel();
    }
}
