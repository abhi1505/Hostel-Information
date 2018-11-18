<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>

        body{
            background-color:#ccccff;

        }
        img{
            position: absolute;
            left: 17%;
            top:17%;
            align:left;
        }
        div.a{
            position: absolute;
            left: 37%;
            top:17%;
            font-size: 30;

        }
        input.yo{

            display: inline-block;
            width: 245px;
            height: 30px;
            border-radius:10px;

        }
        input.yoA{

            display: inline-block;
            width: 295px;
            height: 150px;
            border-radius:10px;

        }
        select.yoG{
            position: absolute;
            display: inline-block;
            width: 200px;
            height: 30px;
            border-radius:10px;
            left:33%;
            background-color: #000080;
            color:antiquewhite;
        }

        .bro label{
            display: inline-block;
            width: 140px;
        }
        input{
            background-color: #000080;
            color:antiquewhite;
        }
        p{
            color:red;
        }
    </style>





</head>
<body >
<%   response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");  %>
<h1 style="margin-left: 40%;">Registration Form</h1>
<div class="a">

    <form name="signu" action="DoSignup" method="post">
        <div class="bro"><label> Name*: </label> <input  class="yo" type="text" name="nam" ><br><br>   </div>
        <div class="bro"> <label> Address:</label> <input class="yoA"  type="text" name="addr"><br><br>   </div>
        <div class="bro"> <label> Contact:</label> <input class="yo" type="text" name="cont"><br><br>   </div>
        <div class="bro"><label> Age*:</label> <input class="yo" type="text" name="age"><br><br>   </div>
        <div class="bro">  <label>Gender:</label><select class="yoG">
            <option value="Male"> Male</option>
            <option value="Female"> Female</option>
        </select> </div> <br>
        <div class="bro"><label>Username*:</label> <input type="text" class="yo"  name="unam"><br><br>
            <%
                String offer=(String)session.getAttribute("loginerror");
                if (offer != null) {
                    if(offer.equals("yes"))
                    {
                        session.setAttribute("loginerror","no");
            %> <p> Username already exists!</p>
            <%
                    }
                }
            %></div>
        <div class="bro"><label>Password*:</label> <input type="password" class="yo"  name="pass"> </div><br>
        <div class="bro"><label>Name of Hostel(if any):</label> <input type="text" class="yo"  name="hostel_admit"> </div><br>
        <input type="hidden" name="type_hs" value="Student">
        <!--<div class="bro">  <label>Type:</label><select name="type_hs" class="yoG">
            <option value="Hostel"> Hostel</option>
            <option value="Student"> Student</option>
        </select> </div>-->

        <button class="btn btn-primary" type="submit" style="width:150px;height: 40px;margin-left:24%;background-color: #000066" > Sign Up</button>


    </form>
</div>
</body>















</html>