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
        .col-lg-1{
            text-align:center;
            width:160px;
            border-right:solid 1px;
            border-color:white;
        }
        #siz{
            width:250px;
        }
        .navtophlist{
            list-style-type: none;
        }

        .navtophlist  a{
            text-color:white;
            color:white;
            padding-top: 0px;

            display: inline-block;
            text-align:center;
            text-decoration: none;
        }
        a.visited{
            color:white;
            text-decoration: none;
        }
        .navtophlist  li{
            color:white;
            height:35px;
            padding-top: 8px;

            display: inline-block;
            text-align:center;
            text-decoration: none;
        }

        body{
            background-color:#ccccff;
        }
        h1{
            color:#000066;
        }
    </style>

</head>
<body>
<h1>ADMIN PANEL</h1>
<div class="container navtoph">
    <div class="row">
        <ul class="navtophlist">
            <div class="col-lg-1">
                <li> Welcome admin</li>
            </div>

            <div class="col-lg-1">
                <li> <a href="/Loginreq" class="log"> Logout</a></li>
            </div>
            <div class="col-lg-1" id="siz">
                <li id="date1"></li>
            </div>

        </ul>
    </div>
</div>
<script>
    var today = new Date();
    var dd = today.getDate();
    var weekday = new Array(7);
    weekday[0] =  "Sunday";
    weekday[1] = "Monday";
    weekday[2] = "Tuesday";
    weekday[3] = "Wednesday";
    weekday[4] = "Thursday";
    weekday[5] = "Friday";
    weekday[6] = "Saturday";
    var month = new Array(12);
    month[0] = "January";
    month[1] = "February";
    month[2] = "March";
    month[3] = "April";
    month[4] = "May";
    month[5] = "June";
    month[6] = "July";
    month[7] = "August";
    month[8] = "September";
    month[9] = "October";
    month[10] = "November";
    month[11] = "December";
    var day=weekday[today.getDay()];
    var mm = month[today.getMonth()]; //January is 0!
    var yyyy = today.getFullYear();

    if(dd<10) {
        dd = '0'+dd
    }

    if(mm<10) {
        mm = '0'+mm
    }
    today = day + ' ' + dd + ' ' + mm + ' , '+ yyyy;
    document.getElementById('date1').innerHTML=today;
</script>
<br>
<br>
<br>
<iframe src="/option" width="25%" height="100%" frameborder="0"></iframe>
<iframe name="frame2_admin" width="65%" height="100%" frameborder="0"></iframe>

</body>
</html>