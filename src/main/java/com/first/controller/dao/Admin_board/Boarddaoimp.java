package com.first.controller.dao.Admin_board;

import com.first.controller.domain.Admin_Board;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 10/8/2017.
 */
@Repository
public class Boarddaoimp implements Boarddao{



    @Autowired
    private SessionFactory sessionFactory;


    public void insert(Admin_Board a){
        sessionFactory.getCurrentSession().saveOrUpdate(a);

    }

    public Admin_Board getdatebyid(int id){

        Session session = sessionFactory.getCurrentSession();
        System.out.println(id+"aagaya");
        Admin_Board p=  (Admin_Board) session.get(Admin_Board.class, id);
        System.out.println(id+" "+p.getDateofmeet());
        //   logger.info(com.first.controller.domain.Student loaded successfully, com.first.controller.domain.Student details="+p);
        // System.out.println(id+" yo");
        return p;





    }
}
