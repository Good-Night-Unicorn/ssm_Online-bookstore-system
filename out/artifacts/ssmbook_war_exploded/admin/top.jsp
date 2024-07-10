<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div class="topNav">
	<div class="wrapper" style="margin: 0 15px;">
		<div class="welcome">
			<a title="">
				<img src="themes/xecmoban_haier2015/images/zj.png" style="height:26px;margin: 0;" />
				<span style="    color: white;
    font-size: 15px;
    font-weight: bold;">网上书城系统后台管理</span>

			</a>
		</div>
		<div class="userNav">
			<ul>
				<li style="height: 28px;
    line-height: 28px;">
				欢迎您：${sessionScope.adminname }&nbsp;&nbsp;
				</li>
				<li><a href="<%=basePath%>admin/editpwd.jsp" title=""><img src="images/icons/topnav/settings.png" alt="" /><span>修改密码</span></a></li>
				<li><a href="<%=basePath%>admin/exit.action" onclick="{if(confirm('确定要退出吗?')){return true;}return false;}"
					title=""><img src="images/icons/topnav/logout.png" alt="" /><span>退出系统</span></a></li>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
</div>