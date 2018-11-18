package com.first.controller.dao.hostelinfo;

import com.first.controller.domain.HostelInfo;

import java.util.List;

/**
 * Created by abhilasha on 02-10-2017.
 */
public interface HostelInfodao {
    void insert(HostelInfo hostel);
    HostelInfo getPersonById(String id);
    public List<HostelInfo> getAllhostel();
    public List<HostelInfo> getAllhostelNew();
    public List<HostelInfo> getAllhostelY();
    public List<HostelInfo> getAllhostelN();
    HostelInfo update(HostelInfo h);
    public void UpdateFlagY(HostelInfo h);
    public void UpdateFlagN(HostelInfo h);
    public void UpdateFlagD(HostelInfo h);
}
