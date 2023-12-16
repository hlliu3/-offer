package com.hlliu3.dynammicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AOPMethod implements InvocationHandler {//必须实现invocationhandler，这个是写增强方法的类，invocationHandler是Proxy的一个成员变量，proxy会调用这个变量的invoke方法

	TargetClassInterface targetClassInterface ;

	public AOPMethod(TargetClassInterface targetClassInterface) {
		this.targetClassInterface = targetClassInterface;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理之前,,,,");
		Object invoke = method.invoke(targetClassInterface,args);
		System.out.println("动态代理之后,,,,,");
		return invoke;
	}
}
