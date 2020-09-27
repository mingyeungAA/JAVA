package com.test01;

public class MethodTest02 {
	
	
	//method 호출 방법
	public static void main(String[] args) {
		//1. static인 경우 : Class.method();
		//(MethodTest01의 메소드 끌어오는)
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod() -> private은 현재 클래스에서만 접근, 참조 가능
		
		//2. non static인 경우 : class(type) 변수 = new class();
		//				   	    변수.method();
		
		MethodTest01 myNonStatic = new MethodTest01(); //객체 생성
		myNonStatic.nonStaticMethod();
		
	}
	
	//http://www.objectaid.com
	//UML (Unified Modeling Language) : 설계

}
