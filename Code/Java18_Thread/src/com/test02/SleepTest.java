package com.test02;

public class SleepTest {
	public static void main(String[] args) {
		
		while(true) {
			for(int i=1; i<11;i++) {
				try {
					
					Thread.sleep(1000);  //1초  >> thread 쉬라.
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.print("♡");
			}
			System.out.println();
		}
		
		
	}

}
