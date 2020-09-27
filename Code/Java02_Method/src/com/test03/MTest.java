package com.test03;

public class MTest {
	public static void main(String[] args) {
		
		MyCalc.sum(10, 3); // = argument(괄호 속 숫자)
		
		int subRes = MyCalc.sub(10,3);
		System.out.println("10 - 3 = "+subRes);
		
		double mulRes = MyCalc.mul(10.2, 3);
		System.out.println(mulRes);
		System.out.println(MyCalc.mul(10.3,2));
		
		MyCalc.div(10,3);
		
	}

}
