package com.test01;

public class Type04 {
	// 문자형 : '', 하나의 값만 입력가능, char(2byte)
	// 문자열 : "", 기본타입은 아니지만 기본타입처럼 사용할 수 있다.
	// 논리형 : boolean(1byte)

	public static void main(String[] args) {

		char c1 = 'a';
		System.out.println(c1);

		int c2 = c1;
		System.out.println(c2);

		String s1 = "aa";
		System.out.println(s1);

		String s2 = "dd";
		String sumS = s1 + s2;
		System.out.println(sumS);

		char lastName = '\ubc30'; // 배
		System.out.println(lastName);

		System.out.println("---------------------------");

		boolean bl01 = true;
		boolean bl02 = false;

		System.out.println(bl01);
		System.out.println(bl02);

	}

}
