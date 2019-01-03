package com.lwl.factory.abstracts;

import com.lwl.factory.simple.AoDiCar;
import com.lwl.factory.simple.ICar;

public class AodiFactory implements FactoryAbstract {

	@Override
	public ICar getCar() {
		return new AoDiCar();
	}

}
