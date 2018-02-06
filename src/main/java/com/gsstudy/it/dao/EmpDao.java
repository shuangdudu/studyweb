package com.gsstudy.it.dao;

import java.util.List;

import com.gsstudy.it.annotation.MybatisRepository;
import com.gsstudy.it.entity.Condition;
import com.gsstudy.it.entity.Emp;



@MybatisRepository
public interface EmpDao {
	List<Emp> findAllEmp();
	List<Emp> findByDept1(Integer deptno);
	List<Emp> findBySalary(Emp emp);
	List<Emp> findByDeptAndSalary(Condition con);
	int updateByDeptno(Emp emp);
	List<Emp> findByDeptnoAndEname(Condition con);
	List<Emp> findByIds(List<Integer> empnos);
}
