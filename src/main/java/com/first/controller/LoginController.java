package com.first.controller;

import com.first.controller.domain.*;
import com.first.controller.service.Admin_Boardservice.Boardservice;
import com.first.controller.service.HostelRatingservice.Hostelratingservice;
import com.first.controller.service.Student_rateservice.Student_rateservice;
import com.first.controller.service.hostelinfoservice.HostelInfoservice;
import com.first.controller.service.studentservice.Studentservice;
import com.first.controller.service.loginservice.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by abhilasha on 02-10-2017.
 */
@Controller
public class LoginController{
    @Autowired
    private Loginservice loginservice;
    @Autowired
    private HostelInfoservice hostelinfoservice;
    @Autowired
    private Studentservice hostelService;

    @Autowired
    private Student_rateservice studentrateservice;

    @Autowired
    private Hostelratingservice hostelratingservice;




    @RequestMapping(value="/DoSignup",method= RequestMethod.POST)
    public String signin(HttpServletRequest request,HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        String id=request.getParameter("unam");
        String name=request.getParameter("nam");
        String addr=request.getParameter("addr");
        String cont=request.getParameter("cont");
        String type_hs=request.getParameter("type_hs");
        String pass=request.getParameter("pass");
        String hostel_admit=request.getParameter("hostel_admit");




        LoginInfo l=loginservice.getPersonById(id);
        if(l==null) {
            if (type_hs.equals("Student")) {
                hostelService.insert(new Student(id, name, addr, cont, hostel_admit));
                if(!(hostel_admit.equals("")))
                studentrateservice.insert(new Student_rate(id,hostel_admit,0,"",""));



            }
            loginservice.insert(new LoginInfo(id, type_hs, pass));
            System.out.println(id);

            return "Login";
        }
        else
            session.setAttribute("loginerror","yes");
        return "Signup";

    }




    @RequestMapping(value="/Logout")
    public String logout(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        session.setAttribute("user",null);

        session.setAttribute("offer",null);

        session.setAttribute("vacancy",null);

        session.setAttribute("vacancies", null);
        session.setAttribute("loginerror", null);
        session.setAttribute("feederror", null);
        return "Login";
    }

    @Autowired
    private Boardservice boardservice;
    @RequestMapping(value="/DoSignin",method= RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("email");
        String pass = request.getParameter("password");
        HttpSession session = request.getSession();
        LoginInfo h = loginservice.getPersonById(id);
        HostelInfo hi = hostelinfoservice.getPersonById(id);
        Student hos=hostelService.getPersonById(id);
        if (id == null || pass == null || id.equals("") || pass.equals("")) {
            return new ModelAndView("sorry");
        }
        if (id.equals("admin") && pass.equals("admin")) {
            return new ModelAndView("Adminhome");
        }
        if (h.getPassword().equals(pass) && h.getType_hs().equals("Student")) {
            session.setAttribute("user", id);
            session.setAttribute("username",hos.getName());
            return new ModelAndView("Student");


        }
        if (h.getType_hs().equals("Hostel")) {
            if (h.getPassword().equals(pass) && hi == null) {
                session.setAttribute("user", id);
                return new ModelAndView("HostelPhotos");
            }


            if (h.getPassword().equals(pass) && hi != null) {
                Admin_Board a = (Admin_Board) boardservice.getdatebyid(1);
                HostelRating hr=hostelratingservice.getPersonById(id);
                ModelAndView model = new ModelAndView("Hostel1");
                model.addObject("rating",hr.getRate());
                if (a != null) {
                    String datu = a.getDateofmeet();
                    model.addObject("datu", datu);
                }
                session.setAttribute("user", id);
                return model;
            }


        }

        return new ModelAndView("sorry");
    }

}

