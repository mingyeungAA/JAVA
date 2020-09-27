package com.test02;

public class ContinueTest {
	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		int i = 0;
		while(i<11) {
			i++;
			if(i%2==0) {
				continue; //continue 밑의 명령문을 건너뛰고 위로 올라가는
			}
			
			System.out.println(i);
		}
	}

}
