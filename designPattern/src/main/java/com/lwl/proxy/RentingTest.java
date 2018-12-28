package com.lwl.proxy;


/**
 *  什么是代理模式？
	代理模式的核心作用就是通过代理，控制对对象的访问。它的设计思路是：定义一个抽象角色，让代理角色和真实角色分别去实现它。
	真实角色：实现抽象角色，定义真实角色所要实现的业务逻辑，供代理角色调用。它只关注真正的业务逻辑，比如歌星唱歌。
	代理角色：实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并在前后可以附加自己的操作，比如谈合同，布置场地，收钱等等。
	这就是代理模式的设计思路。代理模式分为静态代理和动态代理。静态代理是我们自己创建一个代理类，而动态代理是程序自动帮我们生成一个代理，我们就不用管了。下面我详细介绍一下这两种代理模式。
 * @author lwl
 * @create 2018年12月28日 下午1:06:11
 * @version 1.0
 */
public class RentingTest {
	 
	public static void main(String[] args) {
		
		//静态代理：
		//	静态代理需要创建真实角色和代理角色,分别实现租房这个接口，真实角色很简单，直接实现即可
		//	代理角色需要真实角色这个对象，通过接口中的方法，在真实角色执行前后进行其他操作
//		staticProxy();
		 
		
//		动态代理一般有两种方式：JDK 动态代理和 CGLIB 动态代理。
		 /**
		  * 相对于静态代理，JDK 动态代理大大减少了我们的开发任务，同时减少了对业务接口的依赖，降低了耦合度。
		  * JDK 动态代理是利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler 来处理。
		  * 但是 JDK 动态代理有个缺憾，或者说特点：JDK 实现动态代理需要实现类通过接口定义业务方法。
		  * 也就是说它始终无法摆脱仅支持 interface 代理的桎梏，因为它的设计就注定了这个遗憾。
		  */
//		 jdkProxy();
		 
		//JDK 实现动态代理需要实现类通过接口定义业务方法，那对于没有接口的类，如何实现动态代理呢，这就需要 CGLIB 了。
		 cglibProxy();
	}


	/**
	 * 静态代理
	 * @author lwl
	 * @create 2018年12月28日 下午12:38:59
	 */
	public static void staticProxy() {
		//用户
		 UserRentingImpl renting = new UserRentingImpl();
		 //用户让中介找1000左右的房子
		 double money = 1000;
		 //中介开始
		 IRentingService agency = new AgencyRentingImpl(renting);
		 //中介开始根据1000找对应的房源
		 agency.renting(money);
	}

	
	
	/**
	 * jdk动态代理
	 * @author lwl
	 * @create 2018年12月28日 下午12:36:31
	 */
	public static void jdkProxy() {
		 UserRentingImpl renting = new UserRentingImpl();
		 IRentingService proxy = (IRentingService) new JdkProxyHandler(renting).getProxyInstance();
		 proxy.renting(1000);
	}
	
	public static void cglibProxy() {
		UserRentingImpl renting = new UserRentingImpl();
		IRentingService proxy = (IRentingService) new CglibProxyHandler().getProxyInstance(renting);
		proxy.renting(1000);
	}
	
}
