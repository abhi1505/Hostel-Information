<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 08-08-2017
  Time: 21:35
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
        h1 {
            color: #369;
            font-family: Arial, Helvetica, sans-serif;
            font-size: 250%;
        }
        .container{
            width:600px;
            height:350px;
            margin:100px auto;
            background-color: white;
            box-shadow: 2px 3px 15px -8px;
        }

        .content{
            height:250px;
            text-align: center;
            padding: 70px;
        }

        .content span{
            margin-bottom: 30px;
        }

        .title{
            width:100%;
            height:90px;
            font-size: 28px;
            color: white;
            padding: 20px;
            background: #000066;
        }

        .panel-body{
            padding: 15px;
        }

        .panel-body span{
            color:red;
        }
        .panel-body button{
            float:left;
        }
        span{
            vertical-align:middle;
        }
        body{
            background-color:  #ccccff;
        }

    </style>
</head>
<body>
<div class="container" >
    <div class="title">
        Welcome
    </div>
    <div class="panel-body">
        <div class="row">
            <form action="DoSignup" method="post">
                <div class="input-field col s12">
                    <label for="email">Username</label>
                    <input  id="email" name="unam"
                            type="text">

                </div>
        </div>
        <br>

        <div class="row">
            <div class="input-field col s12">
                <label for="password">Password</label>
                <input id="password" name="pass"
                       type="password" class="validate">

            </div>
        </div>

        <br>
        <input type="hidden" name="type_hs" value="Hostel">
        <button
                class="btn waves-effect waves-light"
                type="submit" name="action">Signup</button>
        </form>
    </div>
</div>

</body>
</html>
