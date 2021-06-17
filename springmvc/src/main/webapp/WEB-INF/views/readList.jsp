<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.steve.spring.springmvc.dto.Employee , java.util.ArrayList"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read List</title>
</head>
<body>
<%
List<Employee> employees =  (List<Employee>)request.getAttribute("employees");
for(Employee employee : employees){
	out.println(employee.getId());
	out.println(employee.getName());
	out.println(employee.getSalary());
}
%>
</body>
</html>