package com.smelter.service.test;


import com.smelter.model.test.Beftender;
import com.smelter.model.test.BeftenderExample;
import com.smelter.service.common.IBaseService;


public interface TestService extends IBaseService<Beftender, BeftenderExample> {

    public Beftender getBeftenderDetail(Integer tid);

}
