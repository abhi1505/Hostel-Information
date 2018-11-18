package com.first.controller;

import com.first.controller.domain.*;
import com.first.controller.service.HostelRatingservice.Hostelratingservice;
import com.first.controller.service.Hostel_feedbackservice.Hostel_feedbackservice;
import com.first.controller.service.Photosservice.Photosservice;
import com.first.controller.service.Student_rateservice.Student_rateservice;
import com.first.controller.service.hostelinfoservice.HostelInfoservice;
import com.first.controller.service.studentservice.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by admin on 10/26/2017.
 */
@Controller
public class StudentController {


    @Autowired
    private Student_rateservice studentrateservice ;


    @Autowired
    private Studentservice hostelService;

    @Autowired
    private HostelInfoservice hostelinfoservice;

    @Autowired
    private Hostelratingservice hostelratingservice;

    @Autowired
    private Hostel_feedbackservice hostelfeedbackservice;

    @Autowired
    private Photosservice photosservice;


    //////////////////////////////////////////////////search
    @RequestMapping(value="/searcharea")
    public ModelAndView search()
    {
        List<HostelInfo> temp=hostelService.getAllhostel();
        System.out.println(temp);
        ListIterator<HostelInfo> it=temp.listIterator();
        List<String> areas=new ArrayList<String>();
        while(it.hasNext()){
            HostelInfo h=it.next();
            areas.add(h.getArea());
    //        System.out.println(h.getArea());
        }
        HashSet<String> hs=new HashSet<String>();
        hs.addAll(areas);
        areas.clear();
        areas.addAll(hs);
     //   System.out.println(areas);
        ModelAndView model = new ModelAndView("Search_student");
        model.addObject("lists", areas);
        return model;
    }







    /////////////////////////////////////////////area wise hostelssssssss
    @RequestMapping(value="/givehostels",method= RequestMethod.POST)
    public ModelAndView disphostels(HttpServletResponse response, HttpServletRequest request){
        HttpSession session=request.getSession();
        String areareq=request.getParameter("areas");
        System.out.println(request.getParameter("areas"));
        Student s=hostelService.getPersonById((String)session.getAttribute("user"));

        List<HostelInfo> temp=new ArrayList<HostelInfo>();
        temp=hostelService.getAllhostel();
        System.out.println(temp+"bef");
        Iterator<HostelInfo> it=temp.iterator();

        while(it.hasNext()){

            HostelInfo h=it.next();

            if(!(h.getArea().equals(areareq))){
                System.out.print(h.getArea());
                it.remove();
            }



        }


        ModelAndView model = new ModelAndView("Search_listhostels");
        if(!(s.getHostel_admit().equals(""))){
            model=new ModelAndView("Search_noradiohostels");
        }
        System.out.println(temp+"aftu");
        model.addObject("lists",temp);
        return model;
    }





    ///////////////////////////////////////////////Register hostel
    @RequestMapping(value = "/admithostel",method = RequestMethod.POST)
    public ModelAndView admit(HttpServletRequest request,HttpServletResponse response){
        HttpSession session=request.getSession();
        List<HostelInfo> temp=hostelinfoservice.getAllhostelY();
        Iterator<HostelInfo> itr=temp.iterator();
        while(itr.hasNext()){
            HostelInfo h=itr.next();
            //System.out.println(request.getParameter(h.getId()));
            if(request.getParameter(h.getId())==null){
                System.out.println(h.getId());
                //  hostelinfoservice.UpdateFlagN(h);
            }
            else{
                String id=(String)session.getAttribute("user");
                Student s=hostelService.getPersonById(id);
                s.setHostel_admit(h.getId());
                Student s1=hostelService.update(s);

                studentrateservice.insert(new Student_rate(id,h.getId(),0,"",""));

                String id1=h.getId();
                HostelInfo h1=hostelinfoservice.getPersonById(id1);
                h1.setVacancies(h1.getVacancies()-1);
                HostelInfo h2=hostelinfoservice.update(h1);
            }
        }
        temp=hostelinfoservice.getAllhostelY();
        //  System.out.print(request.getParameter(temp));
        ModelAndView model = new ModelAndView("Search_noradiohostels");
        model.addObject("lists", temp);

        return model;
    }

    @RequestMapping(value="/getHostels")
    public ModelAndView hostels(HttpServletRequest request, HttpServletResponse response)
    {
        List<HostelInfo> temp=hostelService.getAllhostel();
        ModelAndView model=new ModelAndView("Student_hostels");
        model.addObject("lists",temp);


        return model;
    }








    /////////////////////////////////////////////////////////////////Rating and complaints
    @RequestMapping(value="/ratehostels")
    public ModelAndView ratehostel(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        String id=(String)session.getAttribute("user");
        Student s=hostelService.getPersonById(id);
        ModelAndView model=new ModelAndView("Student_hosteladmitted");
        if(s.getHostel_admit().equals("")) {
          model=new ModelAndView("Student_nohosteladmit");
          return model;
        }
        HostelInfo h = hostelinfoservice.getPersonById(s.getHostel_admit());
        Student_rate sr=studentrateservice.getPersonById(id);

        model.addObject("lists",h);
System.out.println(sr.getComplaint());
        model.addObject("comp",sr.getComplaint());
        model.addObject("flag",sr.getFlag_comp());



        return model;
    }

    @RequestMapping(value="/ratingandcomplaint",method = RequestMethod.POST)
    public String ratebystudent(HttpServletRequest request, HttpServletResponse response){

        HttpSession session=request.getSession();
        String id=(String)session.getAttribute("user");
        Student_rate sr=studentrateservice.getPersonById(id);
        int rate=0;
        try {
            rate = Integer.parseInt(request.getParameter("rates"));
        }
        catch(Exception e){

        }

         String complaint=request.getParameter("complaint");
        String flag_comp="";
        if(!(complaint.equals(""))){
            flag_comp+="YES";
        }


        if(rate!=0) {
            studentrateservice.insert(new Student_rate(id, sr.getHostelid(), rate, complaint,flag_comp));
            HostelRating hr=hostelratingservice.getPersonById(sr.getHostelid());
            int r=hr.getRate();
            r=r==0?rate:(int)(r+rate)/2;
            hr.setRate(r);
            hostelratingservice.insert(hr);
        }

        else
            studentrateservice.insert(new Student_rate(id,sr.getHostelid(),sr.getRate(),complaint,flag_comp));
        return "Search_student";
    }
    //////////////////////////////////solved complaint
    @RequestMapping(value="/student_solcomp",method = RequestMethod.POST)
    public String compsolved(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session=request.getSession();
        String id=(String)session.getAttribute("user");
        Student_rate sr=studentrateservice.getPersonById(id);

        sr.setFlag_comp("");
        sr.setComplaint("");
        studentrateservice.insert(sr);
       return "Search_student";


    }





    ////////////////////////////////////////////////////////////////////////////////hostel feedback
    @RequestMapping(value="/student_givefeed")
    public ModelAndView givefeed(HttpServletRequest req){
        HttpSession session=req.getSession();

        String id=(String)session.getAttribute("user");
        Student s=hostelService.getPersonById(id);
        ModelAndView model=new ModelAndView("Student_feedback");
        if(s.getHostel_admit().equals("")){
            model=new ModelAndView("Student_nohosteladmit");
            return model;
        }
        Hostel_feedback ho=null;
        boolean flag=false;
        try{
            ho=hostelfeedbackservice.getPersonById(id);
            if(ho==null){flag=true;}
        }
        catch(Exception e){
            flag=true;
        }
        if(!(flag)) {
            String feed = ho.getFeedback();
            model.addObject("feedback", feed);
        }
        return model;
    }

    @RequestMapping(value="/Student_storefeed",method = RequestMethod.POST)
    public String storefeed(HttpServletRequest request,HttpServletResponse response){
        HttpSession session=request.getSession();
        String id=(String)session.getAttribute("user");

        Student s=hostelService.getPersonById(id);

        String feed=request.getParameter("feedback");
       hostelfeedbackservice.insert(new Hostel_feedback(id,s.getHostel_admit(),feed));
       return "Search_student";

    }

    @RequestMapping(value="/displayhostelinfo",method = RequestMethod.POST)
    public ModelAndView dispinfo(@RequestParam("hid") String hid,HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("clickedhostel", hid);

        ModelAndView model = new ModelAndView("Student_HostelPage");
        try {
        HostelInfo h = hostelinfoservice.getPersonById(hid);
        model.addObject("hostelinfo", h);
        HostelRating hr = hostelratingservice.getPersonById(hid);
        model.addObject("rating", hr.getRate());


        System.out.println(hid + "sir dard");

    }catch(Exception e){

        }
        return model;
    }



    /////////////////////////see all pics
    @RequestMapping(value="seepics")
    public String getallpics(){
        return "hostel_allpics";
    }
    ///////////////////////see all feedback
    @RequestMapping(value="seefeed")
    public ModelAndView getallfeed(HttpServletRequest request){
        HttpSession session=request.getSession();
        String hid=(String)session.getAttribute("clickedhostel");
        ModelAndView model =new ModelAndView("hostel_allfeed");
        List<Hostel_feedback> temp = null;
        try {
            temp = hostelfeedbackservice.getAllhostel(hid);


            model.addObject("feedback", temp);
        }
        catch(Exception e){


        }
        return model;
    }
}
