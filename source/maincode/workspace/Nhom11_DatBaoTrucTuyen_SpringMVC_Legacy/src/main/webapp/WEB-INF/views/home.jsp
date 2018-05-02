<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
.a {
	width: 160px;
	height: 200px;
	border: 1px solid black;
	padding: 5px;
	margin: 10px;
	float: left;
	text-align: center;
}

.hinh {
	width: 80px;
	height: 100px;
}
</style>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is </P>

<a href="dangnhap"> Đăng Nhập |</a>
<a href="quanly"> Quản Lý |</a>
<a href="giohang">Giỏ Hàng</a><br/>

<table>
		<tr>
			<td>maBao</td>
			<td>tenBao</td>
			<td>chuKyXuatBan</td>
			<td>donGia</td>
			<td>maNhaXuatBan</td>
		</tr>
		<c:forEach items="${listbao}" var="bao">
			<tr>
				<td>${bao.maBao}</td>
				<td>${bao.tenBao}</td>
				<td>${bao.chuKyXuatBan}</td>
				<td>${bao.donGia}</td>
				<td>${bao.imgBao}</td>
				<td>${bao.maNhaXuatBan}</td>
			</tr>
		</c:forEach>
	</table>
	
	<form id="baoForm">
		<c:forEach  items="${listbao}" var="bao">
			<div class="a">

				${bao.maBao}<br/>
				${bao.tenBao}<br/>

				<img src="${s.imgBao}" class='hinh'></img><br />
				${bao.chuKyXuatBan}<br/>
				${bao.maNhaXuatBan}<br/>
				${bao.donGia} <br />

				<%-- <h:inputText id="qty" value="${s.qty}" size="10" maxlength="10" /> --%>
				<br />
				<a href="addtocart"> Add To Cart</a>
				<br />


			</div>
		</c:forEach>
	</form>
</body>

</html>
