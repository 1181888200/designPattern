package com.lwl.single;

/**
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 
 * @author lwl
 * @create 2019年1月2日 下午4:54:06
 * @version 1.0
 */
public enum SingleEnum {

	SINGLE;
	
	public void say() {
		System.out.println("hello single enum");
	}
	
}
