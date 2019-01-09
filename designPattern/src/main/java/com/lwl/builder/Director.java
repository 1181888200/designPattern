package com.lwl.builder;

public class Director {

	private IBuilder builder;
	
	
	public Director(IBuilder builder) {
		this.builder = builder;
	}
	
	
	public void builder() {
		
		System.out.println("开始构建");
		builder.builder1();
		
		builder.builder2();
		
		System.out.println("结束构建");
		
	}
	
}
