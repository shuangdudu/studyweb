package com.gsstudy.it.service;

import java.util.Date;

import com.google.gson.Gson;
import com.gsstudy.it.entity.Emp;


public class JsonUtil1 {
	public static void main(String[] args) {
	String jsonString  = null;
	Emp emp = new Emp();
	emp.setDeptno(1002);
	emp.setEname("Salary");
	emp.setHiredate(new Date());
	Gson gson = new Gson();
	jsonString = gson.toJson(emp);
	System.out.println("=====>"+jsonString);
	emp = gson.fromJson(jsonString, emp.getClass());
	System.out.println("=====>"+emp);
		
	}
}
