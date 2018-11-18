<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 09-10-2017
  Time: 15:47
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
            width:100%;
            height: 100%;
            background-color: #000066;
        }
        body {
            color: white;

        }

        .tablu{
            margin-top:30% ;
            color: black;
            border: none !important;
        margin-left: 15%;
            font-size: 20px;
        }

        .table th, .table td {
            border: none !important;

        }
    </style>
</head>

<body>

<div class="container" style="background: url('/offerback.png') no-repeat; background-size: cover; ">
    <div class="row">
        <div class="col-lg-3"></div>
        <div class="col-lg-6">
            <table border="0" class="tablu" cellspacing="10px">

                <tr>
                    <th width="30%">Name</th>
                    <th width="40%">Offer</th>
                </tr>

                <tbody>


                <c:if test="${not empty lists}">
                    <c:forEach var="h" items="${lists}">

                        <tr>
                            <td> ${h.id}</td>
                            <td> ${h.offer}</td>

                        </tr>
                    </c:forEach>

                </c:if>

                </tbody>
            </table>
        </div>
        <div class="col-lg-3"></div>

    </div>
</div>






</body>
</html>
