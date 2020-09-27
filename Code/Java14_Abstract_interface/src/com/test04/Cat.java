package com.test04;

public class Cat extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
		
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("고양이가 "+feed+" 먹는다.");
	}

}
