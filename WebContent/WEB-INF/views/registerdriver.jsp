<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form action="${pageContext.request.contextPath}/reg-driver" method="post">
		
			
			<input type="password" name="password" placeholder="Password" required>
			<br>
			<input type="text" name="vehicleType" placeholder="Vehicle Type" required>
			<input type="text" name="plateNumber" placeholder="Plate Number" required>
			<input type="text" name="firstName" placeholder="First Name" required>
			<input type="text" name="lastName" placeholder="Last Name" required>
			<input type="text" name="middleName" placeholder="Middle Name" required>
			<input type="date" name="birthDay" placeholder="Birth Day" required>
			<input type="text" name="age" placeholder="Age" required>
			<input type="email" name="emailAddress" placeholder="Email Address" required>
			<input type="text" name="currentCity" placeholder="Current City" required>
			<input type="text" name="homeProvince" placeholder="Home Province" required>
			<input type="number" name="mobileNumber" placeholder="Mobile Number" required>
			<br><br>
			<input type="text" name="workingCity" placeholder="Working City" required>
			<input type="text" name="workingBarangay" placeholder="Working Barangay" required>
			<input type="text" name="workingSubdivision" placeholder="Working Subdivision" required>
			<input type="text" name="workingProvince" placeholder="Working Province" required>
			<input type="text" name="timeAvailability" placeholder="Time Availability" required>
			
			
			<input type="submit" value="submit">
		</form>
	</body>
</html>