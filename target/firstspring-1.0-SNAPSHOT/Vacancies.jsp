<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 03-10-2017
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body{
            background-color: #ccccff;
        }
        button{
            background-color: #000066;
        }
    </style>
</head>
<body>
<% String user=(String)session.getAttribute("user");
int vacancy=(int)session.getAttribute("vacancies");%>
<form action="UpdateVacancy" method="post">
    <div class="form-group">
        <label for="vacancy">Vacancies:</label>
        <input type="number" class="form-control" id="vacancy" name="vacancy" value=<%=vacancy%>>
    </div>
    <input type="hidden" id="user" name="user" value=<%=user%> >
    <button type="submit" class="btn btn-default">Update</button>
    <%
        String offer=(String)session.getAttribute("vacancy");
        if (offer != null) {
            if(offer.equals("yes"))
            {
                session.setAttribute("vacancy","no");
    %> <p> Updated successfully!</p>
    <%
            }
        }
    %>
</form>
</body>
</html>

