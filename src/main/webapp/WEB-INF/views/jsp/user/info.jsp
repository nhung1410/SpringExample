<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin tài khoản</title>
</head>
<body>
<div>
	<table>
		<tr>
			<td>Username: </td>
			<td>${us} </td>
		</tr>
		<tr>
			<td>Password: </td>
			<td>${pw} </td>
		</tr>
		<tr>
			<td colspan="2">Cập nhật thông tin người dùng</td>
			<form:form>
				
			</form:form>
		</tr>
	</table>
</div>

</body>
</html>