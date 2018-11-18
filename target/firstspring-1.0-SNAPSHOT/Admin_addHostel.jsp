<%@ page import="static java.lang.System.in" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.first.controller.domain.Student" %>
<%@ page import="com.first.controller.domain.HostelInfo" %><%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 12-09-2017
  Time: 19:47
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
        tr:hover{
            background-color: #ccccff;
            color: #000066;
        }
        button.abcd{
            color:#000066;

        }
    </style>
</head>
<body>

<div class="container">











<form action="/updatenewrequest_admin" method="post" >
<% List<HostelInfo> temp= (List)request.getAttribute("lists");
Iterator<HostelInfo> itr=temp.iterator();

String flag_send="";
if(itr.hasNext()){
    HostelInfo h=itr.next();
    flag_send=h.getFlag_req();
}
%>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Name</th>
            <th>Contact</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>


        <c:if test="${not empty lists}">
            <c:forEach var="h" items="${lists}">

                <tr>
                    <td> ${h.name}</td>
                    <td> ${h.contact}</td>
                    <td> ${h.id}</td>
                    <td><input type="checkbox" name=${h.id}></td>
                </tr>
            </c:forEach>

        </c:if>

        </tbody>
    </table>

    <input type="hidden" name="type_flag" value=<%=flag_send%> >

    <button type="submit" class="btn btn-default abcd">Submit</button>
</form>

</div>

</body>
</html>
