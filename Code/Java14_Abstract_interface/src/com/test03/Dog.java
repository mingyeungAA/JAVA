package com.test03;

public class Dog implements Animal {

	
	public Dog() {
		
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	@Override
	public void eat(String feed) {
		// TODO Auto-generated method stub
		System.out.println("멍멍이가 "+feed+"먹는다.");
	}

}
