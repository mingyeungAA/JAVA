package com.test01;

public class MTest {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.bark();
		cat.bark();
		
		dog.eat("뼈다귀"); //멍멍이가 뼈다귀 먹는다.
		cat.eat("츄르"); //츄르 먹는다.
	}

}
