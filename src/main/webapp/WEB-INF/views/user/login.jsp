<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
	<div>
		<h2>Login</h2>
		${loginFail}
		<form:form method="GET" action="login">
			<table>
			
				<tr>
					<td>Name</td>
					<td><input type="text" name="us"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="login" /></td>
				</tr>

			</table>
		</form:form>
	</div>

</body>
</html>