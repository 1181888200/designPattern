package com.lwl.adapter;

/**
 * 适配器角色
 * @author lwl
 * @create 2019年1月17日 下午3:36:21
 * @version 1.0
 */
public class ClassAdapter extends ClassAdaptee {

	@Override
	public void simpleOption2() {
		 System.out.println("这个方法被适配器转化了");
	}

	
	
}
