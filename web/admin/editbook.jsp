<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网上书城系统后台管理</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="js/plugins/spinner/jquery.mousewheel.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/excanvas.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.sparkline.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/uniform.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.cleditor.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine-en.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/autogrowtextarea.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.dualListBox.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.inputlimiter.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/chosen.jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.wizard.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html5.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html4.js"></script>
<script type="text/javascript" src="js/plugins/uploader/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="js/plugins/tables/datatable.js"></script>
<script type="text/javascript" src="js/plugins/tables/tablesort.min.js"></script>
<script type="text/javascript" src="js/plugins/tables/resizable.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.tipsy.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.collapsible.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.progress.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.timeentry.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.colorpicker.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.jgrowl.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.breadcrumbs.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.sourcerer.js"></script>
<script type="text/javascript" src="js/plugins/calendar.min.js"></script>
<script type="text/javascript" src="js/plugins/elfinder.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/film.js" charset="utf-8"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="rightSide">
		<div class="line"></div>
		<div class="line"></div>
		<div class="line"></div>
		<div class="line"></div>
		<div class="wrapper">
			<form action="book/updateBook.action" name="myform" method="post" onsubmit="return check()" class="form">
				<div class="widget" style="width: 80%">
					<div class="title">
						<img src="images/icons/dark/list.png" alt="" class="titleIcon" />
						<h6>编辑图书信息</h6>
					</div>

					<div class="formRow">
						<label>图书名称</label>
						<div class="formRight">
							<input type="text" name="bookname" class="mws-textinput" id="bookname" value="${book.bookname}" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>图片</label>
						<div class="formRight">
							<script type="text/javascript" src="js/selimage.js"></script>
							<input class="mws-textinput" type="text" name="image" value="${book.image}" id="image" onclick="selimage();"
								readonly="readonly" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>图书类型</label>
						<div class="formRight">
							<select name="cateid" class="mws-textinput" id="cateid"><c:forEach items="${cateList}" var="cate">
									<option value="${cate.cateid}">${cate.catename }</option>
								</c:forEach></select>
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>价格</label>
						<div class="formRight">
							<input type="text" name="price" class="mws-textinput" id="price" value="${book.price}" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>是否推荐</label>
						<div class="formRight">
							<select class="mws-textinput" name="recommend" id="recommend"><option value="是">是</option>
								<option value="否">否</option></select>
						</div>
						<div class="clear"></div>
					</div>

					<div class="formRow">
						<label>图书介绍</label>
						<div class="formRight">
							<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
							<textarea cols="80" name="contents" id="contents" rows="10">${book.contents} </textarea>
							<script type="text/javascript">
								CKEDITOR.replace('contents', {
									language : 'zh-cn'
								});
							</script>
						</div>
						<div class="clear"></div>
					</div>
					<div class="formSubmit">
						<input type="hidden" name="bookid" id="bookid" value="${book.bookid}" /><input type="hidden" name="hits"
							id="hits" value="${book.hits}" /> <input type="hidden" name="sellnum" id="sellnum" value="${book.sellnum}" /> <input
							type="submit" id="sub" value="确认提交" class="redB"> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" id="res"
							value="取消重置" class="redB">
					</div>
				</div>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</body>
</html>

