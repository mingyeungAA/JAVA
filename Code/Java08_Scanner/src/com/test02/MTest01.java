package com.test02;

import java.util.Scanner;

public class MTest01 {

	public static void test01() {
		Scanner sc = new Scanner(System.in); // System.in >> 콘솔창에 입력 할 수 있게 해주겠다.

		System.out.println("첫번째 숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 : ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("두 숫자의 합 : " + sum);
	}

	public static void test02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		String s = sc.nextLine(); // 중간 공백까지 같이 출력
		System.out.println("입력하신 문자 : " + s);

	}

	public static void test03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요 : ");

		String s = sc.next(); // 공백은 출력x (token을 리턴 = 입력받는 애를 공백으로 구분)
		System.out.println("입력하신 문자 : " + s);

		String s2 = sc.nextLine(); // 입력안받는 이유 = 입력받은 애의 앞 토큰이 출력되고 자동으로 공백 다음의 토큰을 출력
		System.out.println("그리고 : " + s2);
		
		String s3 = sc.next();
		System.out.println("그 다음 : "+s3);
		
		sc.close();
	}

	public static void main(String[] args) {
		// test01();
		// test02();
		test03();
	}

}

//console창에 빨간네모가 떠 잇으면, 무한루프 >> 기다리고 있다.
