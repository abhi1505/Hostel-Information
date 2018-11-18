
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    div.abc{
        width:40%;
    }
</style>
</head>
<body>
<div class="container">

<form method="post" action="/admin_boarddate">
    <div class="form-group">
        <br>
        <br>
        <br>
        <label for="datu" style="font-size:large; ">Choose date for next Board meet.</label>
        <div class="abc">
       <input type="date" name="datu" class="form-control" id="datu">
        </div>
    </div>
    <button type="submit" class="btn btn-default">Set</button>
</form>
    <br>
<h1 style="font-size: large;">You decided next board meeting at: ${datu} </h1>

</div>
</body>
</html>
