<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 06-10-2017
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .navtoph{
            width:100%;

            background-color: #000066;
            height:35px;


        }

        .navtophlist{
            list-style-type: none;
        }

        .navtophlist  a{
            color:white;
            height:35px;
            padding-top: 8px;
            width:69px;
            display: inline-block;
            text-decoration: none;
        }

        a:hover{
            text-decoration: none;
            color:  #e6b800;
        }
        h1{
            text-align: center;
        }
        body{
            background-color: #ccccff;
        }

    </style>
</head>
<body>

<h1>Site Feedback Form </h1>
<hr>
<div class="container">

<form action="Sendfeedback" method="post">
    <div class="row">
     <div class="col-lg-4">

     </div>




        <div class="col-lg-4">

        <div class="row">
            <div class="form-group">
                <label for="email">Email id:</label>
                <input type="text" class="form-control" id="email" name="email">
            </div>
        </div>
<div class="row">

            <div class="form-group">
            <label for="feedback">Feedback:</label>
                <textarea  rows="5" class="form-control" id="feedback" name="feedback"></textarea>

            </div>

</div>
        </div>
        <div class="col-lg-4">

        </div>
    </div>

    <button type="submit" style="margin-left: 48%;" class="btn btn-default">Send</button>
    <%
        String offer=(String)session.getAttribute("feederror");
        if (offer != null) {
            if(offer.equals("yes"))
            {
                session.setAttribute("feederror","no");
    %> <p style="margin-left: 48%; color:red;"> Enter valid details!</p>
    <%
            }
        }
    %>
</form>
</div>
</body>
</html>
