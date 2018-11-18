<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/31/2017
  Time: 12:19 AM   kuch nhi
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
</head>
<body style="background-color: #ccccff;">
<div class="container">

    <form action="Student_storefeed" method="post">
        <div class="row">
            <div class="col-lg-4">

            </div>




            <div class="col-lg-4">


                <div class="row">

                    <div class="form-group">
                        <label for="feedback">Feedback:</label>
                        <textarea  rows="5" class="form-control" placeholder="${feedback}" id="feedback" name="feedback"></textarea>

                    </div>

                </div>
            </div>
            <div class="col-lg-4">

            </div>
        </div>

        <button type="submit" style="margin-left: 48%;" class="btn btn-default">Send</button>
    </form>
</div>
</body>
</html>
