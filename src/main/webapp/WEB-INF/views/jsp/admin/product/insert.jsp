<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm</title>
</head>
<body>
	<div>
		<form:form method="POST" action="view-product" modelAttribute="product">
			<table >
				<tr>
					<td> <form:label path="name">Tên sản phẩm</form:label> </td>
					<td><form:input path="name"/> </td>
				</tr>
				<tr>
					<td> <form:label path="type">Loại sản phẩm</form:label> </td>
					<td><form:select path="type" items="${type }" itemLabel="name" itemValue="id" ></form:select> </td>
				</tr>
				<tr>
					<td> <form:label path="price">Giá</form:label> VND</td>
					<td><form:input path="price"/> </td>
				</tr>
				<tr>
					<td> <form:label path="sale">Giảm giá</form:label> </td>
					<td><form:input path="sale"/> %</td>
				</tr>
				<tr>
					<td> <form:label path="quantity">Số lượng</form:label> </td>
					<td><form:input path="quantity"/> </td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Thêm" /> </td>
				</tr>
				
			</table>
		</form:form>
	</div>

</body>
</html>