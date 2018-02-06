package com.gsstudy.it.basictest;



import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	protected ApplicationContext ac;
	@Before
	public void init(){
		String[] conf = {"spring-mvc.xml","spring-mybatis.xml"};
		ac = new ClassPathXmlApplicationContext(conf);
	}
}
