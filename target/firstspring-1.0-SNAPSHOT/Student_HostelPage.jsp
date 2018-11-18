<%@ page import="com.first.controller.domain.HostelInfo" %><%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 05-11-2017
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
    body{
        background-color:  #ccccff;
        width: 100%;
        height: 100%;


    }
    .fulldiv{
        height:100%;
        width: 100%;
        position: absolute;
        top:0;
        bottom:0;
        left: 0;
        right: 0;

    }
    img.dp {
        border-radius: 4px 4px 0 0!important;

    }
    .list_feed{
        list-style-type: none;
    }

    .list_feed a{
        text-decoration: none !important;
        display:inline-block;
        color:white;
        height:30px;
        width :100%;

    }
    .list_feed a:hover{
        text-decoration: none !important;
        color:orange;
    }
</style>
</head>
<body>
<div class="container fulldiv" style="width:100%;">
<%
    HostelInfo hi=(HostelInfo) request.getAttribute("hostelinfo");
%>
    <div style="height:300px;width:100%;">
<img src="image/ava" class="dp" height="100%" width="100%"/>
    </div>

    <div style=" font-family: Garamond;font-size: 35px;height: 200px;background-color: #a6a6a6;color:black;">
        <div style="float:left; width: 400px;height: 80px;padding-left: 25px;font-size: 50px;">
        <%=hi.getName()%>
        </div>
         <div style="float:left; width:400px;height: 20%"></div>
        <div class="align-middle" style="float:left; width: 06%;text-align:center;height: 28%;color:white;background-color:green;border-style:;border-color:green;border-radius:5px;margin-top:4px;margin-right:4px;">
        ${rating}/5
        </div>
        <div style="float:left;font-size: 18px;padding-left: 25px;padding-top: 45px;width:100%;height: 25%" >
            <%=hi.getStreet()%> , <%= hi.getArea()%> , <%= hi.getLand()%>
            <br>
            <span class="glyphicon glyphicon-phone-alt"> <%= hi.getContact()%> </span>
        </div>





    </div>

    <div style="background-color: #a6a6a6;width:100%;height:100%;margin-top: 20px; ">

        <div  style="height:45px;width:100%; background-color: #595959;">

            <ul class="list_feed">

                <div style="float: left;width:140px;height:100%;text-align:center;vertical-align:middle;font-size:20px;padding-top:8px;">
                <li><a href="/seefeed" target="picsfeed">Feedback</a></li>
                </div>
                <div style="float: left;width:140px;height:100%;text-align:center;vertical-align:middle;font-size:20px;padding-top:8px;">
                    <li><a href="/seepics" target="picsfeed">Photos</a></li>
                </div>
                <div class="col-lg-8">

                </div>

            </ul>

        </div>
        <iframe name="picsfeed" frameborder="0px" scrolling="yes" width="100%" height="100%" style="background-color: #a6a6a6;">

        </iframe>


    </div>

</div>
</body>
</html>
