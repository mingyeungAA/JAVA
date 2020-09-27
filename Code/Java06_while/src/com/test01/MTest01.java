 package com.test01;

public class MTest01 {
	
	public static void prn02() {
		int i = 0;
		while(i < 10) { //while문에서 조건이 거짓이면 아래 명령문을 수행하지 않고 끝난다.
			System.out.println(i);
			i++;
		}
		System.out.println("while이 종료된 후의  i = "+i);
	}
	
	public static void prn01() {
		while(true) { //해당 프로그램이 종료될때까지 true >> 무한루프
			System.out.println("Hello World!");
		}
		
		
	}
	
	public static void main(String[] args) {
	
		//prn01();
		//prn02();
		prn03();
		System.out.println("----------prn04----------");
		prn04();
	}
	
	public static void prn04() {
		int i=1;
		while(true) {
			System.out.println(i);
			if(i ==10) {
				break; //반복문을 멈춘다.
			}
			i++;
		}
	}

	private static void prn03() {
		int i = 1;
		
		do { //do명령어를 수행하고 while조건을 확인
			System.out.println(i);
			i++;
		}while(i < 10); //while(i==10)은 이미 조건 자체가 false로 시작되는 것
		System.out.println("do-while이 종료된 후 i = "+i);
	}

}
