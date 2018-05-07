<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/index.css" />">
</head>
<body>
<div id="header">
		<!-- nav top -->
		<div>
			<div id="h-top-right">
				<ul>
				
					<c:choose>
						<c:when test="${not login}">
        					<li><a href="login">Đăng nhập</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="logout">Đăng Xuất</a></li>
							<li><a href="#">${taiKhoan.tenDangNhap}</a></li>
							
						</c:otherwise>
					</c:choose>
					
					
					<li><a href="giobao">Giỏ báo</a></li>
				</ul>
			</div>
		</div>
		<div id="clear"></div>
		<!-- header hinh -->
		<div id="h-bot">
			<div id="h-bot-left">
				<img src="<c:url value="/resources/images/logo.jpg" />" width="150"
					height="150" alt="logo" />
			</div>
			<div id="h-bot-right">
				<img src="<c:url value="/resources/images/hinhnen.jpg"/>"
					width="857" height="150" alt="" />
			</div>
		</div>
	</div>
	<div class="clear"></div>
	<!-- nav -->
	<div id="nav">
		<a href="index">Trang chủ</a> <a href="amthuc">Ẩm thực</a> <a
			href="doanhnhan">Doanh nhân</a> <a href="thethao">Thể thao</a> <a
			href="doisong">Đời sống</a>
		<div id="search-container">
			<form action="#">
				<input type="text" placeholder="Tìm kiếm ..." name="timKiem" />
				<button type="submit" id="btntimKiem">Tìm kiếm</button>
			</form>
		</div>
	</div>
	</body>
</html>