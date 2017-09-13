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

           
            活动id:${mar.actId}<br/>
            活动名称:${mar.actName}<br/>
            内容:${mar.actContent}<br/>
            负责老师:${mar.actPrincipal}<br/>
            开始时间:${mar.actStarttime}<br/>
            结束时间:${mar.actEndtime}<br/>
            当前状态:${mar.actStates}<br/>
            老师id:${mar.actStaffid}<br/>     
            
            
</body>
</html>
