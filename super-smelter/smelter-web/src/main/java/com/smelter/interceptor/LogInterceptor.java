package com.smelter.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Spring 统一日志处理实现类
 */
public class LogInterceptor implements MethodInterceptor
{
	static Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
	public Object invoke(MethodInvocation invocation) throws Throwable
	{
//		logger.info(invocation.getMethod() + ": begin");// 方法前的操作
		Object obj = invocation.proceed();// 执行需要Log的方法
//		logger.info(invocation.getMethod() + ": end");// 方法后的操作
		return obj;
	}

}

