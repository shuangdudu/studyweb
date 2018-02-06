package com.gsstudy.it.testdao;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.gsstudy.it.basictest.BaseTest;
import com.gsstudy.it.dao.DemoDao;
import com.gsstudy.it.dao.EmpDao;
import com.gsstudy.it.dao.EmpDao1;
import com.gsstudy.it.entity.Condition;
import com.gsstudy.it.entity.Emp;
import com.gsstudy.it.entity.ProcedurePojo;



public class Test1 extends BaseTest {

	@Test
	public void testAllEmp() {
		EmpDao dao = ac.getBean("empDao", EmpDao.class);
		List<Emp> emp = dao.findAllEmp();
		for (Emp p : emp) {
			System.out.println(p);
		}

	}
	@Test
	public void testFindByDeptno(){
		EmpDao1 mapper = ac.getBean("empDao1",EmpDao1.class);
		Condition cond = new Condition();
		cond.setDeptno(10);
		List<Emp> list = mapper.findByDept(cond);
		for(Emp emp:list){
			System.out.println(emp);
		}
	}
	@Test
	public void findByDeptno(){
		EmpDao dao  = ac.getBean("empDao",EmpDao.class);
		List<Emp> list = dao.findByDept1(10);
		for(Emp emp:list){
			System.out.println(emp);
		}
	}
	@Test
	public void findBySalary(){
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		Emp emp = new Emp();
		emp.setSal(4500.00);
		List<Emp> emps = dao.findBySalary(emp);
		for(Emp employee:emps){
			System.out.println(employee);
		}
	}
	@Test
	public void testFinByDeptAndSalary(){
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		Condition con = new Condition();
		con.setDeptno(20);
		con.setSalary(2500.0);
		List<Emp> emps = dao.findByDeptAndSalary(con);
		for(Emp e:emps){
			System.out.println(e);
		}
		
	}
	@Test
	public void testUpdateByDeptno(){
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		Emp emp = new Emp();
		emp.setEmpno(7369);
		emp.setJob("SALESMAN");
		emp.setSal(2000.0);
		int result = dao.updateByDeptno(emp);
		if(result>0){
			System.out.println("更新成功！！！");
		}
	}
	@Test
	public void testFindByDeptnoAndEname(){
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		Condition con = new Condition();
		con.setDeptno(20);
		con.setSalary(800.0);
		List<Emp> emps = dao.findByDeptnoAndEname(con);
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}
	@Test
	public void testFindByIds(){
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		List<Integer> empnos = new ArrayList<Integer>(3);
		empnos.add(7654);
		empnos.add(7844);
		empnos.add(7902);
		List<Emp> emps = dao.findByIds(empnos);
		for(Emp emp :emps){
			System.out.println(emp );
		}
	}
	@Test
	public void testProcedure(){
		ProcedurePojo procedure = new ProcedurePojo();
		System.out.println("===>ok");
		int result = 0;
		procedure.setRoleName("teacher");
		DemoDao dao = ac.getBean("demoDao",DemoDao.class);
		dao.count(procedure);
		 System.out.println("===>"+procedure.getRoleName());
		 System.out.println("===>"+procedure.getResult());
		 System.out.println("===>"+procedure.getExecDate());
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		 System.out.println("===>"+sdf.format(procedure.getExecDate()));
		
	}

}
