package com.lwl.single;

/**
 * 饿汉式
 * @author lwl
 * @create 2019年1月2日 下午4:22:12
 * @version 1.0
 */
public class SingleEhTwo {

	private static final SingleEhTwo single;
	
	private SingleEhTwo() {}
	
	static {
		single = new SingleEhTwo();
	}
	
	public static SingleEhTwo getInstance() {
		return single;
	}
	
}
