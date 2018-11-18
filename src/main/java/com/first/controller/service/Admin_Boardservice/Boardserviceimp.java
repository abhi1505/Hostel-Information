package com.first.controller.service.Admin_Boardservice;

import com.first.controller.dao.Admin_board.Boarddao;
import com.first.controller.domain.Admin_Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 10/8/2017.
 */
@Service
public class Boardserviceimp implements Boardservice {

@Autowired
private Boarddao boarddao;
    @Override
    @Transactional
    public void insert(Admin_Board a) {
boarddao.insert(a);
    }

    @Override
    @Transactional
    public Admin_Board getdatebyid(int id) {
        System.out.println(id+"yahaphu");
        return boarddao.getdatebyid(id);
    }
}
