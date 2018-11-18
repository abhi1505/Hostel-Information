<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/26/2017
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body{
    background-color: #ccccff;
}
</style>
</head>
<body>

<div class="container">

  <form method="post" action="/givehostels">
    <div class="row">

      <div class="form-group">
          <div class="col-lg-7">
      <input list="areas" class="form-control" style="width: 65%; height: 40px; margin-top: 25%;" placeholder="Search for hostels in any areas" name="areas" >


      <datalist id="areas">

          <option value="gandhinagar"></option>

          <c:if test="${not empty lists}">
              <c:forEach var="h" items="${lists}">

                  <option value="${h}"></option>



              </c:forEach>

          </c:if>



      </datalist>
          </div>
          <div class="col-lg-3">
              <button type="submit" style="margin-top: 4%; margin-left: 25%;" class="btn btn-info"> <span class="glyphicon glyphicon-search"></span>Search</button>
          </div>

      </div>

    </div>

  </form>
</div>
</body>
</html>
