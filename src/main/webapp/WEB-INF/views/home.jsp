<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>Employee List</h1>
        <h3>
            <a href="studentNewForm">New Student</a>
        </h3>
        <table border="1">
            <th>Id</th>
            <th>Name</th>
            <th>branch</th>
            <th>Address</th>
            <th>rollnum</th>
            <th>Action</th>
 
            <c:forEach var="student" items="${listStudent}">
                <tr> 
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.branch}</td>
                    <td>${student.address}</td>
                    <td>${student.rollnum}</td>
                    <td><a href="editStudent?id=${student.id}">Edit</a>
                             <a
                        href="deleteStudent?id=${student.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
 </html>