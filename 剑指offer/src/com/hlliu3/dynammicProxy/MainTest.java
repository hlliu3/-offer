package com.hlliu3.dynammicProxy;

import java.lang.reflect.Proxy;

public class MainTest {
	public static void main(String[] args) {
		TargetClass targetClass = new TargetClass();
		TargetClassInterface o = (TargetClassInterface)Proxy.newProxyInstance(targetClass.getClass().getClassLoader(), targetClass.getClass().getInterfaces(), new AOPMethod(targetClass));
		String run = o.run();
		System.out.println(run);
	}
}
