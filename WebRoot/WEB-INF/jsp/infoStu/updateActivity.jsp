<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
	    <sf:form mrthod="post" modelAttribute="markactivities">
    	<div>请输入要修改的活动信息</div>
    	活动id<sf:input path="actId" value="请输入ID号"/><br/>
    	活动名<sf:input path="actName"value="活动名"/><br/>
    	活动内容<sf:input path="actContent"/><br/>
    	负责人<sf:input path="actPrincipal"/><br/>
    	开始时间<sf:input path="actStarttime"/><br/>
    	结束时间<sf:input path="actEndtime"/><br/>
    	状态<sf:input path="actStates"/><br/>
    	负责人id<sf:input path="actStaffid"/><br/>
    <input type="submit" value="保存"/>
    </sf:form>
</body>
</html>
