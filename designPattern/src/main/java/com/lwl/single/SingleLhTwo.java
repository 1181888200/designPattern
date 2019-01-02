package com.lwl.single;

/**
 * 
 * 懒汉式单例
 * 	
 * @author lwl
 * @create 2019年1月2日 下午4:37:20
 * @version 1.0
 */
public class SingleLhTwo {

	
	private SingleLhTwo() {}

	private static SingleLhTwo single;
	
	/**
	 * 线程安全，同步方法
	 * 		缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
	 * 		而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
	 * @return
	 * @author lwl
	 * @create 2019年1月2日 下午4:38:10
	 */
	public static synchronized SingleLhTwo getInstance() {
		if(single==null) {
			single = new SingleLhTwo();
		}
		return single;
	}
	
}
