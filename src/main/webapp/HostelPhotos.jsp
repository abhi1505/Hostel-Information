<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 03-11-2017
  Time: 09:25
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
       h1{
           text-align: center;
       }
       body{
           background-color: #ccccff;
       }
   </style>
</head>
<body>
<h1>Upload photos </h1>
<hr>
<div class="container">
    <div class="row">

        <div class="col-lg-4"></div>
        <div class="col-lg-6">
            <img style="margin-right: 10px;" src="/smile.png" height="50%" width="50%"/>
        </div>
    </div>
    <form action="uploadphotos" method="post" enctype="multipart/form-data">
        <div class="row">
            <div class="col-lg-4">

            </div>




            <div class="col-lg-4">



                <div class="row">
                    <div class="form-group">
                        <label for="files">Pic1*</label>
                        <input type="file"  class="form-control" id="files" name="files"/>
                    </div>
                </div>




                <div class="row">
                    <div class="form-group">
                        <label for="files">Pic2:</label>
                        <input type="file"  class="form-control" id="files" name="files"/>
                    </div>
                </div>


                <div class="row">
                    <div class="form-group">
                        <label for="files">Pic3:</label>
                        <input type="file"  class="form-control" id="files" name="files"/>
                    </div>
                </div>


                <div class="row">
                    <div class="form-group">
                        <label for="files">Pic4:</label>
                        <input type="file"  class="form-control" id="files" name="files"/>
                    </div>
                </div>

            </div>
            <div class="col-lg-4">

            </div>
        </div>

        <button type="submit" style="margin-left: 48%;" class="btn btn-default">Upload</button>

    </form>
</div>
</body>
</html>
