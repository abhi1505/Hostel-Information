package com.first.controller;

import com.first.controller.domain.Hostel_Photos;
import com.first.controller.service.Photosservice.Photosservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abhilasha on 05-11-2017.
 */
@Controller
public class Imageservlet extends HttpServlet {

    @Autowired
    private Photosservice photosservice;

    @RequestMapping(value = "image/ava")
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {
        HttpSession session=request.getSession();
        System.out.println("imageservletmeaaaya");
        String hid=(String)session.getAttribute("clickedhostel");
        System.out.println("imageservletmeaaaya1"+hid);
        List<Hostel_Photos> pics=photosservice.getpics(hid);
        System.out.println("imageservletmeaaaya2"+pics);
        Iterator<Hostel_Photos> it=pics.iterator();
        String name="";
        System.out.println(name+"imageservlet");
        while(it.hasNext())
        {
            Hostel_Photos p=it.next();
            System.out.println("imageservletmeaaaya3"+p.getPhotoid());
            if((p.getPhotoid().equals("1")))
            {

                name=name+p.getName();
                System.out.println(name+"imageservlet");
                break;
            }
        }
        try {
            String rootpath = System.getProperty("catalina.home");
            File dir = new File(rootpath + File.separator + "tmpfiles");
            System.out.println(name+"imageservlet");
            File serverfile = new File(dir.getAbsolutePath() + File.separator + name);
            // BufferedInputStream stream = new BufferedInputStream(new FileInputStream(serverfile));
            FileInputStream file=new FileInputStream(serverfile);

            byte[] bytes= new byte[(int)serverfile.length()];

            file.read(bytes);

            file.close();

            response.setContentType("image/jpg");
            response.setContentLength(bytes.length);
            BufferedOutputStream out=new BufferedOutputStream(response.getOutputStream());
            ByteArrayInputStream inp=new ByteArrayInputStream(bytes);
            byte[] buffer=new byte[4096];
            for(int length=0;(length=inp.read(buffer))>0;){
                out.write(buffer,0,length);
            }
            out.close();
        }
        catch(Exception e){

            e.printStackTrace();
        }




    }
}
