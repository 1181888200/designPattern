package com.lwl.factory.simple;

/**
 * 汽车工厂
 * @author lwl
 * @create 2019年1月3日 下午1:18:25
 * @version 1.0
 */
public class FactoryCar {

	
	public ICar createCar(String name) {
		switch (name) {
		case "baoma":
			return new BaomaCar();
			
		case "aodi":
			return new AoDiCar();

		case "benci":
			return new BenCiCar();

		default:
			return null;
		}
	}
	
}
