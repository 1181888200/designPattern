package com.lwl.factory;

import com.lwl.factory.abstracts.AodiFactory;
import com.lwl.factory.abstracts.FactoryAbstract;
import com.lwl.factory.simple.FactoryCar;
import com.lwl.factory.simple.ICar;
import com.lwl.factory.template.FactoryTemplate;

/**
 * 工厂类测试
 * @author lwl
 * @create 2019年1月3日 下午1:14:33
 * @version 1.0
 */
public class FactoryTest {

	public static void main(String[] args) {
	
		//简单工厂类测试
		//这种工厂比较简单，而且如果字符串出错，也容易发生问题，再其次，如果需要新增一种汽车的话，就会导致FactoryCar这个类需要频繁修改
		FactoryCar factoryCar = new FactoryCar();
		ICar car = factoryCar.createCar("aodi");
		car.drive();
		
		//多个方法工厂
		//相比于第一种简单的，就不需要输入字符串，但是也会面临这修改FactoryTemplate类
		FactoryTemplate template = new FactoryTemplate();
		ICar car2 = template.getBaoMaCar();
		car2.drive();
		
		//静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
		//相比于第一种简单的，就不需要输入字符串，但是也会面临这修改FactoryTemplate类
		//相比于第二种方法就是不需要初始化FactoryTemplate类
		ICar car3 = FactoryTemplate.getStaticBenCiCar();
		car3.drive();
		
		//抽象工厂
		//抽象工厂就是通过一个接口，然后各自实现各自的工厂类接口，获取对应的对象
		//如果以后再增加一个汽车类型，只要让他实现FactoryAbstract接口即可，不改动任何其他已有的类代码
		FactoryAbstract abstract1 = new AodiFactory();
		abstract1.getCar().drive();
		
	}

}
