<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 08-10-2017
  Time: 17:46
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

        button.abc{
            color:#000066;

        }
        option{
            width:30%;
        }
    </style>
</head>
<body>
<div class="container">

    <form method="post" action="/admin_setapp">
        <div class="form-group">
            <br>
            <br>
            <br>
            <label for="list1" style="font-size:large;">Select student:
            </label>
            <select id="list1" name="list1" class="form-control">
            <c:if test="${not empty lists}">
                <c:forEach var="h" items="${lists}">

                 <option>
                  ${h.id}
                 </option>
                </c:forEach>

            </c:if>
            </select>
            <br>
            <label for="datu" style="font-size:large; ">Choose date for appointment</label>
            <div class="abc">
                <input type="date" class="form-control" id="datu" name="datu">
            </div>
            <br>
            <label for="app" style="font-size:large; ">Description</label>
            <div class="abc">
                <input type="text" class="form-control" id="app" name="app">
            </div>
        </div>
        <button type="submit" class="btn btn-default">Set</button>
    </form>
    <br>


</div>

</body>
</html>
