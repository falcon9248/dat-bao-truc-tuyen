<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Doanh nhân</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/index.css" />">
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="clear"></div>

	<div id="container">
		&nbsp;
		<h2></h2>
		<form id="baoForm">
			<div class="grid-container">
				<c:forEach items="${listbao}" var="bao">
					<div class="grid-item">
						<img src="<c:url value="/resources/${bao.anhBao}"/>" alt="" /><br />
						<p>${bao.tenBao}</p>
						<p>
							<u>Giá:</u> ${bao.donGia}
						</p>
						<c:url var="myURL" value="xemchitiet">
							<c:param name="maBao" value="${bao.maBao}" />
						</c:url>
						<a href="${myURL}">Xem chi tiết</a>
						<%-- <a href="xemchitiet/${bao.maBao}">Xem chi tiết</a> --%>
					</div>
				</c:forEach>

			</div>
		</form>
	</div>

	<div class="clear"></div>
	<%@ include file="footer.jsp"%>
</body>
</html>