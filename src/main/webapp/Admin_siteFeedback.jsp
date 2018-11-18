<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 06-10-2017
  Time: 20:22
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

    </style>
</head>
<body>
<div class="container">
    <table class="table table-hover">
        <thead>
        <tr>

            <th>Email</th>
            <th>Feedback</th>
        </tr>
        </thead>
        <tbody>


        <c:if test="${not empty lists}">
            <c:forEach var="h" items="${lists}">

                <tr>
                    <td> ${h.email}</td>
                    <td> ${h.feedback}</td>

                </tr>
            </c:forEach>

        </c:if>

        </tbody>
    </table>
</div>
</body>
</html>
