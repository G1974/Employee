<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>

<style>
#one {
margin-left: 700px;
font-size: 35px; 
}

P{

margin-left: 670px; 
}
form [type="text"]{
margin-top: 40px; 
margin-left: 200px;  
}
form{
    border: 2px double  #000000;
    margin-left: 590px;
    width: 575px;
    height: 250px;
}
form  [type="submit"]{
margin-left: 250px;
}
body{    background-color:grey;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><br><br><br><b>INSERT THE EMPLOYEE NUMBER FOR DELETE</b></p><br><br>
<form method="post" action="/EmployeeGeneral/DeleteController">
<input type="text" name="id" required placeholder="employeenumber"><br><br>
<button type="submit"> ENTER  </button>
</form>
<!-- <p><span style="color:red">THE EMPLOYEE DELETED</span></p> -->

<div id="one" style="color: red" > <br> ${warning}</div>
</body>
</html>