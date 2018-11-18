<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .navtoph{
            width:100%;


            height:35px;


        }
        body{
            background-color:#ccccff;
        }

    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
            <div style="background-color:white;">
                <p><b>About site</b></p>
                <button type="button" class="btn btn-link"><a href="/admin_offers" target="frame2_admin">Offers</a></button><br>
                <button type="button" class="btn btn-link"><a href="/getapps" target="frame2_admin">Appointments</a></button><br>
                <button type="button" class="btn btn-link"><a href="/admin_board" target="frame2_admin">Board-Meet</a></button>
                <button type="button" class="btn btn-link"><a href="/setapp" target="frame2_admin">Set Appointment</a></button><br>
                <hr>
                <p><b>Hostel</b></p>
                <button type="button" class="btn btn-link"><a href="/getHostels" target="frame2_admin">Hostels</button>
                <button type="button" class="btn btn-link"><a href="/newreq" target="frame2_admin">New Requests</a></button>
                <button type="button" class="btn btn-link"><a href="/penreq" target="frame2_admin">Pending Hostel</a></button><br>
                <button type="button" class="btn btn-link"><a href="/delreq" target="frame2_admin">Remove Hostel</a></button><br>
                <hr>
                <p><b>Feedback</b></p>

                <button type="button" class="btn btn-link"><a href="/sitefeedbackreq" target="frame2_admin">Site feedback</a></button><br>
            </div>
        </div>

    </div>
</div>
</body>
</html>