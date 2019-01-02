package com.lwl.single;

/**
 * 懒汉式单例
 * @author lwl
 * @create 2019年1月2日 下午4:41:18
 * @version 1.0
 */
public class SingleLhThree {

	private SingleLhThree() {}
	
	
	private static SingleLhThree single;
	
	/**
	 * 线程不安全
	 * 相比上一种减少了同步时间，但是线程不安全
	 * 这种同步并不能起到线程同步的作用。假如一个线程进入了if (singleton == null)判断语句块，
	 * 	还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
	 * 
	 * @return
	 * @author lwl
	 * @create 2019年1月2日 下午4:41:23
	 */
	public static SingleLhThree getInstance() {
		if(single==null) {
			synchronized (SingleLhThree.class) {
				single = new SingleLhThree();
			}
		}
		return single;
	}
	
}
