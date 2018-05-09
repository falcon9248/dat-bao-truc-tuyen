<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Duyệt đơn hàng</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/duyethd.css" />">
</head>
<body>
<%@ include file = "header.jsp" %>
<div class="clear"></div>

<div id="container">
	&nbsp;<h2></h2>
	<form id="baoForm" method="get">
		<div style="text-align: center">
			<input type="submit" name="submit" value="Cập nhật" onclick="return confirm('Bạn chắc chắn muốn cập nhật ?')" />
		</div>
		<br/>
		<table id="customers">
			<tr>
				<th>Mã hóa đơn</th>
				<th>Mã khách hàng</th>
				<th>Ngày lập hóa đơn</th>
				<th>Tổng tiền</th>
				<th>Trạng thái kiểm duyệt</th>
				<th>Mã người duyệt</th>
			</tr>
			<c:forEach items="${chitiet }" var="hd">
			<tr>
				<td><a href="hoadon/${hd.maHD }">${hd.maHD }</a></td>
				<td>${hd.maKH }</td>
				<td>${hd.ngayLapHD }</td>
				<td>${hd.tongTienHD }</td>
				<td style="text-align: center">
					<c:choose>
						<c:when test="${hd.trangThaiHD > 0 }">
							<input type="checkbox" name="${hd.maHD }" checked/>
						</c:when>
						<c:otherwise>
							<input type="checkbox" name="${hd.maHD }"/>
						</c:otherwise>
					</c:choose>
				</td>
				<td>${hd.maNguoiDuyet }</td>
			</tr>
			</c:forEach>
		</table>
		
    </form>
</div>

<div class="clear"></div>
<%@ include file = "footer.jsp" %>
</body>
</html>