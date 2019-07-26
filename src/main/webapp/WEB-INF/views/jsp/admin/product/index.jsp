<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách sản phẩm</title>
</head>
<body>

	<div>

		<table border="1" style="width: 60%">

			<tr>
				<td>Tên sản phẩm</td>
				<td>Loại</td>
				<td>Giá</td>
				<td>Sale</td>
				<td>Số lượng</td>
			</tr>
			<tr>

				<td>${product.name}</td>
				<td><c:if test="${not empty product.type}">
						<c:forEach var="type" items="${product.type}">${type}</c:forEach>
					</c:if></td>
				<td> ${product.price} </td>
				<td> ${product.sale} </td>
				<td> ${product.quantity} </td>
			</tr>
		</table>
	</div>

</body>
</html>