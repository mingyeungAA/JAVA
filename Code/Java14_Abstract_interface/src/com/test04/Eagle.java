package com.test04;

public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("파닥파닥");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("독수리 어떻게 울지?");
	}

}
