package com.test02;

import com.test01.MethodTest01; //다른 패키지 내의 클래스를 사용하려면 import해야함

public class MethodTest03 {
	//다른 패키지의 클래스를 가져오기
	
	public static void main(String[] args) {
		
		MethodTest01.publicMethod();
		//MethodTest01.protectedMehotd(); //protected 상속이 아닐경우 같은 패키지 않에서만 가능
		//MethodTest01.defaultMethod(); //default 같은 패키지안에서만 사용가능
		//MethodTest01.privateMethod(); //private 현재 클래스에서만 사용가능
		
		MethodTest01 method = new MethodTest01();
		method.nonStaticMethod();
		
		
		
		
	}

}
