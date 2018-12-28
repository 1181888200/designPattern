package com.lwl.proxy;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author lwl
 * @create 2018年12月28日 上午8:46:59
 * @version 1.0
 */
public class JdkProxyHandler {

	//被代理的对象
	private Object object;
	
	/**
	 * 将要被代理的对象通过构建方法传入
	 * 类的构造方法
	 * @param renting
	 */
	public JdkProxyHandler(IRentingService renting) {
		super();
		this.object = renting;
	}
	
	/**
	 * 给要被代理的对象  生成一个代理实体类
	 * @return
	 * @author lwl
	 * @create 2018年12月28日 上午8:49:32
	 */
	public Object getProxyInstance() {
		
		/**
		 * 第一个参数指定当前目标对象使用的类加载器,获取加载器的方法是固定的
		 * 第二个参数指定目标对象实现的接口的类型
		 * 第三个参数指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
		 */
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), (proxy,method,args) -> {
			System.out.println("中介开始找房子............");
			System.out.println();
			System.out.println();
			System.out.println("中介找到了房子，开始让用户缴费........");
			
			double money = (double) args[0];
			
			 Object obj = method.invoke(object, args);
			
			System.out.println("中介从房费中收取10%作为中介费.........");
			System.out.println("中介收到："+money*0.1);
			System.out.println();
			System.out.println();
			
			System.out.println("房东收到房租："+money*0.9);
			
			return obj;
		});
	}
	
}
