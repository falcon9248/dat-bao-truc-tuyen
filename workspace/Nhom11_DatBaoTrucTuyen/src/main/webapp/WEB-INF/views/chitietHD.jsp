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
<div id="header">
<!-- nav top -->
<div>
	<div id="h-top-right">
    	<ul>
        	<li><a  href="#">Đăng nhập</a></li>
            <li><a  href="#">Tên người dùng</a></li>
            <li><a  href="#">Giỏ báo</a></li>
        </ul>
    </div>		
</div>
<div id="clear"></div>
<!-- header hinh -->
<div id="h-bot">
	<div id="h-bot-left">
    	<img src="<c:url value="/resources/images/logo.jpg" />" width="150" height="150" alt="logo"/>
    </div>
    <div id="h-bot-right">
    	<img src="<c:url value="/resources/images/hinhnen.jpg"/>" width="857" height="150" alt=""/>
    </div>
</div>
</div>
<div class="clear"></div>
<!-- nav -->
<div id="nav">
	<a  href="/">Trang chủ</a>
	<a  href="amthuc">Ẩm thực</a>
	<a  href="doanhnhan">Doanh nhân</a>
	<a  href="thethao">Thể thao</a>
	<a  href="doisong">Đời sống</a>
    <div id="search-container">
    	<form action="#">
        	<input type="text" placeholder="Tìm kiếm ..." name="timKiem"/>
        	<button type="submit" id="btntimKiem" >Tìm kiếm</button>
        </form>
    </div>
</div>
<div class="clear"></div>

<div id="container">
	&nbsp;<h2></h2>
	<form id="baoForm" method="get">
		<div style="text-align: center">
			<a href="quaylai">Quay lại</a>
		</div>
		<br/>
		<table id="customers">
			<tr></tr>
			<tr>
				<th>Tên báo</th>
				<th>Số lượng</th>
				<th>Thành tiền</th>
				<th>Thời gian đặt</th>
			</tr>
			<c:forEach items="${chitiet }" var="ct">
			<tr>
				<td>${ct.maBao }</td>
				<td>${ct.soLuong }</td>
				<td>${ct.thanhTien }</td>
				<td>${ct.thoiGianDatBao }</td>
			</tr>
			</c:forEach>
		</table>
		
    </form>
</div>

<div class="clear"></div>
<div id="footer">
	<p>
    	Bạn sẽ có trong tay những ấn phẩm mà bạn yêu thích<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ngay khi liên lạc với chúng tôi.
    </p>
   	<p>
    	Công ty hy vọng sẽ là địa chỉ đáng tin cậy của quý bạn đọc!
    </p>
</div>	
</body>
</html>