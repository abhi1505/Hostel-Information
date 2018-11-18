package com.first.controller;

import com.first.controller.domain.*;
import com.first.controller.service.Admin_Boardservice.Boardservice;
import com.first.controller.service.appointmentservice.appointmentservice;
import com.first.controller.service.hostelinfoservice.HostelInfoservice;
import com.first.controller.service.studentservice.Studentservice;
import com.first.controller.service.offerservice.Offerservice;
import com.first.controller.service.sitefeedbackservice.Sitefeedbackservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
public class AdminController {

    @RequestMapping(value="/option")
    public String option()
    {
        return "Admin_option_navigation";
    }
    //Changes

    @Autowired
    private Studentservice hostelService;

    @Autowired
    private HostelInfoservice hostelinfoservice;

    @Autowired
    private Sitefeedbackservice sitefeedbackservice;


    @RequestMapping(value="/newreq")
    public ModelAndView getdata() {
        List<HostelInfo> temp=hostelinfoservice.getAllhostel();
        Iterator<HostelInfo> itr=temp.iterator();
        while (itr.hasNext()) {
            HostelInfo h = itr.next();
            if (!(h.getFlag_req().equals("New"))) { itr.remove(); }
        }
        ModelAndView model = new ModelAndView("Admin_addHostel");
        model.addObject("lists", temp);

        return model;

    }


    @RequestMapping(value="/delreq")
    public ModelAndView delreq() {
        List<HostelInfo> temp=hostelinfoservice.getAllhostelY();

        ModelAndView model = new ModelAndView("Admin_deleteHostel");
        model.addObject("lists", temp);

        return model;

    }







//new request admin
@RequestMapping(value="/updatenewrequest_admin",method= RequestMethod.POST)
public String newreqrefresh(HttpServletRequest request,HttpServletResponse response) throws IOException {

    String type_flag=request.getParameter("type_flag");
        List<HostelInfo> temp=null;
        if(type_flag.equals("New")){
            temp=hostelinfoservice.getAllhostelNew();
        }
        else{
            temp=hostelinfoservice.getAllhostelN();
        }
    Iterator<HostelInfo> itr=temp.iterator();
    while(itr.hasNext()){
        HostelInfo h=itr.next();
        //System.out.println(request.getParameter(h.getId()));


        if(request.getParameter(h.getId())==null){
            hostelinfoservice.UpdateFlagN(h);
            System.out.println(h.getId());

        }
        else{
            hostelinfoservice.UpdateFlagY(h);
        }
    }

  //  System.out.print(request.getParameter(temp));

return "Admin_addHostel";
    }


    ////////////////pending request
    @RequestMapping(value="/penreq")
    public ModelAndView getpending() {
        List<HostelInfo> temp=hostelinfoservice.getAllhostelN();
        ModelAndView model = new ModelAndView("Admin_addHostel");
        model.addObject("lists", temp);

        return model;

    }




    @RequestMapping(value="/removehostel_admin",method= RequestMethod.POST)
    public ModelAndView removehostel(HttpServletRequest request,HttpServletResponse response) throws IOException {
        List<HostelInfo> temp=hostelinfoservice.getAllhostelY();
        Iterator<HostelInfo> itr=temp.iterator();
        while(itr.hasNext()){
            HostelInfo h=itr.next();
            System.out.println(request.getParameter(h.getId()));
            if(request.getParameter(h.getId())==null){
                System.out.println(h.getId());
              //  hostelinfoservice.UpdateFlagN(h);
            }
            else{
                hostelinfoservice.UpdateFlagD(h);
            }
        }
        temp=hostelinfoservice.getAllhostelY();
        //  System.out.print(request.getParameter(temp));
        ModelAndView model = new ModelAndView("Admin_deleteHostel");
        model.addObject("lists", temp);

        return model;

    }




    ////////////////////board-meet

    @Autowired
    private Boardservice boardservice;
    @RequestMapping(value = "/admin_board")
    public ModelAndView showboardmeet(){


        Admin_Board a=(Admin_Board)boardservice.getdatebyid(1);
        ModelAndView model = new ModelAndView("Admin_boardmeet");
        model.addObject("datu", a.getDateofmeet());
        return model;
    }



    @RequestMapping(value = "/admin_boarddate")
    public ModelAndView showboarddate(HttpServletRequest request,HttpServletResponse response) {

        String datu=request.getParameter("datu");
        Admin_Board a=(Admin_Board)boardservice.getdatebyid(1);
        if(!(datu.equals(""))){
        a.setDateofmeet(datu);
        boardservice.insert(a);}
        ModelAndView model = new ModelAndView("Admin_boardmeet");
        model.addObject("datu", a.getDateofmeet());
        return model;





    }

    ////////////////////////////////////feedback
    @RequestMapping(value = "/sitefeedbackreq")
    public ModelAndView sitefeedback() {
        List<Sitefeedback> temp=sitefeedbackservice.getAllfeedback();

        ModelAndView model = new ModelAndView("Admin_siteFeedback");
        model.addObject("lists", temp);

        return model;

    }



////////appointment
@Autowired
private appointmentservice appservice;

    @RequestMapping(value = "/setapp")
    public ModelAndView setapp() {
        List<HostelInfo> temp=hostelinfoservice.getAllhostelY();

        ModelAndView model = new ModelAndView("Admin_setappointment");
        model.addObject("lists", temp);
        Iterator<HostelInfo> itr=temp.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getId() + "ok");
        }
        return model;

    }
    @RequestMapping(value="/admin_setapp",method= RequestMethod.POST)
    public String addapp(HttpServletRequest request,HttpServletResponse response) throws IOException, ParseException {
        String  id =request.getParameter("list1");
        //System.out.println(id+"id for");
        String  desc =request.getParameter("app");
        String dat=request.getParameter("datu");
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(dat);
        appservice.insert(new Appointment(id,desc,date1));
        return "Admin_setappointment";
    }





/////////////////////offerslist
@Autowired
private Offerservice offerservice;
    @RequestMapping(value="/admin_offers")
    public ModelAndView offerlist(){
        List<Offer> temp=offerservice.getAllhostel();
        ModelAndView model = new ModelAndView("Admin_offerlist");
        model.addObject("lists", temp);
     /*   Iterator<Offer> itr=temp.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getId() + "ok");
        }*/
        return model;

    }


    ///////showappointments
@RequestMapping(value = "/getapps")
public ModelAndView getapps() throws ParseException {


    List<Appointment> temp = appservice.getAll();

    ModelAndView model = new ModelAndView("Admin_getappointments");
    if(temp!=null)
        model.addObject("lists", temp);



    return model;

}




}
