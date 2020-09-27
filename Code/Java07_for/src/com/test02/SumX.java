package com.test02;

public class SumX {
	
	/*
	 * 1. 다음과 같이 출력하자.
	 * 1  2  3  4  5
	 * 6  7  8  9  10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * 
	 * 2. x모양의 숫자 합계를 출력하자. (1,7,13,9,5,17,21,19,25)
	 *
	 */
	public static void main(String[] args) {
		//ttt1();
		ttt2();
	}

	public static void ttt1() {
		int count = 0;
		
		for(int i = 1 ;  i<26 ; i++) {
			System.out.printf("%4d",i);
			count++;
			if(count%5==0) {
				System.out.println();
			}
		}
	}
	
	public static void ttt2() {
		int cnt=1;
		int sum=0;
		
		for(int i=0 ; i<5; i++) {
			for(int j=0;j<5;j++) {
				if((i==j)||(i+j==4)) {
					
					sum+=cnt;  //cnt는 x모양 값들
					
				}
				System.out.print(cnt++ + " ");
			}
			System.out.println();
			
			
		}
		System.out.println("x의 총 합 : "+sum);
		System.out.println(cnt);
	}
	
	
}
