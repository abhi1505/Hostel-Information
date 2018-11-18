<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 25-10-2017
  Time: 23:37
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
<body style="background-color: #000066">
<div class="container">

<form action="/admithostel" method="post">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Name</th>
            <th>Landmark</th>
            <th>Contact</th>
            <th>Vacancies</th>
        </tr>
        </thead>
        <tbody>


        <c:if test="${not empty lists}">
            <c:forEach var="h" items="${lists}">

                <tr>
                    <td><button type="submit" name="hid" value="${h.id}" style="background: none; border: 0px;" formaction="/displayhostelinfo">${h.name}</button></td>
                    <td> ${h.land}</td>
                    <td> ${h.contact}</td>
                    <td>${h.vacancies}</td>
                    <td><input type="radio" name="${h.id}"></td>
                </tr>
            </c:forEach>

        </c:if>

        </tbody>
    </table>
    <button type="submit"  class="btn btn-info abcd">Register</button>
</form>

</div>

</body>
</html>
