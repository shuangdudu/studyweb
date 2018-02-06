package com.gsstudy.it.dao;

import java.util.List;

import com.gsstudy.it.entity.Condition;
import com.gsstudy.it.entity.Emp;




public interface EmpDao1 {
	List<Emp> findAll();
	List<Emp> findByDept(Condition cond);
}
