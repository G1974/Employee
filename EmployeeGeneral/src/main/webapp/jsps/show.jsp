<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/EmployeeGeneral/static/css/option.css">
<meta charset="UTF-8">
<title>SEARCHING PAGE</title>
</head>
<body>
<div class="headfile">
<p>Employee Details </p>
</div>

<div class="bot">
<form method="post" action="/EmployeeGeneral/EmployeeSearch"><br><br>
<input name="searchInput" type="text" placeholder="search employee"><br><br>
<button type="submit">Search</button>
</form>
</div>

<div class="headfile1">
<p>Insert Employee Details </p>
</div>

<div class="insert">
<form method="post" action="/EmployeeGeneral/EmployeeInsert">
<input name="employeenumber" type="text" placeholder=" id employee">&nbsp;&nbsp;
<input name="name" type="text" placeholder=" name employee">&nbsp;&nbsp;
<input name="surname" type="text" placeholder=" surname employee"><br><br>
<input name="married" type="text" placeholder=" married employee">&nbsp;&nbsp;
<input name="sex" type="text" placeholder=" sex employee">&nbsp;&nbsp;
<input name="birthdate" type="text" placeholder=" birthdate employee"><br><br>
<input name="address" type="text" placeholder=" address employee">&nbsp;&nbsp;
<input name="addressnumber" type="text" placeholder=" addressnumber employee">&nbsp;&nbsp;
<input name="postcode" type="text" placeholder=" postcode employee"><br><br>
<input name="mobilephone" type="text" placeholder=" mobilephone employee">&nbsp;&nbsp;
<input name="email" type="text" placeholder=" email employee">&nbsp;&nbsp;
<input name="position" type="text" placeholder=" work position employee">&nbsp;&nbsp;<br><br>&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input name="nationality" type="text" placeholder=" nationality employee"><br><br>

<button type="submit">Insert</button>
</form >
</div>
<div class="fin">
<div class="more0">
<a href="/EmployeeGeneral/jsps/DeleteEmployee.jsp"><button type="submit" >Delete</button></a>
<a href="/EmployeeGeneral/jsps/UpdateEmployee.jsp"><button type="submit" >Update</button></a>
</div>
<div class="more1">
 
</div>
</div>
</body>
</html>