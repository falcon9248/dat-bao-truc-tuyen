<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="clear"></div>
	<form:form action="login" method="POST" modelAttribute="taiKhoan">
		<table>
			<tr>
				<td>ID:</td>
				<td><form:input path="tenDangNhap" /></td>
			</tr>
			<tr>
				<td>PASS:</td>
				<td><form:password path="matKhau" /></td>
			</tr>
			<tr>
				<td>
					<button type="submit">login</button>
				</td>
			</tr>


		</table>
	</form:form>


	<c:if test="${loginFalse}">
		<font color="red">sai tên đăng nhập hoặc mật khẩu </font>
		<br />
		<br />
	</c:if>

	<div class="clear"></div>
	<%@ include file="footer.jsp"%>
</body>
</html>