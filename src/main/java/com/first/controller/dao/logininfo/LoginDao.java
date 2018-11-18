package com.first.controller.dao.logininfo;

import com.first.controller.domain.LoginInfo;

/**
 * Created by abhilasha on 02-10-2017.
 */
public interface LoginDao {
    void insert(LoginInfo lg);
    public LoginInfo getPersonById(String id);
}
