package com.first.controller.dao.Admin_board;

import com.first.controller.domain.Admin_Board;

/**
 * Created by admin on 10/8/2017.
 */
public interface Boarddao {
    public void insert(Admin_Board a);
    public Admin_Board getdatebyid(int id);
}
