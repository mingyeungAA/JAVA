package com.random;

/*
 *  1. 1-9 사이의 5*5 큐브를 출력하자.
 *  2. x형태의 값의 총 합과,
 *     x형태의 값의 평균을 구하자.
 */

public class RandomCube {
	public static void prn() {
		
		int sum=0;
		int count=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5 ;j++) {
				
				int rand = (int)(Math.random()*9)+1; //1부터 9까지 난수
				System.out.printf("%2d",rand);
				
				if((i==j)||(i+j==4)) { //x모양의 값들만 계산
					sum+=rand;
					count++; //갯수 계산
				}
			}
			System.out.println();
		}
		System.out.println("총 합: "+sum);
		System.out.println("평균 : "+(double)(sum/count));
	}
	
	public static void main(String[] args) {
		prn();
	}

}
