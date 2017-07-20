<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css">
		<title>Git Result Search</title>
		
	</head>
	
	<body>
		<div>
			<table id="resultTable" class="display" cellspacing="0" width="100%">
       			<thead>
            		<tr>
		                <th>Git</th>
		                <th>Departure</th>
		                <th>Airport</th>
		                <th>Price</th>
		                <th></th>
		            </tr>
		        </thead>
				<tbody>
					<c:forEach items="${list}" var="data">
						 <tr>
			                <td>${data.git}</td>
			                <td>${data.departure}</td>
			                <td>${data.airport}</td>
			                <td>${data.price}</td>
			                <td><button>Book</button></td>
			            </tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
							<!-- JavaScripts -->
	<script language="JavaScript" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script language="JavaScript" type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script language="JavaScript" type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
	<script language="JavaScript" type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.min.js"></script>
	<!-- <script language="JavaScript" type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script> -->
	
	<script type="text/javascript">
			$(document).ready(function() {
				$('#resultTable').DataTable();
			});
		</script>
</html>