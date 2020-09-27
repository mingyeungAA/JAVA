package com.test02;

public class TypeToType03 {
	public static void main(String[] args) {
		
		//boxing (기본타입or값을 wrapper class로 감싸는것)
		Integer i = new Integer(100);
		
		//unboxing (wrapper class > 기본값)
		//명시적
		int j = i.intValue();
		System.out.println(j);
		//묵시적
		int k = i;
		System.out.println(k);
		
		
		
		
	}

}
