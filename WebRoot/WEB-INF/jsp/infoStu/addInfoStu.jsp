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
    <sf:form mrthod="post" modelAttribute="sourceOfStudents">
    	<div>    添加有意向学生:</div>
    	学生id<sf:input path="sosId"/><br/>
    	姓名<sf:input path="sosName"/><br/>
    	性别<sf:input path="sosSex"/><br/>
    	年龄<sf:input path="sosAge"/><br/>
    	Email<sf:input path="sosEmail"/><br/>
    	毕业院校<sf:input path="sosSchool"/><br/>
    	招生老师id<sf:input path="staffId"/><br/>
    	学生意向<sf:input path="sosInterstates"/><br/>
    	联系方式<sf:input path="sosPhone"/><br/>
    	<input type="submit" value="提交"/>
    </sf:form>
  </body>
</html>
