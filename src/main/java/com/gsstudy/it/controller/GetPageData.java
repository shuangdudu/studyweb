package com.gsstudy.it.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class GetPageData {
//	public final static Logger logger = Logger.getLogger("com.huawei.it.controller.GetPageData.class");
	protected Logger logger =  LoggerFactory.getLogger(this.getClass());
@RequestMapping("/getdata.do")
@ResponseBody
public Map<String,Object> getdata(HttpServletRequest request,HttpServletResponse response){
	logger.error("===========>"+"进入了getdata方法:");
	Map<String,Object> map = new HashMap<String, Object>();
	String parameter1 = request.getParameter("data");
	logger.info("============>"+parameter1);
//	System.out.println("=====>"+parameter1);
	if(parameter1 == null){
		map.put("result", "error");
	}else{
		map.put("result", "ok");
	}
	return map;
}
}
