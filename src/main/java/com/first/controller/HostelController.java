package com.first.controller;

/**
 * Created by abhilasha on 04-08-2017.
 */
import com.first.controller.domain.*;
import com.first.controller.service.HostelRatingservice.Hostelratingservice;
import com.first.controller.service.Photosservice.Photosservice;
import com.first.controller.service.Student_rateservice.Student_rateservice;
import com.first.controller.service.appointmentservice.appointmentservice;
import com.first.controller.service.hostelinfoservice.HostelInfoservice;
import com.first.controller.service.offerservice.Offerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class HostelController {


    @Autowired
    private HostelInfoservice hostelinfoservice;

    @Autowired
    private Offerservice offerservice;

    @Autowired
    private appointmentservice appservice;

    @Autowired
    private Photosservice photosservice;

    @Autowired
    private Hostelratingservice hostelratingservice;

    @Autowired
    private Student_rateservice student_rateservice;

    @RequestMapping(value = "/offersreq")
    public String offersreq(){
        return "Offers";
    }

  @RequestMapping(value="/Addnewhostel",method= RequestMethod.POST)
    public String addhostel(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        String id=request.getParameter("user");
       // System.out.println(session.getAttribute("user")+"mehugadhiiiiiiii");
        String name=request.getParameter("name");
        String owner=request.getParameter("owner");
        String street=request.getParameter("street");
        String area=request.getParameter("area");
        String land=request.getParameter("land");
        String contact=request.getParameter("contact");
        System.out.println(request.getParameter("vacancy")+"vacants");
        int vacancy=Integer.parseInt(request.getParameter("vacancy"));

        HostelInfo h=new HostelInfo(id,name,owner,street,area,land,contact,vacancy);
        hostelinfoservice.insert(h);
        hostelratingservice.insert(new HostelRating(id,0));
        return "Hostel1";

    }
    @RequestMapping(value="/AddOffer",method= RequestMethod.POST)
    public String addoffer(HttpServletRequest request, HttpServletResponse response)
    {
    HttpSession session=request.getSession();
        String id=request.getParameter("user");
        String offer=request.getParameter("offer");
        String expiry=request.getParameter("expiry");
        Date date1=new Date();
        DateFormat format = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        try {
             date1= format.parse(expiry);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String s=new SimpleDateFormat("yyyy-mm-dd").format(date1);
        try {
            date1=new SimpleDateFormat("yyyy-mm-dd").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        offerservice.insert(new Offer(id,offer,date1));
        session.setAttribute("offer","yes");
        return "Offers";

    }
    @RequestMapping(value = "/getvacancy")
    public String getvacancy(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("user");
        //System.out.println(id+"hiiiiiiiiiiiiiiii");
        HostelInfo p = hostelinfoservice.getPersonById(id);
        int vacancy = p.getVacancies();
        session.setAttribute("vacancies", vacancy);
        return "Vacancies";
    }
    @RequestMapping(value="/UpdateVacancy",method= RequestMethod.POST)
    public String update(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("user");
        HostelInfo p = hostelinfoservice.getPersonById(id);
        int vac=Integer.parseInt(request.getParameter("vacancy"));
        System.out.print(vac+"alll");
        p.setVacancies(vac);
        System.out.print(p.getVacancies()+"before");
        HostelInfo j=hostelinfoservice.update(p);
        System.out.print(p.getVacancies()+"after");
        session.setAttribute("vacancies", p.getVacancies());
        session.setAttribute("vacancy","yes");
        return "Vacancies";

    }
    @RequestMapping(value = "/getapp")
    public ModelAndView getapp(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("user");
        //
        Appointment p=null;
        try {
             p = appservice.getappointments(id);
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        //System.out.println(p.getId()+"hiiiiiiiiiiiiiiii"+id);
        ModelAndView model = new ModelAndView("hostel_appointments");
        model.addObject("lists", p);



        return model;

    }

    ////////////////////////////////////////////////////////////////////complaints
    @RequestMapping(value = "/getcomplaints")
    public ModelAndView Hostel_complaints(HttpServletRequest request){
    HttpSession session=request.getSession();
      ModelAndView model=new ModelAndView( "hostel_complaints");
      String id=(String)session.getAttribute("user");

        List<Student_rate> temp=student_rateservice.getAllhostel(id);
        Iterator<Student_rate> it=temp.iterator();
        while(it.hasNext()){
            Student_rate sr=it.next();
            if(sr.getFlag_comp().equals("")) it.remove();
        }
        model.addObject("lists",temp);
      return model;

    }




    /////////////////////////////////////////hostel manager solves complaint
    @RequestMapping(value="/solvecomplaint",method= RequestMethod.POST)
    public ModelAndView solvecomp(HttpServletRequest req){
        HttpSession session=req.getSession();


        ModelAndView model=new ModelAndView("hostel_complaints");
        List<Student_rate> sr=student_rateservice.getAllhostel((String)session.getAttribute("user"));
        Iterator<Student_rate> it=sr.iterator();
        while(it.hasNext()) {
            Student_rate str=it.next();
            String sid=str.getSid();
            if(!(req.getParameter(sid)==null)){
                String flag_comp=str.getFlag_comp();
                str.setFlag_comp("SOLVED");
                student_rateservice.insert(str);
            }


        }

model.addObject("lists",sr);
        return model;
    }
    @RequestMapping(value="/uploadphotos", method = RequestMethod.POST)
    public String uploadphotos(@RequestParam("files") MultipartFile[] files,HttpServletRequest request)
    {
    HttpSession session=request.getSession();
    String id=(String)session.getAttribute("user");

        String message = "";

        String rootpath=System.getProperty("catalina.home");
        File dir=new File(rootpath+File.separator+"tmpfiles");
        if(!dir.exists())
            dir.mkdirs();
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            String name = file.getOriginalFilename();
            try{
                if(!file.isEmpty()) {
                    byte[] bytes = file.getBytes();


                    File serverfile = new File(dir.getAbsolutePath() + File.separator + name);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverfile));
                    stream.write(bytes);
                    photosservice.insert(new Hostel_Photos(id,i+1+"",name));

                    stream.close();
                }

            }
            catch (Exception e){

            }
        }
        HostelInfo hi = hostelinfoservice.getPersonById(id);
String ret_page="HostelOneTime";
if(hi!=null){
    ret_page="HostelPhotos";
}
        return ret_page;
    }


@RequestMapping(value = "/getpicschange")
public String getphotos(){
        return "HostelPhotos";
}




}
