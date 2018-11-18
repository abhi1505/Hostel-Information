package com.first.controller;

import com.first.controller.domain.Sitefeedback;
import com.first.controller.service.sitefeedbackservice.Sitefeedbackservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by abhilasha on 06-10-2017.
 */
@Controller
public class HomeController {
    @Autowired
    Sitefeedbackservice sitefeedbackservice;
    ///////////////////Homepage
    @RequestMapping(value = "/")
    public String homu(){
        return "Home";
    }


    ///////////signup
    @RequestMapping(value="/Signupreq1")
    public String add1()
    {
        return "Signup";
    }

    @RequestMapping(value="/Signupreq2")
    public String add2()
    {
        return "Signup_hostel";
    }

    /////////login
    @RequestMapping(value="/Loginreq")
    public String sign(HttpServletRequest request, HttpServletResponse response)
    {
        return "Login";
    }




    //////////////////////about us
    @RequestMapping(value="/aboutus")
    public String Aboutus()
    {
        return "Aboutus";
    }


    ///////////sitefeedback
    @RequestMapping(value="/Feedbackreq")
    public String feedback()
    {
        return "Sitefeedback";
    }

    @RequestMapping(value="/Sendfeedback", method = RequestMethod.POST)
    public String sendfeedback(HttpServletRequest request,HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        String email=request.getParameter("email");
        String feed=request.getParameter("feedback");
        if(!(email.equals("") || feed.equals(""))) {
            sitefeedbackservice.insert(new Sitefeedback(email, feed));
            session.setAttribute("feederror", "no");
        }
        else
            session.setAttribute("feederror", "yes");
        return "Home";
    }
}
