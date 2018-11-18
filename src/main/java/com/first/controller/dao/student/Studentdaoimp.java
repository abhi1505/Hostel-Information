package com.first.controller.dao.student;

import com.first.controller.domain.HostelInfo;
import com.first.controller.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 8/20/2017.
 */
@Repository
public class Studentdaoimp implements Studentdao {
   /* @Override
    @SuppressWarnings("unchecked")
    public List<Student> getAllhostel(){
        List<Student> temp=new ArrayList<Student>();
        temp=sessionFactory.getCurrentSession().createQuery("from Student").list();

       /*for(Student h:temp)
        {
            if(h.getType_hs().equals("Student"))
            {
                System.out.println(new ArrayList<Student>(temp));
                temp.remove(new Student(h));
                System.out.println(new ArrayList<Student>(temp));
            }

        }
        Iterator<Student> itr = temp.iterator();
        // remove all even numbers
        while (itr.hasNext()) {
            Student h = itr.next();
        if (h.getType_hs().equals("Student")) { itr.remove(); }
        }



        return temp;
    }*/

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
    }

    @Override
    public Student getPersonById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Student p=  (Student)session.get(Student.class, new String(id));
        //   logger.info(com.first.controller.domain.Student loaded successfully, com.first.controller.domain.Student details="+p);
        // System.out.println(id+" yo");
        return p;
    }

    @Override
    public List<HostelInfo> getAllhostel() {
        List<HostelInfo> temp=new ArrayList<HostelInfo>();
        temp=sessionFactory.getCurrentSession().createQuery("from HostelInfo").list();
        Iterator<HostelInfo> itr = temp.iterator();
        while (itr.hasNext()) {
            HostelInfo h = itr.next();
            if (!(h.getFlag_req().equals("Yes"))) { itr.remove(); }
        }
      //  System.out.print(temp);
        return temp;
    }

    @Override
    public void deleteHostel(String id){
      //  System.out.println(id);
        Student h= (Student) sessionFactory.getCurrentSession().get(Student.class, id);
        System.out.println(h);
        if (null != h) {
      //      System.out.println("yo");
            this.sessionFactory.getCurrentSession().delete(h);
        }
    }
    //@Override
    /*public List getAllPerson() {
        Session session = sessionFactory.getCurrentSession();
        List employees = session.createQuery("FROM student").list();
        return p;
    }*/
    @Override
    public Student update(Student h) {
        sessionFactory.getCurrentSession().update(h);
        return h;
    }
}
