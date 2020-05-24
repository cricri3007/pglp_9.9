package com.doj.patterns.structural.composite;


public class PrimitiveElement extends DrawingElement {

	public PrimitiveElement(String name) {
		super(name);
	}

	@Override
	public void add(DrawingElement d) {
		System.out.println("Cannot add to a PrimitiveElement");
	}

	@Override
	public void remove(DrawingElement d) {
		System.out.println("Cannot remove from a PrimitiveElement");
	}

	@Override
	public void display(int indent) {
		System.out.println(indent + "-" + name);
	}

}
