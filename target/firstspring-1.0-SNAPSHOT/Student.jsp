<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 03-10-2017
  Time: 00:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body{
            background-color: #ccccff;
        }

        .navtoph{
            width:100%;

            background-color: #000066;
            height:35px;


        }

        .navtophlist{
            list-style-type: none;
        }

        .navtophlist  a{
            color:white;
            height:35px;
            padding-top: 8px;
            width:69px;
            display: inline-block;
            text-decoration: none;
        }

        a:hover{
            text-decoration: none;
            color:  #e6b800;
        }

        iframe.place{
            width: 100%;
            height:100%;
        }

    </style>
</head>
<body>
<% String name=(String)session.getAttribute("username");%>
<h1 style="text-align:center"> WELCOME <%= name%></h1>
<div class="container navtoph">
    <div class="row">
        <ul class="navtophlist">
            <div class="col-lg-1">


            </div>

            <div class="col-lg-1">


            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">
                <li><a href="searcharea" target="place"> Search</a></li>
            </div>

            <div class="col-lg-1">
                <li><a href="getHostels"  target="place"> Hostels</a></li>
            </div>
            <div class="col-lg-1">
                <li><a href="/ratehostels" target="place"> My Hostel</a></li>
            </div>
            <div class="col-lg-1">
                <li><a href="/student_givefeed" target="place">Feedback</a></li>
            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">
                <li><a href="Logout"> Logout</a></li>
            </div>
        </ul>




    </div>
</div>
<div class="container">
    <div class="row" style="margin-top: 10%;">
        <div class="col-lg-2">

        </div>
        <div class="col-lg-10">
            <iframe name="place" frameborder="0px" class="place" scrolling="no">

            </iframe>
        </div>




    </div>
</div>
</body>
</html>
