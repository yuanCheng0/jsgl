package com.ibeifeng.ssm.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ibeifeng.ssm.pojo.Student;
import com.ibeifeng.ssm.service.StudentService;



@Controller
@RequestMapping("student")
public class StudentController{
	@Autowired
	private StudentService studentService;
	//查询所有学员
	@RequestMapping("studentlist.action")
	public String listStudent(Model model){
		List<Student> stulist = studentService.selectAll();
		model.addAttribute("stulist", stulist);		
		return "stu/studentlist";
	}
	//查询某学生
	@RequestMapping(value="student.action",method=RequestMethod.GET)
	public String selectstu(@ModelAttribute("student") Student student){
		return "stu/student";
	 }
	@RequestMapping(value="student.action",method=RequestMethod.POST)
	public String selectstu(@Validated Student student,BindingResult bindingResult,Model model){//紧跟validate之后写验证结果
		if(bindingResult.hasErrors()){
			//若有错误，直接掉转到add 视图
			model.addAttribute("message", "id有误！");
			return "stu/student";
		}
		model.addAttribute("stu", studentService.findById(student.getStuId()));        
		return "stu/student";
	}
    //学员注册
	@RequestMapping(value="addstudent.action",method=RequestMethod.GET)
	public String addStudent(@ModelAttribute("student")  Student student){				
		return "stu/addstudent";		
	}
	@RequestMapping(value="addstudent.action",method=RequestMethod.POST)
	public String addStudent(@Validated Student student,Model model){
		int num=studentService.add(student);
		if(num>0){
			model.addAttribute("stu", student);
		}
		return num>0?"stu/student":"stu/addstudent";		
	}
}
