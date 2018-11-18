<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 02-10-2017
  Time: 17:18
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
        h1{
            text-align:center;
        }
        .form-group{
            width:50%;
            align:center;
            position:relative;
            top:20%;
            left:30%;
        }
        button{
            position:relative;
            top:20%;
            left:30%;
        }
        body{
            background-color: #ccccff;
        }
    </style>

</head>
<body>
<%
    String user=(String)session.getAttribute("user");
    //System.out.println(user+"mehubhaissssss");
%>
<h1>Hostel Registration Form </h1>
<hr>
<form action="Addnewhostel" method="post">
    <div class="form-group">
        <label for="name">Name of the Hostel:</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>
    <div class="form-group">
        <label for="owner">Name of the Owner:</label>
        <input type="text" class="form-control" id="owner" name="owner">
    </div>
    <div class="form-group">
        <label for="street">House no:</label>
        <input type="text" class="form-control" id="street" name="street">
    </div>
    <div class="form-group">
        <label for="area">Area:</label>
        <input type="text" class="form-control" id="area" name="area">
    </div>
    <div class="form-group">
        <label for="land">Landmark(if any):</label>
        <input type="text" class="form-control" id="land" name="land">
    </div>
    <div class="form-group">
        <label for="contact">Contact Number:</label>
        <input type="text" class="form-control" id="contact" name="contact">
    </div>
    <div class="form-group">
        <label for="vacancy">Vacancies:</label>
        <input type="number" class="form-control" id="vacancy" name="vacancy">
    </div>

    <input type="hidden" id="user" name="user" value=<%=user%> >
    <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>
