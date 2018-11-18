<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 09-10-2017
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<%
    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    %>
<div class="container">
 <table class="table table-hover">
            <thead>
            <tr>
                <th>Name</th>
                <th>Date</th>
                <th>Description</th>
            </tr>
            </thead>
            <tbody>


            <c:if test="${not empty lists}">
                <c:forEach var="h" items="${lists}">


                    <tr>
                        <td> ${h.id}</td>
                        <td> <fmt:formatDate value="${h.date}" pattern="yyyy-MMM-dd"/></td>
                        <td> ${h.description}</td>

                    </tr>
                </c:forEach>

            </c:if>

            </tbody>
        </table>


</div>
</body>
</html>
