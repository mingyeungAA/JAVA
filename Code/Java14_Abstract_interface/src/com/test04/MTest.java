package com.test04;

public class MTest {

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		cat.bark();
		cat.eat("츄르");
		
		Animal dog = new Dog();
		
		dog.bark();
		dog.eat("뼈다귀");
		//dog.bite(); //Animal에 bite()없다.
		((Dog)dog).bite(); //형변환  >> 자식객체의 메소드를 쓰고싶다면 형변환하여 사용
		
		Animal eagle = new Eagle();
		eagle.bark();
		eagle.eat("쥐");
		//eagle.fly(); //Animal에 fly()없음
		((Eagle)eagle).fly(); //형변환
	}
}
