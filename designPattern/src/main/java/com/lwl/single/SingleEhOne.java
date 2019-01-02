package com.lwl.single;

/**
 * 饿汉式
 * @author lwl
 * @create 2019年1月2日 下午4:18:42
 * @version 1.0
 */
public class SingleEhOne {

	private static final SingleEhOne single = new SingleEhOne();
	
	private SingleEhOne() {}
	
	
	public static SingleEhOne getInstance() {
		return single;
	}
	
}
