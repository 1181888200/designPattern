package com.lwl.single;

/**
 * 
 * 静态内部类单例
 * @author lwl
 * @create 2019年1月2日 下午4:48:22
 * @version 1.0
 */
public class SingleNrClass {

	
	private SingleNrClass() {}
	
	
	private static class SingleNr{
		private static final SingleNrClass single = new SingleNrClass();
	}
	
	/**
	 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
	 * 不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，
	 * 	而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。

		类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
	 * 
	 * @return
	 * @author lwl
	 * @create 2019年1月2日 下午4:50:12
	 */
	public static SingleNrClass getInstance() {
		return SingleNr.single;
	}
	
	
}
