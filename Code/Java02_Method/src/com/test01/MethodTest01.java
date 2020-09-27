package com.test01;

public class MethodTest01 {
	
	public static void main(String[] args) { //얘도 매소드임
		MethodTest01.publicMethod();  //호출방법1 : 클래스명.메소드명();
		MethodTest01.protectedMethod();
		defaultMethod();  //호출방법2 : 메소드명();
		privateMethod();
		
		
	}
	//접근제한자(public, protected, default, private)
	public static void publicMethod() {
		System.out.println("public method");
		System.out.println("어디서나 접근, 참조 가능 (+)");
	}
	
	protected static void protectedMethod() {
		System.out.println("protected method");
		System.out.println("상속인 경우, 상속된 곳에서 접근, 참조 가능");
		System.out.println("상속이 아닌 경우, 같은 패키지 내에서..(#)");
	}
	
	static void defaultMethod() {
		System.out.println("default method");
		System.out.println("같은 패키지 내에서 접근, 참조 가능(~)");
		
	}
	
	private static void privateMethod() {
		System.out.println("private method");
		System.out.println("현재 클래스 내에서만 접근, 참조 가능(-)");
		
	}
	
	public void nonStaticMethod() { //static 안붙은
		System.out.println("non static method");
		System.out.println("객체 생성 필요!");
	}

}
