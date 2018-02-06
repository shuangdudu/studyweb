package com.gsstudy.it.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsstudy.it.dao.EmpDao;
import com.gsstudy.it.entity.Emp;



@Controller
@RequestMapping("/emp")
public class EmpController {
	@Resource
	private EmpDao dao;
	@RequestMapping("/findEmp.do")	
	public String find(Model model){
//		List<Emp> emps = empService.searchAllEmp();
		List<Emp> emps = dao.findAllEmp();
		model.addAttribute("emps",emps);
		return "emp_list";
	}
}
