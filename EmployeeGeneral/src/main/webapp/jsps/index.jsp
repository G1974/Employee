<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>	
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LOGIN FORM</title>
<link rel="stylesheet" href="/EmployeeGeneral/static/css/index.css"> 
</head>
<body>
<!-- <br><br><marquee><h3>LOGIN FORM</h3></marquee>  -->
<!--  <p><span>PLEASE TYPE YOUR CREDENTIALS</span></p><br><br>-->


<form  method="post" action="/EmployeeGeneral/LoginController">
<div class="logi">
<input  type="email" name="em" required placeholder="E-mail" ><br><br>
</div>
<div class="logi">
<input type="password" name="pa" required placeholder="Password"><br><br>
</div>
<div class="btns">
<button type="submit"> ENTER  </button>
</div>
</form>
<div class=errors style="color: red"> <br> ${error}</div>
</body>
</html>