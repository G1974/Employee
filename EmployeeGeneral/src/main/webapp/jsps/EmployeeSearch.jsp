<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<style>

table{
margin-left: auto;
  margin-right: auto;
}

table, th, td {
  border: 1px solid;
  text-align: center;
  }
th{
background-color:MediumSlateBlue;
}
td{background-color:SteelBlue;}
body{background-color:grey;}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
	<th>EMPLOYEE NUMBER  </th>
	<th>NAME  </th>
	<th>SURNAME  </th>
	<th>MARRIED  </th>
	<th>SEX  </th>
	<th>BIRTH DATE  </th>
	<th>ADDRESS</th>
	<th>ADDRESS NUMBER  </th>
	<th>POSTCODE  </th>
	<th>MOBILEPHONE  </th>
	<th>E-MAIL  </th>
	<th>WORK POSITION  </th>
	<th>NATIONALITY  </th>
</tr>
<c:forEach var="row" items= "${search}">
	<tr>
	<td> ${row.employeeNumber}</td>
	<td> ${row.name}</td>
	<td> ${row.surname}</td>
		<td> ${row.married}</td>
			<td> ${row.sex}</td>
				<td> ${row.bornDate}</td>
					<td> ${row.address}</td>
						<td> ${row.addressNumber}</td>
							<td> ${row.postCode}</td>
								<td> ${row.mobile}</td>
									<td> ${row.email}</td>
										<td> ${row.position}</td>
											<td> ${row.nationality}</td>
	</tr>
</c:forEach>

</table>
</body>
</html>