<%@ page import="com.first.controller.domain.HostelInfo" %>
<%@ page import="com.first.controller.domain.Student_rate" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/26/2017
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <style>
     body{
         background-color: #000066;
         color:white;
         font-size:20px;
     }



 </style>
</head>
<body>
<div class="container">
<% HostelInfo h=(HostelInfo)request.getAttribute("lists");
    String sr=(String)request.getAttribute("comp");
System.out.println(sr+"injsp");
%>
    <br>
    <br>
    Your Hostel's name is :
<%=h.getName()%><br><br>
Owned by:
<%= h.getOwner()%><br><br>
Located at :
<%= h.getStreet()%> , <%= h.getArea()%><br><br>
Near :
<%=h.getLand()%><br><br>
For any problems, contact on:
<%=h.getContact()%><br>

<form  method="post" action="/ratingandcomplaint">
    <div class="form-group">


<br>
        <br>
        <br>
        <br>
     Rating:


        <div class="btn-group" data-toggle="buttons">
            <label class="btn btn-danger active">
                <input type="radio" name="rates" id="option1" autocomplete="off" value="1">  1
            </label>
            <label class="btn btn-danger">
                <input type="radio" name="rates" id="option2" autocomplete="off" value="2"> 2
            </label>
            <label class="btn btn-warning">
                <input type="radio" name="rates" id="option3" autocomplete="off" value="3"> 3
            </label>
            <label class="btn btn-success">
                <input type="radio" name="rates" id="option4" autocomplete="off" value="4"> 4
            </label>
            <label class="btn btn-success">
                <input type="radio" name="rates" id="option5" autocomplete="off" value="5"> 5
            </label>
        </div>
<br>
        <br>


        <div class="form-group">
            <label for="complaint">Complaint:</label>
            <textarea  rows="5" class="form-control" id="complaint" name="complaint" placeholder ="${comp}"></textarea>

        </div>

        <button class="btn btn-info" type="submit">Submit</button>
        <%
            if(request.getAttribute("flag").equals("SOLVED")){
        %>

        <button type="submit" class="btn btn-success" formaction="/student_solcomp">Complaint solved</button>
        <%}%>
    </div>




</form>


</div>
</body>
</html>
