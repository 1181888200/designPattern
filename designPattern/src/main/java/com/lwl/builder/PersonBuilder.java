package com.lwl.builder;

public class PersonBuilder implements IBuilder {

	private StringBuffer buffer = new StringBuffer();//假设 buffer.toString() 就是最终生成的产品 
	
	@Override
	public void builder1() {
		 System.out.println("开始构建builder1的方法内容");
		 
		 buffer.append("----------------第一步-----------------");

	}

	@Override
	public void builder2() {
		System.out.println("开始构建builder2的方法内容");
		 buffer.append("\n----------------第二步-----------------");

	}

	
	public String getResult() {
		return buffer.toString();
	}
}
