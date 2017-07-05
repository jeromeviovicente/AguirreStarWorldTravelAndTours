<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Passenger Registration</title>
	</head>
	
	<body>
		
		<div>
			<form action="${pageContext.request.contextPath}/passenger-reg" method="post">
				<input type="text" name="userName" placeholder="Username" required>
				<input type="password" name="password" placeholder="Password" required>
				<input type="text" name="firstName" placeholder="First Name" required>
				<input type="text" name="lastName" placeholder="Last Name" required>
				<input type="text" name="middleName" placeholder="Middle Name" required>
				<input type="date" name="birthDay" placeholder="Birth Day" required>
				<input type="number" name="age" placeholder="Age" required>
				<input type="email" name="email" placeholder="Email Address" required>
				<br>
				<input type="text" name="line1" placeholder="Line 1" required>
				<input type="text" name="line2" placeholder="Line 2" required>
				<input type="text" name="line3" placeholder="Line 3" required>
				<input type="text" name="country" placeholder="Country" required>
				<input type="text" name="state" placeholder="State" required>
				<input type="text" name="city" placeholder="City" required>
				<input type="text" name="zipCode" placeholder="Zip Code" required>
				<br>
				<input type="text" name="contactNumber" placeholder="contact number" required>
				<input type="submit" value="submit">
			</form>
		</div>
		
		
	</body>
</html>