package com.SpringBootWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	//http//..../emp/data?eid=10&ename=A
	
	@GetMapping("/data")
	public String showData(
						//@RequestParam("ename")String name,
						//@RequestParam(value = "ename", required = false)String name,
						@RequestParam(value = "ename", required = false, defaultValue = "NO DATA")String name,
						//@RequestParam("eid")int id,
						//@RequestParam(value = "eid",required = false)int id,
						@RequestParam(value = "eid",required = false, defaultValue = "-1")int id,
						Model model
						) 
	{
		System.out.println(name);
		System.out.println(id);
		model.addAttribute("eid", id);
		model.addAttribute("ename", name);
		return "EmpData";
	}
}
