package com.lwl.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * 
 * cglib代理处理类
 * 		CGLIB 采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。
 * 		但因为采用的是继承，所以不能对final修饰的类进行代理。
 * 		使用 CGLIB 需要实现 MethodInterceptor 接口，并重写intercept 方法，在该方法中对原始要执行的方法前后做增强处理
 * @author lwl
 * @create 2018年12月28日 下午12:46:47
 * @version 1.0
 */
public class CglibProxyHandler implements MethodInterceptor {

	//需要被代理的对象
	private Object object;
	
	
	public Object getProxyInstance(final Object target) {
		this.object = target;
		//Enhancer类是CGLIB中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展
		Enhancer enhancer = new Enhancer();
		//将被代理的对象设置成父类
		enhancer.setSuperclass(target.getClass());
		//回调方法，设置拦截器
		enhancer.setCallback(this);
		
		 // 动态创建一个代理类
		return enhancer.create();
		
	}
	
	/**
	 * 对原始要执行的方法前后做增强处理
	 * @param arg0	原始对象，即被代理的对象
	 * @param arg1
	 * @param args	需要执行的方法携带的参数
	 * @param methodProxy	需要代理的方法
	 * @return
	 * @throws Throwable
	 * @author lwl
	 * @create 2018年12月28日 下午12:54:41
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] args, MethodProxy methodProxy) throws Throwable {
	 
		System.out.println("中介开始找房子............");
		System.out.println();
		System.out.println();
		System.out.println("中介找到了房子，开始让用户缴费........");
		
		double money = (double) args[0];
		
		 Object obj = methodProxy.invokeSuper(arg0, args);
		
		System.out.println("中介从房费中收取10%作为中介费.........");
		System.out.println("中介收到："+money*0.1);
		System.out.println();
		System.out.println();
		
		System.out.println("房东收到房租："+money*0.9);
		
		return obj;
	}

	 

}
