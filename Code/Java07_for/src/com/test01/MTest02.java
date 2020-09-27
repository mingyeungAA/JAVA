package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		prn();
		
	}

	
	public static void prn() {
		int j=0;
		
		for(int i=0 ; i<10 ; i++) {
			for( ; j<10; j++) {
				System.out.printf("i = %d, j = %d\n",i,j);
			}
			System.out.println(i); //>>console에서 아래 나머지 공백은 println을 9번 출력한것
		}
	}
	
	
	
}
