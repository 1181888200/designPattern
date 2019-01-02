package com.lwl.single;

/**
 * 懒汉式单例
 * @author lwl
 * @create 2019年1月2日 下午4:31:24
 * @version 1.0
 */
public class SingleLhOne {

	private SingleLhOne() {}
	
	private static SingleLhOne single;
	
	/**
	 * 线程不安全
	 * 	如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
	 * @return
	 * @author lwl
	 * @create 2019年1月2日 下午4:36:22
	 */
	public static SingleLhOne getInstance() {
		
		if(single==null) {
			single = new SingleLhOne();
		}
		return single;
	}
	
}
