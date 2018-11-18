package com.first.controller.service.loginservice;

import com.first.controller.dao.logininfo.LoginDao;
import com.first.controller.domain.LoginInfo;
import com.first.controller.service.loginservice.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by abhilasha on 02-10-2017.
 */
@Service
public class Loginserviceimp implements Loginservice {
    @Autowired
    LoginDao logindao;
    @Override
    @Transactional
    public void insert(LoginInfo lg) {
        logindao.insert(lg);
    }
    @Override
    @Transactional
    public LoginInfo getPersonById(String id) {
        System.out.println(id);
        return logindao.getPersonById(id);
    }
}
