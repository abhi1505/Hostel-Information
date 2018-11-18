<%--
  Created by IntelliJ IDEA.
  User: abhilasha
  Date: 08-10-2017
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.*" %>
<%@ page import="org.apache.taglibs.standard.lang.jstl.test.PageContextImpl" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://www.w3schools.com/lib/w3.js"></script>
    <style>
        .container{

            height:100%;
            width:100%;
        }
        body{
            background-color: #000066;
            color:white;
        }
        tr:hover{
            background-color: #ccccff;
            color: #000066;
        }
        button.abcd{
            color:#660066;

        }

        button.abcd:hover{
            color: white;
        }
    </style>


</head>
<body>

<div class="container">
<br>
    <br>



<% int count=1; %>







    <form action="/solvecomplaint" method="post" >





            <c:if test="${not empty lists}">
                <c:forEach var="h" items="${lists}">
        <div style="width: 100%; height:200px;background-color:  #b3b3ff;color: black;">

                        <p style="text-align: center; font-size: 27px; color:#660066;">Complaint <%=count%>  <% count++; %>
                        <hr>

            </p>

                <div style="margin-left: 2%; color:#660066; font-size: 25px;">        ${h.complaint} </div>
            <c:set var="disa" value="${h.flag_comp}" scope="request"/>

<br>

<br>

            <%   String s="";
                /*PageContextImpl pageContext1=new PageContextImpl();
                s=s+(String)pageContext1.getAttribute("disa");*/
                System.out.println("dis"+" "+request.getAttribute("disa"));
                if(request.getAttribute("disa").equals("SOLVED")){
            %>

            <button type="submit" class="btn btn-danger abcd" style=" margin-left: 2%;" name="${h.sid}" disabled="disabled">Solved</button>

<%                                      }       else{ %>
            <button type="submit" class="btn btn-danger abcd" style=" margin-left: 2%;" name="${h.sid}" >Solved</button>
                                     <%  }  %>


</div>
                    <br>












                </c:forEach>

            </c:if>




    </form>

</div>

</body>
</html>

