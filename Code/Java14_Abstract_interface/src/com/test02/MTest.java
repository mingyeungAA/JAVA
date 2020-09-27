package com.test02;

import java.util.Scanner;

public class MTest {
/*
 * 
 * 동적바인딩 : 실행시 메모리 할당을 하면서 메소드를 동적으로 연동
 * 1. 코드 절약
 * 2. 실행속도 향상
 * 3. 행위 은닉
 * Animal animal = null;
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택해주세요 [1.고양이 2.멍멍이 3.코끼리]");
		int select = sc.nextInt();
		
		//Animal 타입에 는 null값
		Animal animal = null;
		
		switch(select) {
		case 1:
			animal = new Cat();break;
		case 2:
			animal = new Dog();break;
		case 3:
			animal = new Elephant();break;
		}
		
		
		animal.start();
		animal.stop();
	}
}
