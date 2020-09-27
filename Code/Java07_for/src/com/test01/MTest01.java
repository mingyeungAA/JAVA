package com.test01;

public class MTest01 {
	
	
	public static void prn01() {
		//for(초기값; 조건식; 증감식)
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
		
	}
	public static void prn02() {
		for(int i = 100 ; i>0 ; i-- ) {
			System.out.println(i);
		}
	}
	
	
	public static void test001() {
		/*
		 * 100 99 98 97 96 95 94 93 92 91
		 * 90 ....
		 * ...
		 * 10 9 8 7 6 5 4 3 2 1 
		 */
		int count=0;
		
		for(int i = 100 ; i>0 ; i--) {
			System.out.printf("%3d",i);
			count++;
			if(count%10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		//prn01();
		//prn02();
		test001();
	}

}
