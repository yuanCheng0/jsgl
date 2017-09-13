<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css" type="text/css"/>
</head>

<body>
<a href="marketAct/addActivity.action">添加活动 </a>
<table width="90%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>活动id</td>
    <td>活动名称</td>
    <td>内容</td>
    <td>负责老师</td>
    <td>开始时间</td>
    <td>结束时间</td>
    <td>当前状态</td>
    <td>老师id</td>
    <td>操作</td>
  </tr>
<c:forEach items="${market}" var="mar">	
          <tr>           
            <td>${mar.actId}</td>
            <td>${mar.actName}</td>
            <td>${mar.actContent}</td>
            <td>${mar.actPrincipal}</td>
            <td>${mar.actStarttime}</td>
            <td>${mar.actEndtime}</td>
            <td>${mar.actStates}</td>
            <td>${mar.actStaffid}</td>
            <td><a href="infoStu/updateActivity.action">修改</a>
            <a href="infoStu/deleteActivity.action">删除</a></td>
          </tr>
</c:forEach>
</table>
            
            
</body>
</html>
