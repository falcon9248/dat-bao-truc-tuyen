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
	<%@ include file = "header.jsp" %>
<div class="clear"></div>
	<div id="container">
		&nbsp;
		<h2></h2>
		 
		<form:form action="themgiobao" method="POST" modelAttribute="gioBao">

			<div class="grid-container">
				<div class="grid-item">
					${ctbao.maBao}<br /> ${ctbao.tenBao}<br /> <img
						src="<c:url value="/resources/${ctbao.anhBao}"/>" alt="" /><br />
					${ctbao.chiTietBao}<br />
					<p>
						<u>Giá:</u> ${ctbao.donGia}
					</p>

					
			Số Lượng: <form:input path="soLuong"/>
			<br/>
			Thời gian đặt: <form:input path="thoiGianDatBao"/>
			<br/>
			<form:button type="submit" >Thêm giỏ báo</form:button>
			<br/>
		</form:form>
				</div>
			</div>
		</form>
	</div>


	<div class="clear"></div>
	<%@ include file = "footer.jsp" %>
</body>
</html>