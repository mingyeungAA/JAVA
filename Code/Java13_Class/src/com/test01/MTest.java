package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		AA a = new AA();
		Super s = a; //AA객체의 주소값을 s에 저장하겠다.
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		
		//영시적 형변환
		AA a1 = (AA)s; //s는 부모 객체라서 형변환 필요
		
		System.out.println(a1.hashCode());
		
		
		BB b1=  (BB)s; //실제로 s에 저장된 것은 AA이기 때문에 불가능하다.
		//System.out.println(b1.hashCode()); //ClassCastException >> 형변환 불가
	}
}
