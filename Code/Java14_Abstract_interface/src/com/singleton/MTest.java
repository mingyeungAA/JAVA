package com.singleton;

public class MTest {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton();   //private 메소드라서 호출 못함
		Singleton singleton = Singleton.getInstance(); //객체 생성  >> heap영역에 객체 만들어짐
		System.out.println(singleton);
		
		Singleton st = Singleton.getInstance(); //주소값 출력됨 >> 이미 만들어져 잇으면, 만들어져 있는 것의 주소값을 출력해준다.
		
		//만들어진 것을 계속 쓴다.
		System.out.println(st);
		
		System.out.println(st==singleton);  //true
		
	}
}
