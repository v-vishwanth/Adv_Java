<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>

    <h2>Register Form</h2>

    <form action = "save">
        <label>ID:</label><br>
        <input type="number" name="id"><br><br>

        <label>Name:</label><br>
        <input type="text" name="name"><br><br>

        <label>Phone:</label><br>
        <input type="tel" name="phone"><br><br>

        <label>Email:</label><br>
        <input type="email" name="email"><br><br>

        <input type="submit" value="Register">
    </form>

</body>
</html>