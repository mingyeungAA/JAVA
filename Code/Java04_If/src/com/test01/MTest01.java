package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		prn01();
		prn02(false, false);
	}

	public static void prn01() {

		int i = 10;
		int j = 20;

		// if
		if (i < j) {
			System.out.println("i가 j보다 작습니다.");
		}

		// if-else
		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else
			System.out.println("i가 j보다 작거나 같습니다.");

		// if-else if
		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else if (i < j) {
			System.out.println("i가 j보다 작습니다.");
		} else if (i == j) { // 여기는 보지 않음
			System.out.println("i와 j는 같습니다.");
		}

		// if-else if-else
		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else if (i < j) {
			System.out.println("i가 j보다 작습니다.");
		} else {
			System.out.println("i와 j는 같습니다.");
		}

	}

	public static void prn02(boolean ring, boolean married) {
		if (ring) { // (ring==true) 도 가능
			if (married) {
				System.out.println("결혼하셨군요!");
			} else {
				System.out.println("연인이 있으시군요!");
			}

		} else {
			if (married) {
				System.out.println("결혼반지 어디..?");
			} else {
				System.out.println("솔로..?");
			}
		}
		
		if(ring && married) {
			System.out.println("결혼하셨군요!");
		}else if(ring || married) {
			System.out.println("연인이 있으시군요!");
		}else {
			System.out.println("솔로..");
		}

	}

}
