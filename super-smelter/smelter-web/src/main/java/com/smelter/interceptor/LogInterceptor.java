package com.smelter.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Spring 统一日志处理实现类
 */
public class LogInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object obj = invocation.proceed();// 执行需要Log的方法
        return obj;
    }

}

