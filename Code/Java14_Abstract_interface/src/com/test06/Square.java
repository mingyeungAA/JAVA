package com.test06;

import java.util.Scanner;

public class Square extends AreaImpl {

	@Override
	public void make() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 길이를 입력해주세요 : ");
		int x = sc.nextInt();
		System.out.println("세로 길이를 입력해주세요 : ");
		int y = sc.nextInt();
		
		int res = x*y;
		setResult(String.valueOf(res));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("사각형의 ");
		super.print();
	}
}
