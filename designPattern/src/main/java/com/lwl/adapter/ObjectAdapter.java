package com.lwl.adapter;

public class ObjectAdapter implements ObjectTarget {

	
	private ObjectAdaptee adaptee;
	
	
	public ObjectAdapter(ObjectAdaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void simpleOption1() {

	}

	@Override
	public void simpleOption2() {
		adaptee.simpleOption2();
	}

}
