<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 04-08-2017
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
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

        .navtophlist  a:hover{
            text-decoration: none;
            color: #e6b800;
        }


        body{
            background-color: #ccccff;
        }


    </style>
</head>
<body>
<div class="container navtoph">
    <div class="row">
        <ul class="navtophlist">
            <div class="col-lg-1">
                <li><a href=""><span class="glyphicon glyphicon-home"></span> Home</a></li>

            </div>

            <div class="col-lg-1">


            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">

            </div>

            <div class="col-lg-1">
                <li><a href=""></a></li>
            </div>
            <div class="col-lg-1">
                <li><a href=""></a></li>
            </div>
            <div class="col-lg-1">
                <li><a href=""></a></li>
            </div>

            <div class="col-lg-1">
                <li><a href=""></a></li>
            </div>

            <div class="col-lg-1">
                <div class="dropdown">
                    <button class="btn dropdown-toggle " style="background-color: #000066; color:white; margin-right: 2%;" type="button" data-toggle="dropdown">Sign Up
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu">

                        <li><a href="/Signupreq2" >Hostel</a></li>
                        <li><a href="/Signupreq1" >Student</a></li>

                    </ul>
                </div>
            </div>

            <div class="col-lg-1">
                <li><a href="/Loginreq">Login</a></li>
            </div>

            <div class="col-lg-1">
                <li><a href="/Feedbackreq">Feedback</a></li>
            </div>

            <div class="col-lg-1">
                <li><a href="/aboutus">About Us</a></li>
            </div>
        </ul>




    </div>
</div>


<div class="container">

    <div class="row">

        <h1 style="margin-top: 20%;margin-left: 20%;">Find the best Hostel near your College!!</h1>

    </div>
</div>

</body>
</html>