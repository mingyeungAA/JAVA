package com.test02;

public class TypeToType01 {
	
	public static void main(String[] args) {
		
		byte b1 = 100;
		int i1 = b1;   //묵시적 형 변환(upCasting, promotion) 작은타입에서 큰 타입으로 갈때
		System.out.println(i1);
		
		int i2 = 100;
		byte b2 = (byte)i2; //영시적 형 변환(downCasting, casting) 큰타입에서 작은타입으로 갈때
		System.out.println(b2);
		
		
	}

}
