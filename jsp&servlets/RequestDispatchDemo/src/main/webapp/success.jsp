<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>user Details</h2>

<%
String employeeName = (String)request.getAttribute("employeeName");
String city = (String)request.getAttribute("city");
double salary = (Double)request.getAttribute("salary");
String course =(String)request.getAttribute("course");
Long mobile = (Long)request.getAttribute("mobileNum");
String[] hobbies = (String[])request.getAttribute("hobbies");

out.println("Name: "+employeeName+"<br>");
out.println("city: "+city+"<br>");
out.println("salary: "+salary+"<br>");
out.println("selected course: "+course+"<br>");
out.println("mobile : "+mobile+"<br>");
out.println(" Hobbies: ");
for(String hobby:hobbies){
	out.println("hobby: "+hobby.toUpperCase()+"<br>");
}
%>


</body>
</html>