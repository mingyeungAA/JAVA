package com.test02;

public class TypeToType02 {
	
	public static void main(String[] args) {
		
		int i = 65;
		char c = (char)i;
		System.out.println(c);
		
		char c2 = 'B';
		int i2 = (int)c2;
		System.out.println(i2);
		
		
		char c3_1 = '9';
		char c3_2 = '1';
		int i3 = c3_1 + c3_2;
		System.out.println(i3);
		
		
		String str = "65";
		System.out.println(str+1);
		
		int i4 = Integer.parseInt(str); //문자열을 int타입으로 변환
		System.out.println(i4+1);
		
		
		int i5 = 65;
		String str2 = String.valueOf(i5); //int값을 문자열로 변환
		System.out.println(str2+1);
		
		String str3 = Integer.toString(i5); //int값을 문자열로 변환
		System.out.println(str3+1);
		
		
		System.out.println("---------나혼자 실습(아래)-----------");
		String str4="67";
		System.out.println(str4+1); //67에 1이 더해져서 >> 671이 출력됨
		//67+1=68이 되게 하려면 (아래처럼)
		int i6 = Integer.parseInt(str4);
		System.out.println(i6+1);
		
		
	}

}
