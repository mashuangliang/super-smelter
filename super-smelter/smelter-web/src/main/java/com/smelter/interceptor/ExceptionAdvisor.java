package com.smelter.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理
 */
public class ExceptionAdvisor implements HandlerExceptionResolver {
    public static final Logger errorLogger = LoggerFactory.getLogger(ExceptionAdvisor.class);
    private static ModelAndView mav = new ModelAndView();

    static {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 4000);
        result.put("msg", "网络繁忙请稍后再试");
        result.put("data", "");
        view.setAttributesMap(result);
        mav.setView(view);
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
        if (e != null) {//记录错误日志
            System.out.println("============有异常信息================" + handler + "===" + e.getMessage());
            errorLogger.error(handler + "");
            errorLogger.error(e.getMessage(), e);
        }
        return mav;
    }
}
