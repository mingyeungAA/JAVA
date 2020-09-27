package com.test01;

//abstract 추상클래스 : 추상 메소드를 하나 이상 가질 수 잇는 클래스
public abstract class Animal {
	
	//추상메소드 : boby가 없는 메소드  ->  상속받는 자식 클래스가 반드시 구현해야됨!!
	public abstract void bark();  //추상메소드는 body가 없는 메소드라서 , new라는 것을 가지고 객체 생성을 할 수없음.
	
	public void eat(String feed) {
		System.out.println(feed+" 먹는다.");
	}
	
}
