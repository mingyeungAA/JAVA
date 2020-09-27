package com.test02;

public class BreakTest {
	
	/*
	 * A B C D E
	 * F G H I J
	 * K L M N O
	 * P Q R S T
	 * U V W X Y
	 * Z
	 * 
	 */

	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		int count = 0;
		char c = 'A';
		boolean stop = false;
		
		while(!stop) {
			
			while(true) {
				System.out.print(c+" ");
				c++;     //아스키코드 >> B..C..D..E.....
				count++;
				
				if(count%5==0) {
					break; //break는 반복을 멈추고 밖으로 나가버린다.(가장 가까운 반복문을 종료시킨다.)
				}
				if(count == 26) {
					stop=true;
					break;
				}
			}
			System.out.println();
		}
	}

}
