package com.ibeifeng.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibeifeng.ssm.pojo.MarketingActivities;
import com.ibeifeng.ssm.service.MarketingActivitiesService;

@Controller
@RequestMapping("marketAct")
public class MarketController {

	@Autowired
	private MarketingActivitiesService mac;
	//SELECTALL
	@RequestMapping("activities.action")
	public String selectAll(Model model){
		model.addAttribute("market",mac.selectAll());
		return "infoStu/markActivities";
		
	}
	//SELECTBYID
	
	//addActivity
	@RequestMapping(value="addActivity.action",method=RequestMethod.GET)
	public String add(@ModelAttribute("markactivities") MarketingActivities markactivities){	
		return "infoStu/addActivity";
	}
	@RequestMapping(value="addActivity.action" ,method=RequestMethod.POST)
	public String add(@Validated MarketingActivities markactivities,BindingResult bindingResult,Model model ){
		if(bindingResult.hasErrors()){
			return "infoStu/addActivity";
		}
		int add = mac.add(markactivities);
		if(add>0){
			model.addAttribute("massage","添加成功！");
		}else{
			model.addAttribute("massage","添加失败！");
		}
		return add>0?"success":"field";		
	}
	
	//EDIT
	@RequestMapping(value="{actId}/updateActivity.action",method=RequestMethod.GET)
	public String update(@PathVariable Integer actId ,Model model){
		model.addAttribute(mac.findById(actId));
		return "infoStu/updateActivity";
	}
	///{actId}/editActivity.action里面的actId表示占位符，通过@PathVariable获取其中的参数
	//如果占位符中的参数名和形参名一致，则@PathVariable可以不指定名称
	//在需要校验的pojo前边添加@Validated，在需要校验的pojo后边添加BindingResult
	//@Validated和BindingResult bindingResult是配对出现，并且形参顺序是固定的（一前一后）。
	@RequestMapping(value="{actId}/updateActivity.action",method=RequestMethod.POST)
	public String update(@PathVariable Integer actId,@Validated MarketingActivities markactivities, BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			return "infoStu/updateActivity";
		}
		int update = mac.update(markactivities);
		if(update>0){
			model.addAttribute("mar",mac.findById(actId));
		}
		return "infoStu/shownewactivity";
		
	}
	
}
