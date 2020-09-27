package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	private String result;
	
	public Triangle() {
		
	}
	
	@Override
	public void make() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 길이를 입력해주세요 : ");
		int x = sc.nextInt();
		System.out.println("세로 길이를 입력해주세요 : ");
		int y = sc.nextInt();
		
		double res = x*y*1/2;
		setResult(String.valueOf(res));
		//setResult(res+" ");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("삼각형의 ");
		super.print();
	}

}
