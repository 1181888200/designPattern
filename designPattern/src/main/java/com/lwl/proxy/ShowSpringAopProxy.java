package com.lwl.proxy;

import org.springframework.aop.SpringProxy;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.aop.framework.AopProxy;
import org.springframework.cglib.proxy.Proxy;

/**
 * 我们来看一下spring aop 的动态代理 : DefaultAopProxyFactory
 * 
 * 以总结出 Spring AOP 中的代理使用逻辑了：如果目标对象实现了接口，默认情况下会采用 JDK 的动态代理实现 AOP；
 * 如果目标对象没有实现了接口，则采用 CGLIB 库，Spring 会自动在 JDK 动态代理和 CGLIB 动态代理之间转换。	
 * 
 * @author lwl
 * @create 2018年12月28日 下午1:10:00
 * @version 1.0
 */
public class ShowSpringAopProxy  {

	//模拟了 DefaultAopProxyFactory  spring aop
	
	public AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException {
		/**
		 * isOptimize: 是否对生成代理策略进行优化
		 * 	 			(true :  进行优化，如果有接口就代理接口(使用JDK动态代理)，没有接口代理类（CGLIB代理）)
         				(false : 不进行优化) （默认值）
         				
		 * isProxyTargetClass ：(是否强制使用CGLIB来实现代理)
		 * 				(true : 强制使用CGLIB来实现代理)
         				(false : 不强制使用CGLIB来实现代理，首选JDK来实现代理)（默认值）
		 * 
		 * hasNoUserSuppliedProxyInterfaces : 就是在判断代理的对象是否有实现接口，有实现接口的话直接走new JdkDynamicAopProxy(config)分支，即使用JDK的动态代理。
		 */
		if (config.isOptimize() || config.isProxyTargetClass() || hasNoUserSuppliedProxyInterfaces(config)) {
			Class<?> targetClass = config.getTargetClass();
			if (targetClass == null) {
				throw new AopConfigException("TargetSource cannot determine target class: " +
						"Either an interface or a target is required for proxy creation.");
			}
			//targetClass.isInterface: 如果此对象表示一个接口此方法返回true，否则返回false。  
			//Proxy.isProxyClass：  如果类是代理类，则返回true，否则返回false
			if (targetClass.isInterface() || Proxy.isProxyClass(targetClass)) {
				//由于JdkDynamicAopProxy ObjenesisCglibAopProxy 访问权限的问题，所以这里先注释掉
//				return new JdkDynamicAopProxy(config);
				return null;
			}
			//由于JdkDynamicAopProxy ObjenesisCglibAopProxy 访问权限的问题，所以这里先注释掉
			//其他的走cglib代理
//			return new ObjenesisCglibAopProxy(config);
			return null;
		}
		else {
			//由于JdkDynamicAopProxy ObjenesisCglibAopProxy 访问权限的问题，所以这里先注释掉
			//默认使用JDK的代理
//			return new JdkDynamicAopProxy(config);
			return null;
		}
	}

	/**
	 * Determine whether the supplied {@link AdvisedSupport} has only the
	 * {@link org.springframework.aop.SpringProxy} interface specified
	 * (or no proxy interfaces specified at all).
	 */
	private boolean hasNoUserSuppliedProxyInterfaces(AdvisedSupport config) {
		Class<?>[] ifcs = config.getProxiedInterfaces();
		return (ifcs.length == 0 || (ifcs.length == 1 && SpringProxy.class.isAssignableFrom(ifcs[0])));
	}
	
}
