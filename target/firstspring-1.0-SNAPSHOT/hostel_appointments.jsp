<%@ page import="com.first.controller.domain.Appointment" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 08-10-2017
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .container{
            background-color: #000066;
            height:100%;
            width:100%;
        }
        body{
            color:white;
        }
        .clockdate-wrapper {
            background-color: #333;
            padding:25px;
            max-width:350px;
            width:100%;
            height:40%;
            text-align:center;
            border-radius:5px;
            margin:0 auto;
            margin-top:0%;
        }
        #clock{
            background-color:#333;
            font-family: sans-serif;
            font-size:30px;
            text-shadow:0px 0px 1px #fff;
            color:#fff;
        }
        #clock span {
            color:#888;
            text-shadow:0px 0px 1px #333;
            font-size:15px;
            position:relative;
            top:-10px;
            left:-10px;
        }
        #date {
            letter-spacing:10px;
            font-size:14px;
            font-family:arial,sans-serif;
            color:#fff;
        }
    </style>
    <script>
        function startTime() {
            var today = new Date();
            var hr = today.getHours();
            var min = today.getMinutes();
            var sec = today.getSeconds();
            ap = (hr < 12) ? "<span>AM</span>" : "<span>PM</span>";
            hr = (hr == 0) ? 12 : hr;
            hr = (hr > 12) ? hr - 12 : hr;
            //Add a zero in front of numbers<10
            hr = checkTime(hr);
            min = checkTime(min);
            sec = checkTime(sec);
            document.getElementById("clock").innerHTML = hr + ":" + min + ":" + sec + " " + ap;

            var months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
            var days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
            var curWeekDay = days[today.getDay()];
            var curDay = today.getDate();
            var curMonth = months[today.getMonth()];
            var curYear = today.getFullYear();
            var date = curWeekDay+", "+curDay+" "+curMonth+" "+curYear;
            document.getElementById("date").innerHTML = date;

            var time = setTimeout(function(){ startTime() }, 500);
        }
        function checkTime(i) {
            if (i < 10) {
                i = "0" + i;
            }
            return i;
        }
    </script>
</head>
<body onload="startTime()">
<%
     DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = new Date();

    Appointment p=(Appointment)request.getAttribute("lists");
    if(p!=null) {
        if (p.getDate().compareTo(date) < 0)
            p = null;
    }

%>
<div id="clockdate">
    <div class="clockdate-wrapper">
        <div id="clock"></div>
        <div id="date"></div>
    </div>
</div>
<div class="container">

    <br>
    <br>
    Appointment date:
    <%
        if(p!=null){
            DateFormat outputFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String output = outputFormatter.format(p.getDate());
    %><%=output%>
    <%
        }
    %>
    <br>
    Description:
    <%
        if(p!=null)
    %><%=p.getDescription()%>
</div>
</body>
</html>
