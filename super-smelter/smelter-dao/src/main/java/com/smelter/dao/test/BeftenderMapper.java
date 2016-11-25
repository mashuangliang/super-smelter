package com.smelter.dao.test;


import com.smelter.dao.common.BaseMapper;
import com.smelter.model.test.Beftender;
import com.smelter.model.test.BeftenderExample;
import org.apache.ibatis.annotations.Param;

public interface BeftenderMapper extends BaseMapper<Beftender, BeftenderExample> {

	public Beftender getBeftenderDetail(@Param("tid") Integer tid);

}