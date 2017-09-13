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
<table width="90%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>学生id</td>
    <td>姓名</td>
    <td>年龄</td>
    <td>性别</td>
    <td>电话</td>
    <td>用户名</td>
    <td>学生文凭</td>
    <td>毕业院校</td>
    <td>出生日期</td>
    <td>email</td>
    <td>班级id</td>
  </tr>
<c:forEach items="${stulist}" var="um">	
          <tr>           
            <td>${um.stuId}</td>
            <td>${um.stuName}</td>
            <td>${um.stuAge}</td>
            <td>${um.stuSex}</td>
            <td>${um.stuMobile}</td>
            <td>${um.stuUsername}</td>
            <td>${um.stuDiplomas}</td>
            <td>${um.stuSchoolTag}</td>
            <td>${um.stuBirthday}</td>
            <td>${um.stuEmail}</td>
            <td>${um.classId}</td>
          </tr>
</c:forEach>
</table>
</body>
</html>
