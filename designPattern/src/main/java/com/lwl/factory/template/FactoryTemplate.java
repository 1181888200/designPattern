package com.lwl.factory.template;

import com.lwl.factory.simple.AoDiCar;
import com.lwl.factory.simple.BaomaCar;
import com.lwl.factory.simple.BenCiCar;
import com.lwl.factory.simple.ICar;

/**
 * 多个方法工厂
 * @author lwl
 * @create 2019年1月3日 下午1:31:15
 * @version 1.0
 */
public class FactoryTemplate {

	
	public ICar getBaoMaCar() {
		return new BaomaCar();
	}
	
	public ICar getAoDiCar() {
		return new AoDiCar();
	}
	
	
	public ICar getBenCiCar() {
		return new BenCiCar();
	}
	
	
	
	public static ICar getStaticBaoMaCar() {
		return new BaomaCar();
	}
	
	public static ICar getStaticAoDiCar() {
		return new AoDiCar();
	}
	
	
	public static ICar getStaticBenCiCar() {
		return new BenCiCar();
	}
	
	
}
