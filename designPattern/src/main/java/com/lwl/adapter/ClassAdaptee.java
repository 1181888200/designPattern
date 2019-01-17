package com.lwl.adapter;

/**
 * 源角色
 * @author lwl
 * @create 2019年1月17日 下午3:22:39
 * @version 1.0
 */
public class ClassAdaptee implements ClassTarget {

	@Override
	public void simpleOption1() {
		System.out.println("simpleOption1");
	}

	@Override
	public void simpleOption2() {
		System.out.println("simpleOption2");
	}

}
