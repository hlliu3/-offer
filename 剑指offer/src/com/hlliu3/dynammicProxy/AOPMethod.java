package com.hlliu3.dynammicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AOPMethod implements InvocationHandler {//����ʵ��invocationhandler�������д��ǿ�������࣬invocationHandler��Proxy��һ����Ա������proxy��������������invoke����

	TargetClassInterface targetClassInterface ;

	public AOPMethod(TargetClassInterface targetClassInterface) {
		this.targetClassInterface = targetClassInterface;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��̬����֮ǰ,,,,");
		Object invoke = method.invoke(targetClassInterface,args);
		System.out.println("��̬����֮��,,,,,");
		return invoke;
	}
}
