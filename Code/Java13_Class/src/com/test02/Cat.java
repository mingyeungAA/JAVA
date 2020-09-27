
package com.test02;

public class Cat extends Animal{
	public Cat() {
		System.out.println("고양이");
		
	}
	
	//재정의 : 부모 클래스의 메소드를 자식 클래스가 확장
	@Override 
	public void bark() {
		//super.bark()를 쓰면 "울음소리 : "가 출력됨
		System.out.println("야옹"); //그냥 "야옹"만 출력된다.
	}
}
