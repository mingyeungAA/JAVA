package com.test01;

public class Type03 {
	
	//실수형 : float(4byte)-'f' 접미사 , double(8byte)-'d' 접미사(생략가능)
	public static void main(String[] args) {
		
		float f1 = 0.1f;
		float f2 = 9.8F;
		float sumF = f1+f2;

		System.out.println(sumF);
		
		
		System.out.println("-------------------------");
		
		double d1 = 100.04d;
		double d2 = 9.06; // 실수형의 기본은 double (뒤에 d를 붙이지 않아도 실행됨)
		double sumD = d1+d2;
		System.out.println(sumD+" = "+d1+" + "+d2);
		
		
		
	
	}

}
