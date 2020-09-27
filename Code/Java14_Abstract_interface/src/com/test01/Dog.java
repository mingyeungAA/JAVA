package com.test01;

public class Dog extends Animal {
 
	//오버라이드 안해주면 오류뜸! bark()
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
		
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("멍멍이가 "+feed+"먹는다."	);
		
	}


}
