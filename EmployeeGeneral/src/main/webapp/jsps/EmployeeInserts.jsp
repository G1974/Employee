<%@ page language="java" contentType="text/html; charset=UTF-8"%> 
<%@ page isELIgnored="false" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
p{
margin-left: 550px;
   color: green;
}
body{    background-color:grey;}
</style>
<meta charset="UTF-8">
<title>SUCCESSFULLY INSERTED </title>
</head>
<body>
<p  style="font-size:25px">
   <b><span style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;NEW EMPLOYEE DETAILS<br><br></span></b>
        EMPLOYEE NUMBER: <span style="color:black">${inserts.employeeNumber} </span>&nbsp;&nbsp;
	 	NAME: <span style="color:black">${inserts.name}</span>&nbsp;&nbsp;
	 	SURNAME: <span style="color:black">${inserts.surname} <br><br></span>
	 	MARRIED: <span style="color:black">${inserts.married} </span>&nbsp;&nbsp;
	 	SEX: <span style="color:black">${inserts.sex} </span>&nbsp;&nbsp;
	 	BIRTHDATE: <span style="color:black">${inserts.bornDate} <br><br></span>
	 	ADDRESS: <span style="color:black">${inserts.address} </span>&nbsp;&nbsp;
	 	ADDRESS NUMBER: <span style="color:black">${inserts.addressNumber} </span>&nbsp;&nbsp;
	 	POST CODE: <span style="color:black">${inserts.postCode} <br><br></span>
	 	MOBILEPHONE: <span style="color:black">${inserts.mobile}</span>&nbsp;&nbsp;
	 	E-MAIL: <span style="color:black">${inserts.email} </span>&nbsp;&nbsp;
	 	WORK POSITION: <span style="color:black">${inserts.position} <br><br></span>
	 	NATIONALITY: <span style="color:black">${inserts.nationality} <br><br></span>
	 	<b>successfully inserted!</b>
	   	</p>

</body>
</html>