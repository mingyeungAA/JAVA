package com.test01;

public class Type02 {
	//정수형 : byte(1byte = 8bit), short(2byte), int(4byte), long(8byte)-'l'이라는 접미사 붙음
	public static void main(String[] args) {
		//Type 변수 = 값(=literal);
		
		byte b01 = 100;
		System.out.println(b01);
		
		byte b02 = (byte) 128; 
		System.out.println(b02);
		
		byte sumB = (byte)(b01+b02);
		System.out.println(sumB);
		
		System.out.println("-------------------------------");
		
		
		short s1 = 32767;
		System.out.println(s1);
		
		short s2 = 2;
		System.out.println(s2);
		
		short sumS = (short) (s1+s2);
		System.out.println(sumS);
		
		System.out.println("-------------------------------");
		
		//정수형 리터럴의 기본 타입은 int
		
		int i = 10;
		int j = 20;
		int sum =i+j; //연산의 기본도 int
		
		System.out.println(sum);
		
		System.out.println("-------------------------------");
		
		long l1 = 3000000000l; //뒤에 소문자나 대문자 L을 적어야 함. 안쓰면 애러뜸
		long l2 = 4000000000L;
		long sumL = l1+l2;
		System.out.println(sumL);
		
		System.out.println("-------------------------------");
		
		//0b : 2진수
		System.out.println(0b10);
		//00 : 8진수
		System.out.println(0010);
		//0x : 16진수
		System.out.println(0x16);
		
		
		
		
		
		
	}

}
