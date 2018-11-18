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
<% String user=(String)session.getAttribute("user");%>
<form action="AddOffer" method="post">
    <div class="form-group">
        <label for="offer">New Offer:</label>
        <input type="text" class="form-control" id="offer" name="offer">
    </div>
    <div class="form-group">
        <label for="expiry">Expiry Date:</label>
        <input type="date" class="form-control" id="expiry" name="expiry">
    </div>
    <input type="hidden" id="user" name="user" value=<%=user%> >
    <button type="submit" class="btn btn-default">Add</button>
    <%
        String offer=(String)session.getAttribute("offer");
        if (offer != null) {
        if(offer.equals("yes"))
        {
            session.setAttribute("offer","no");
    %> <p> Added successfully!</p>
    <%
        }
        }
    %>
</form>
</body>
</html>
