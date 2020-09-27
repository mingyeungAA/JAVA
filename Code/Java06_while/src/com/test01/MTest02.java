package com.test01;

public class MTest02 {

	public static void main(String[] args) {
		
		System.out.println("--------prn01--------");
		//1. 1-100까지의 숫자를 거꾸로 출력하자.
		prn01();
		System.out.println("--------prn02--------");
		//2. 1-100까지의 숫자 중 2의 배수만 출력하자.
		prn02();
		System.out.println("--------prn03--------");
		//3. 1-100까지의 숫자 중 7의 배수의 갯수와 총 합을 출력하자.
		prn03();
	}
	public static void prn01() {
		int i = 100;
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		
		/*
		 * while(i>0){
		 * System.out.println(i);
		 * i--;
		 * }
		 */
	}
	
	public static void prn02() {
		int i = 100;
		/*System.out.println(i);
		do {
			i--;
			if(i%2==0) {
				System.out.println(i);
			}
		}while(i>0); */
		
		while(i>0) {
			if(i%2==0) {
				System.out.println(i);
			}
			i--;
		}
		
		/*
		 * int i=1;
		 * while(i<=100){
		 * if(i%2==0){
		 * System.out.println(i);
		 * }
		 * i++;
		 * }
		 * 
		 */
	}
	
	public static void prn03() {
		int i = 100;
		int count=0;
		int sum=0;
		
		while(i>0) {
			if(i%7==0) {
				sum+=i;
				count+=1;
			}
			i--;
		}
		System.out.println("7의 배수의 갯수 : "+count);
		System.out.println("7의 배수의 합계 : "+sum);
		
	}

}
