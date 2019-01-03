package com.lwl.factory.abstracts;

import com.lwl.factory.simple.BenCiCar;
import com.lwl.factory.simple.ICar;

public class BenciFactory implements FactoryAbstract {

	@Override
	public ICar getCar() {
	 
		return new BenCiCar();
	}

}
