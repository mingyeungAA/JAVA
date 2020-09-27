package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prn01();
		prn02();
	}

	public static void prn01() {
		// if는 순차적으로 모든 코드를 읽어들인다.
		// switch는 해당 case로 jumping 하기 때문에
		// compiler가 작업하기 편하다. (switch - fall through)

		int i = 2;

		switch (i) { // switch(식 or 값)
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default: 
			System.out.println("다른 숫자입니다.");
		}

	}
	
	public static void prn02() {
		int i = 3;
		
		switch(i) {
		case 1:
		case 3:
			System.out.println("홀수입니다.");break;
		case 2:
		case 4:
			System.out.println("짝수입니다.");break;
		}
		
	}

}
