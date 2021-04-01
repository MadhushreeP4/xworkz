<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration for Maja Talkies</h1>
${msg}
<form action="registration" method="post">
<div>
<input type="text" name="name" placeholder="enter name">
<input type="text" name="email" placeholder="enter email">
</div>
<div>
<input type="text" name="location" placeholder="enter current location">
<input type="text" name="hobbies" placeholder="enter minimum one hobby">
</div>
<input type="submit" value="register">
</form>
<a href="upload.jsp">Upload file here</a>
</body>
</html>