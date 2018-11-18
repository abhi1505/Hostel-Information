<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/10/2017
  Time: 5:49 PM
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
        body{
            background-color: #a6a6a6;
            width:100%;
            height: 100%;

        }

    </style>
</head>
<body>
<div class="container">

<br>
    <br>
    <br>
    <table>



        <c:if test="${not empty feedback}">
            <c:forEach var="h" items="${feedback}">

                <tr>
                    <td style="font-size: 25px; font-weight: 700;"> ${h.student_id}</td>

                </tr>
                    <tr style="height: 3px;">
                        <td></td>
                    </tr>
                <tr>
                    <td style="font-size: 20px;">&nbsp;&nbsp;  ${h.feedback}  </td>

                </tr>

                <tr style="height: 10px;">
                    <td></td>
                </tr>
            </c:forEach>

        </c:if>


    </table>






</div>











</body>
</html>
