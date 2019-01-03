package com.lwl.factory.abstracts;

import com.lwl.factory.simple.BaomaCar;
import com.lwl.factory.simple.ICar;

public class BaomaFactory implements FactoryAbstract {

	@Override
	public ICar getCar() {
		return new BaomaCar();
	}

}
