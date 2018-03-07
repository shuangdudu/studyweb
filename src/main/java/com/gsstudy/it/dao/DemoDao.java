package com.gsstudy.it.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gsstudy.it.entity.ProcedurePojo;



public interface DemoDao {
	public void count(ProcedurePojo pojo);
	public List<Map<String,Object>> findParameterValue(
			@Param("boqID")String boqID,
			@Param("moduleCodes")List<String>moduleCodes,
			@Param("productCodes")List<String>productCodes,
			@Param("parameterCode")String parameterCode,
			@Param("siteName")String siteName,
			@Param("dimensionProductTypeID")int dimensionProductTypeID,
			@Param("qtyTpye")int qtyTpye);
}
