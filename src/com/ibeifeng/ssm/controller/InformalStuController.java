package com.ibeifeng.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibeifeng.ssm.pojo.SourceofStudents;
import com.ibeifeng.ssm.service.InfromalStuService;

@Controller
//为了对URL进行分类，可以在这里定义根路径，最终访问路径是根路径+子路经
@RequestMapping("informalStu")
public class InformalStuController{
	@Autowired
	private InfromalStuService infoStu;
	
	@RequestMapping("selectStu.action")
	public String findAll(Model model){
		model.addAttribute("info",infoStu.selectAll());
		return "infoStu/showAll";		
	}
	//ADDSTUDENT
	//限制HTTP请求方法为GET
	@RequestMapping(value="addStu.action" ,method=RequestMethod.GET)
	public String addStu(@ModelAttribute("sourceOfStudents") SourceofStudents sourceOfStudents){
		return "infoStu/addInfoStu";	
	}
	@RequestMapping(value="addStu.action", method=RequestMethod.POST)
	public String addStu(@Validated SourceofStudents sourceOfStudents,Model model ){
		int num=infoStu.add(sourceOfStudents);
		if(num>0){
			model.addAttribute("message","添加成功！");
		}
		return num>0?"success":"field";
		
	}
}


