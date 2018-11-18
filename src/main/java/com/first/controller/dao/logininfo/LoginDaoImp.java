package com.first.controller.dao.logininfo;

import com.first.controller.dao.logininfo.LoginDao;
import com.first.controller.domain.LoginInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by abhilasha on 02-10-2017.
 */
@Repository
public class LoginDaoImp implements LoginDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void insert(LoginInfo lg) {
        sessionFactory.getCurrentSession().saveOrUpdate(lg);

    }

    @Override
    public LoginInfo getPersonById(String id) {
        Session session = sessionFactory.getCurrentSession();
        LoginInfo p=  (LoginInfo) session.get(LoginInfo.class, new String(id));
        //   logger.info(com.first.controller.domain.Student loaded successfully, com.first.controller.domain.Student details="+p);
        // System.out.println(id+" yo");
        return p;
    }
}
