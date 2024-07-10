<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>

<base href="<%=basePath%>" />
<title>网上书城系统</title>

</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="block clearfix">
		<div class="goodsBox_1">
			<!-- 循环开始  -->
			<c:forEach items="${frontList}" var="cate">
				<div class="xm-box">
					<div class="title">
						<span class="floor-icon"><i></i><b></b> </span>
						<h2>${cate.catename }</h2>
						<a class="more" href="index/cate.action?id=${cate.cateid }">更多 </a>
					</div>
					<div id="show_new_area" class="clearfix xm-boxs">
						<!-- 循环开始  -->
						<c:forEach items="${cate.bookList}" var="book">
							<div class="goodsItem goodsItems">
								<a href="index/detail.action?id=${book.bookid }"><img src="${book.image }" alt="${book.bookname }"
									class="goodsimg" /> </a> <br />
								<p class="f1">
									<a href="index/detail.action?id=${book.bookid }" title="${book.bookname }">${book.bookname }</a>
								</p>
								<p class="">
									价格： <font class="f1"> ￥${book.price }元 </font>
								</p>
							</div>
						</c:forEach>
						<!-- 循环结束  -->
					</div>
				</div>
				<div class="blank"></div>
			</c:forEach>
			<!-- 循环结束  -->
			<div class="blank"></div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
