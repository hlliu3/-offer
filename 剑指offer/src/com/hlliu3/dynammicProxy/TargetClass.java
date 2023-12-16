package com.hlliu3.dynammicProxy;
public class TargetClass implements TargetClassInterface{

	@Override
	public String run(){
		System.out.println("目标方法执行");
		return "fdsfsdfd";

	}
}
