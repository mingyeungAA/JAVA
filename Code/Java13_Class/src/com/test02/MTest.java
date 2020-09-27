package com.test02;

public class MTest {
	public static void main(String[] args) {
		
		/*
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.bark();
		dog.bark();
		*/
		
		
		//다형성 (같은 형태인데 다른 행위를 한다.)
		Animal someone = new Dog();
		someone.bark();
		
		someone = new Cat();
		someone.bark();
		
		
		//instancceof
		//이 객체가 이 타입의 값이니?
		if(someone instanceof Dog) { //someone객체가 Dog 타입의 값이니?
			System.out.println("멍멍이"); //맞으면 "멍멍"을 출력해
		}else if(someone instanceof Cat){
			System.out.println("고양이"); 
		}
		//>>마지막에 someone에 Cat()객체를 생성했기 때문에 "고양이"만 출력된다.
		
		/*
		 * <다형성>
		 * 1. 부모타입으로 자식 생성
		 * 	 Parent p = new Child();
		 * 
		 * 2. 부모의 이름으로 자식 대입
		 *   Child c = new Child();
		 *   
		 * 3. 부모의 메서드를 통해 자식 메서드 호출
		 * 
		 * 같은 부모를 갖고 있는 자식 클래스는 컴파일시, 형변환 가능하지만, 
		 * 런타임시 ClassCastException 발생
		 * 
		 * 4.
		 */
		
	}

}
