package com.opr;

public class PlusMinus {
	public static void main(String[] args) {
		System.out.println(opr(24));
		
	}
	public static boolean opr(int input) {
		boolean res = false;
		
		int a=3;
		int b=5;
		
		int tmp = a++ + ++a + ++a + b++ + --b; //3(4)+5(5)+6(6)+5(6)+5(6) = 24
		
		res = (tmp==input)?true:false;
		
		return res;
	}
}
