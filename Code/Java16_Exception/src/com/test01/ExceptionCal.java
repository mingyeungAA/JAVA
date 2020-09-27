package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCal {

	public int calculation() {

		int res = 0;

		while (true) {
			try {
				res = inputNum() / inputNum();
				break;
			} catch (InputMismatchException e) {
				// e.printStackTrace(); // 예외가 어디서부터 발생했는지 출력하자
				System.out.println("숫자가 아닌 다른 값은 입력하실 수 없습니다.");
				System.out.println("다시 입력해주세요..");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println("다시 입력해주세요..");
			} finally {
				System.out.println("--------------");// 위에 명령문들이 다 수행되고 맨마지막에 무조건!! 실행됨 >> 예외가 일어나도 출력됨ㄹ
			}
		}

		return res;
	}

	private int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int n = sc.nextInt();
		return n;

	}

}
