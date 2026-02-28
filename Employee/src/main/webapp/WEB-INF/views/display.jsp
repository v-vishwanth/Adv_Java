<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Saved Details</title>
</head>
<body>

    <h2>Registered Users</h2>

    <table border="1" cellpadding="8">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>

        <tr>
            <td>101</td>
            <td>Vishwanth</td>
            <td>9876543210</td>
            <td>vish@gmail.com</td>
            <td>
                <form action="update" method="post" style="display:inline;">
                    <input type="submit" value="Update">
                </form>

                <form action="delete" method="post" style="display:inline;">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>

    </table>

</body>
</html>