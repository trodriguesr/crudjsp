<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUD | JSP E SERVLETS</title>
</head>
<body>
	
	<form action="LoginServlet" method="post">
		<label>Login:
		<input type="text" id="login" name="login" >
		</label>
		<br/>
		<label>Password:
		<input type="text" id="password" name="password" >
		</label>
		<br/>
		<input type="submit" value="Send">
	</form>
	

</body>
</html>