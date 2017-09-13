<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view</title>
</head>
<body>
	<sf:form method="post" modelAttribute="student" >
		请输入要查询学生的id：<sf:input path="stuId"/><br/>
		<input type="submit" value="提交"/>
	</sf:form>
	<hr/>		
     ${message}<br/>              
            学生id：${stu.stuId}<br/>
            姓名：${stu.stuName}<br/>
            年龄：${stu.stuAge}<br/>
            性别：${stu.stuSex}<br/>
            电话：${stu.stuMobile}<br/>
            用户名：${stu.stuUsername}<br/>
            文凭：${stu.stuDiplomas}<br/>
            毕业院校：${stu.stuSchoolTag}<br/>
            出生日期：${stu.stuBirthday}<br/>
     Email：${stu.stuEmail}<br/>
            所在班级编号：${stu.classId}<br/>
          
</body>
</html>
