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
	<sf:form method="post" modelAttribute="student">
		 姓名：<sf:input path="stuName"/><br/>
		年龄:<sf:input path="stuAge"/><br/>
		性别:<sf:input path="stuSex"/><br/>
		电话:<sf:input path="stuMobile"/><br/>
		用户名:<sf:input path="stuUsername"/><br/>
		密码:<sf:input path="stuPassword"/><br/>
		文凭:<sf:input path="stuDiplomas"/><br/>
		毕业院校:<sf:input path="stuSchoolTag"/><br/>
		出生日期:<sf:input path="stuBirthday"/><br/>
		Email:<sf:input path="stuEmail"/><br/>
		班级id:<sf:input path="classId"/><br/>
		<input type="submit" value="提交"/>
	</sf:form>
</body>
</html>
