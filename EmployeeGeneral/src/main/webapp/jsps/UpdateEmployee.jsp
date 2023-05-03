<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/EmployeeGeneral/static/css/update.css">
<meta charset="UTF-8">
<title>Employee Update</title>
</head>
<body>
<p>ENTER UPDATE DETAILS</p>
<form  method="post" action="/EmployeeGeneral/EmployeeUpdate">
<div class="logi1">
<input  type="text" name="mobile" required placeholder="mobile" ><br><br>
</div>
<div class="logi2">
<input type="text" name="email" required placeholder="e-mail"><br><br>
</div>
<div class="logi3">
<input type="text" name="address" required placeholder="address"><br><br>
</div>
<div class="logi4">
<input type="text" name="addressnumber" required placeholder="address number"><br><br>
</div>
<div class="logi5">
<input type="text" name="postcode" required placeholder="post code"><br><br>
</div>
<div class="logi6">
<input type="text" name="employeenumber" required placeholder="employee number"><br><br>
</div>
<div class="btns">
<button type="submit"> ENTER  </button>
</div>
</form>
<div class="one" style="color: red"> <br> ${error}</div>
<div class="second" style="color: green"> <br> ${warning}</div>

</body>
</html>