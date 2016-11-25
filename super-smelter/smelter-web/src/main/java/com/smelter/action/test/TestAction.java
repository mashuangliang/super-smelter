package com.smelter.action.test;

import com.smelter.action.common.BaseAction;
import com.smelter.model.common.RequestVo;
import com.smelter.model.common.ResponseVo;
import com.smelter.model.test.Beftender;
import com.smelter.service.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
public class TestAction extends BaseAction{

    Logger logger = LoggerFactory.getLogger(TestAction.class);

    @Autowired
    public TestService testService;



    @RequestMapping(value = "test")
    @ResponseBody
    public ResponseVo test(@RequestParam("base") String base,@RequestParam("body") String body) throws Exception {
        RequestVo<Beftender> reqVo = getRequestVo(base,body,Beftender.class);
        Beftender beftender = reqVo.getBody();
        beftender = testService.getBeftenderDetail(beftender.getTid());
        ResponseVo responseVo=ResponseVo.getInstance();
        responseVo.setData(beftender);
        return responseVo;
    }


}
