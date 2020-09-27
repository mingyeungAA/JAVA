package com.test01;

public class OprTest {
	// field 속성
	// 전역변수 : class 전체에서 사용할 수 잇는 변수
	public static int I; // I라는 변수
	public static final int TEN = 10; // TEN이라는 상수

	// method 기능
	// 프로그램의 주 진입점
	public static void main(String[] args) {
		// 지역변수 : 해당 블록 내에서만 사용할 수 있는 변수
		int I = 3;

		//String res = op01(TEN, I); // **
		//System.out.println(res); // **이것도 써야 끝에 사칙연산끝!도 출력됨

		System.out.println(op01(TEN,I));  //이것도 가능

		//System.out.println(op02());
		op02();
		op03(TEN, 5);
		op04();
		op05();
		op06();
		op07();

	}

	public static String op01(int a, int b) {
		// 1. 사칙연산
		System.out.println("----------op01-----------");
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
		System.out.printf("%d - %d = %d\n", a, b, (a - b));
		System.out.printf("%d * %d = %d\n", a, b, (a * b));
		System.out.printf("%d / %d = 목: %d, 나머지 = %d\n", a, b, (a / b), (a % b));

		return "사칙연산 끝!\n";
	}

	public static String op02() {
		// 2. 대입연산(+=, -=, *=, /=, %=)
		System.out.println("----------op02-----------");
		int res = 0;
		System.out.println("res = " + res);

		res = res + 10;
		System.out.println("res = " + res);

		res += 10;
		System.out.println("res = " + res);

		res -= 10;
		System.out.println("res = " + res);
		return "-------------------------";
	}

	public static void op03(int a, int b) {
		// 3. 증감연산자(++, --)
		// 전위연산자 : 연산자를 변수 앞에 붙여서 연산을 먼저하게 되고, 값을 나중에 리턴
		// 후위연산자 : 연산자를 변수 뒤에 붙여서 값을 리턴하고, 연산을 나중에 한다.
		System.out.println("----------op03-----------");
		System.out.println(a); // 10
		System.out.println(a++); // 10
		System.out.println(--b); // 4
		System.out.println(--a + b++); // 14

	}

	public static void op04() {
		// 4. 논리연산자 &&, || : true / false
		System.out.println("----------op04-----------");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);

		System.out.println("------------------------");

		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);

		System.out.println("===========================");

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); // &&연산할때, 앞에가 false이면 뒤에는 계산하지 않는다.(Dead code) >> 무조건 거짓이기 때문에 쓰이지 않음
		System.out.println(false && false);

		System.out.println("----------------------");
		System.out.println(true || true); // ||연산할때, 앞에가 true이면 뒤에는 계산하지 않는다. >> 무조건 참이기 때문에
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("=========================");
		I = 11; // 전역변수 I에 11을 대입. 전역변수가 됨
		System.out.println((TEN > I) && (TEN < I));
	}

	public static void op05() {
		// 5. 비교 연산자
		System.out.println("----------op05-----------");
		System.out.println((TEN > I)); // TEN=10, I=11(전역변수)
		System.out.println(TEN >= I);
		System.out.println(TEN < I);
		System.out.println(TEN <= I);
		System.out.println(TEN == I);
		System.out.println(TEN != I);
	}

	public static void op06() {
		// 6. 삼항 연산자 (조건)?참:거짓

		System.out.println("----------op06-----------");
		int a = 5;
		int b = 9;
		int i = (a > b) ? a - b : b - a;
		System.out.println(i);

		boolean res = false;
		res = (a < b) ? true : false;
		System.out.println(res);

		String str = (a < b) ? "a가 b보다 작다" : "a가 b보다 크거나 같다.";
		System.out.println(str);

		String result = (a > b) ? "a가 b보다 크다" : (a < b) ? "a가 b보다 작다" : "a와 b가 같다.";
		System.out.println(result);

	}

	public static void op07() {
		// 7. 비트연산자 : &, |, ^, ~, <<, >>
		// 0,1 비트 상태에서 연산
		System.out.println("-----------op07-----------");
		int a = 10; // int는 4byte = 32bit
		// 0000 0000 0000 0000 0000 0000 0000 1010
		int b = 02;
		// 0000 0000 0000 0000 0000 0000 0000 0010

		System.out.println(a & b); // 같으면 1

		// 0000 0000 0000 0000 0000 0000 0000 1010
		// 0000 0000 0000 0000 0000 0000 0000 0010
		// -----------------------------------------
		// 0000 0000 0000 0000 0000 0000 0000 0010;

		System.out.println(a | b);
		System.out.println(~a);
		// 1111 1111 1111 1111 1111 1111 1111 0101

		System.out.println("--------------------------");

		int c = 10;
		// 0000 0000 0000 0000 0000 0000 0000 1010
		System.out.println(c >> 2);
		// 0000 0000 0000 0000 0000 0000 0000 0010
		System.out.println(Integer.toBinaryString(c << 4)); // 2진수로 출력해주세요 >> c*2의4승
		// 0000 0000 0000 0000 0000 0000 0000 1010 0000
		System.out.println(c >> 1);

	}

}
