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
<div>生源信息展示</div>
<table width="90%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>学生id</td>
    <td>姓名</td>
    <td>年龄</td>
    <td>性别</td>
    <td>电话</td>
    <td>意向</td>
    <td>招生老师id</td>
    <td>毕业院校</td> 
    <td>email</td>
   
  </tr>
<c:forEach items="${info}" var="um">	
          <tr>           
            <td>${um.sosId}</td>
            <td>${um.sosName}</td>
            <td>${um.sosAge}</td>
            <td>${um.sosSex}</td>
            <td>${um.sosPhone}</td>
            <td>${um.sosInterstates}</td>
            <td>${um.staffId}</td>     
            <td>${um.sosSchool}</td>
            <td>${um.sosEmail}</td>
            
          </tr>
</c:forEach>
</table>
</body>
</html>

