package com.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {
	
	
	public Circle() {
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요 : ");
		int r = sc.nextInt();
		
		//result = String.valueOf(half);
		//r*r*Math.PI;
		super.setResult(String.valueOf(r*r*3.14));
		
		
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("원의 ");
		super.print(); 
		//원의 넓이:  result
	}

	
}
