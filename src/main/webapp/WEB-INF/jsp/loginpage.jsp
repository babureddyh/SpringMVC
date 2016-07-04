<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>${message}</h4>
	<form action="loginaction" name="login">
		<label>User name</label>
		<input name="userName" type="text" size="20" maxlength="20" /><br/>
		<label>Password</label>
		<input name="password" type="password" size="20" maxlength="20"/><br/>
		<input type="submit" value="Subtmi"/> <input type="reset" value="Reset Form"/>
	</form>
</body>
</html>