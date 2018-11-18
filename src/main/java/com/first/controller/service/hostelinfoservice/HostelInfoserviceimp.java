package com.first.controller.service.hostelinfoservice;

import com.first.controller.dao.hostelinfo.HostelInfodao;
import com.first.controller.domain.HostelInfo;
import com.first.controller.service.hostelinfoservice.HostelInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abhilasha on 02-10-2017.
 */
public class HostelInfoserviceimp implements HostelInfoservice {
    @Autowired
    private HostelInfodao hostelinfodao;

    @Override
    @Transactional
    public void insert(HostelInfo hostel) {
        hostelinfodao.insert(hostel);
    }

    @Override
    @Transactional
    public HostelInfo getPersonById(String id) {
        return hostelinfodao.getPersonById(id);
    }

    @Override
    @Transactional
    public List<HostelInfo> getAllhostel() {
        return hostelinfodao.getAllhostel();
    }

    @Override
    @Transactional
    public List<HostelInfo> getAllhostelNew() {
        return hostelinfodao.getAllhostelNew();
    }

    @Override
    @Transactional
    public List<HostelInfo> getAllhostelY() {
        return hostelinfodao.getAllhostelY();
    }

    @Override
    @Transactional
    public List<HostelInfo> getAllhostelN() {
        return hostelinfodao.getAllhostelN();
    }

    @Override
    @Transactional
    public HostelInfo update(HostelInfo h) {
        return hostelinfodao.update(h);
    }

    @Override
    @Transactional
    public void UpdateFlagY(HostelInfo h) {
        hostelinfodao.UpdateFlagY(h);
    }

    @Override
    @Transactional
    public void UpdateFlagN(HostelInfo h) {
        hostelinfodao.UpdateFlagN(h);
    }

    @Override
    @Transactional
    public void UpdateFlagD(HostelInfo h) {
        hostelinfodao.UpdateFlagD(h);
    }
}


