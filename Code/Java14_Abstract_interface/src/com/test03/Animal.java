package com.test03;
//interface : 모든 메소드가 추상 메소드 (abstract 안붙여도 그냥 추상 메소드가 됨) > 모두 body가 없음
public interface Animal {
	
	//interface안에 잇는 변수는 상수화
	String KIND="동물"; //>>상수로 바뀜 >>상수를 만들때는 대문자로 >>스네이크 표기법 사용
	
	public void bark();  //추상메소드 >> 기능을 구현하지 않고, 선언만 해준다.
	void eat(String feed); //추상메소드

}
