
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STUDENT INFORMATION SYSTEM</title>
         <style>
        *{
            margin: 0;
            padding: 0;
        }
        h1{
            text-align: center;
            padding: 20px;
        }
        h2{
            text-align: center;
            padding: 20px;
        }
        .register{
            background: #2d85b0;
            width: 500px;
            margin: 0px 0px 0px 480px;
            color: white;
            font-size: 18px;
            padding: 20px;
            border-radius: 10px;
        }
        #register{
            margin-left: 80px;
        }
        label{
        color: white;
        font-family: sans-serif; 
        font-size: 18px;
        font-style: italic;
        }
        #name{
            width: 300px;
            border: none;
            border-radius: 3px;
            outline: 0;
            padding: 7px;
        }
        #ph{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
        #log{
            width: 120px;
            padding: 7px;
            font-size: 16px;
            font-family: sans-serif;
            font-style: italic;
            font-weight: 600;
            border: none;
            border-radius: 3px;
        }
        #can{
                width: 120px;
            padding: 7px;
            font-size: 16px;
            font-family: sans-serif;
            font-style: italic;
            font-weight: 600;
            border: none;
            border-radius: 3px;
        }
        #dept{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
      
        </style>
    </head>
    <body style="background-color: rgb(243,254,255);">
        <div align="center">  
      <img src="studentinfo.jpg" width=100 height=80 id="img1"/>
<font face="vijaya" size=30px color="black">STUDENT INFORMATION SYSTEM</font>
</div>
    </br>
<%@include file="Facultyprofilecss.html" %>
<br>
<br>
<%
    String k=(String)session.getAttribute("id");
%>
        <h1 align="center">ASSIGNMENT MARKS</h1>
<div class="register">
<h2>Assgin Here</h2>
<form id="register" action="AssignAssignmentMarksAction.jsp">
<label>Registration No</label><br>
<input type="text" name="Uname" id="name" placeholder="Enter RegNo" required=""><br><br>
<label>Course Name</label><br>
<input type="text" name="Cname" id="name" placeholder="Enter CourseName" required=""><br><br>
<label>Assignment Number</label><br>
<select id="dept" name="dept">
<option>Assginment 1</option>
<option>Assginment 2</option>
<option>Assginment 3</option>
</select><br><br>
<label>Assignment Type</label><br>
<select id="dept" name="dept1">
<option>Digital Assginment</option>
<option>Project Assginment</option>
</select><br><br>

<label>Marks</label><br>
<input type="text" name="date" id="name" placeholder="Enter Marks" required=""><br><br>


<input type="submit" value="Mark" id="log">
<input type="reset" value="Cancel" id="can">


</form>
</div>
    </body>
</html>
