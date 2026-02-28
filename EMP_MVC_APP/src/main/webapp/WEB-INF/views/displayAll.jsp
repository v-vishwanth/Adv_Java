<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f6f9;
    padding: 40px;
}

table {
    width: 80%;
    margin: auto;
    border-collapse: collapse;
    background-color: white;
    box-shadow: 0 4px 10px rgba(0,0,0,0.1);
}

th {
    background-color: #2c3e50;
    color: white;
    padding: 12px;
}

td {
    padding: 10px;
    text-align: center;
    border-bottom: 1px solid #ddd;
}

tr:hover {
    background-color: #f1f1f1;
}

a {
    text-decoration: none;
    padding: 6px 12px;
    border-radius: 4px;
    font-size: 14px;
    color: white;
}

a[href*="edit"] {
    background-color: #3498db;
}

a[href*="delete"] {
    background-color: #e74c3c;
}
</style>

</head>
<body>

<h2 style="text-align:center;">Employee List</h2>

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Update</th>
    <th>Delete</th>
</tr>

<c:forEach var="emp" items="${employees}">
<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.phone}</td>
    <td>${emp.email}</td>
    <td><a href="edit?id=${emp.id}">Update</a></td>
    <td><a href="delete?id=${emp.id}">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>