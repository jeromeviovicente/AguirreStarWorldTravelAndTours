<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form action="${pageContext.request.contextPath}/driver-reg" method="post">
		
			
			<input type="text" name="userName" placeholder="UserName">
			<input type="password" name="password" placeholder="Password">
			<br>
			<input type="text" name="vehicleType" placeholder="Vehicle Type">
			<input type="text" name="plateNumber" placeholder="Plate Number">
			<input type="text" name="firstName" placeholder="First Name">
			<input type="text" name="lastName" placeholder="Last Name">
			<input type="text" name="middleName" placeholder="Middle Name">
			<input type="date" name="birthDay" placeholder="Birth Day">
			<input type="text" name="age" placeholder="Age">
			<input type="email" name="emailAddress" placeholder="Email Address">
			<input type="text" name="currentCity" placeholder="Current City">
			<input type="text" name="homeProvince" placeholder="Home Province">
			<input type="number" name="mobileNumber" placeholder="Mobile Number">
			<br><br>
			<input type="text" name="workingCity" placeholder="Working City">
			<input type="text" name="workingBarangay" placeholder="Working Barangay">
			<input type="text" name="workingSubdivision" placeholder="Working Subdivision">
			<input type="text" name="workingProvince" placeholder="Working Province">
			<input type="text" name="timeAvailability" placeholder="Time Availability">
			
			
			<input type="submit" value="submit">
		</form>
	</body>
</html>