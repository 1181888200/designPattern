package com.lwl.single;

/**
 * 
 * 懒汉式单例
 * @author lwl
 * @create 2019年1月2日 下午4:44:15
 * @version 1.0
 */
public class SingleLhFour {

	
	private SingleLhFour() {}
	
	private static SingleLhFour single;
	
	/**
	 * 双重检查
	 * 我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。
	 * 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
	 * 
	 * 线程安全，而且效率高
	 * 
	 * @return
	 * @author lwl
	 * @create 2019年1月2日 下午4:45:15
	 */
	public static SingleLhFour getInstance() {
		
		if(single==null) {
			synchronized (SingleLhFour.class) {
				if(single==null) {
					single = new SingleLhFour();
				}
			}
		}
		
		return single;
	}
	
}
