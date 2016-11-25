package com.smelter.service.impl.test;

import com.smelter.dao.test.BeftenderMapper;
import com.smelter.model.test.Beftender;
import com.smelter.model.test.BeftenderExample;
import com.smelter.service.impl.common.BaseService;
import com.smelter.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl extends BaseService<Beftender, BeftenderExample> implements TestService {

    @Autowired
    private BeftenderMapper beftenderMapper;

    @Override
    public Beftender getBeftenderDetail(Integer tid) {
        return beftenderMapper.getBeftenderDetail(tid);
    }
}
