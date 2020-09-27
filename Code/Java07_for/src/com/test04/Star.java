package com.test04;

public class Star {
	//*
	//**
	//***
	//****
	//*****
	public void prn01() {
		//i는 줄
		for(int i = 0; i<5; i++) {
			//j는 i+1 번 반복하면서 *출력
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------01---------");
	}
	
	//*****
	//****
	//***
	//**
	//*
	public void prn02() {
		
		/*for(int i = 5; i>0; i--) {
			
			for(int j = 0 ; j<i ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("----------02---------");*/
		
		for(int i = 0 ; i<5 ; i++) {
			for(int j = 0 ; j<5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------02---------");
	}
	
	//    *  1
	//   **  1+1
	//  ***  1+2
	// ****  1+3
	//*****  1+4
	public void prn03()	{
		
		for(int i = 0; i<5; i++) {
			for(int j= 0 ; j < 4-i; j++) { //공백 4-0, 4-1, 4-2, 4-3, 4-4
				System.out.print(" ");
			}
			for(int k = 0; k < i+1 ; k++) { //별
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------03---------");		
	}
	
	//*****
	// ****
	//  ***
	//   **
	//    *
	public void prn04() {
		for(int i=0 ; i<5 ; i++) {
			for(int j = 0 ; j < 1+i ;j++) { //공백 4-4, 4-3, 4-2, 4-1, 4-0 / 공백 0,1,2,3,4
				System.out.print(" ");
			}
			for(int k=0 ; k<5-i ;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------04---------");
		
		/*for(int i=0 ; i<5 ; i++) {
			for(int j =0; j<i ; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
	
	
	//    *     1  
	//   ***    3
	//  *****   5
	// *******  7
	//********* 9
	public void prn05() {  //hint : prn03에 별만 더 찍으면 됨(9개)
		/*for(int i = 0 ; i<5 ; i++) { //5줄
			
			for(int j = 0 ; j<4-i ; j++) { //공백 4,3,2,1,0
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k = 1; k<i+1; k++) { //2개씩 증가 
				
				System.out.print("**");
			}
			System.out.println();
		} */
		
		for(int i = 0; i<5 ; i++) { //i는 줄
			
			for(int j=0 ; j<4-i ; j++) { //공백 4,3,2,1,0 (4-0,4-1,4-2,4-3)
				System.out.print(" ");
			}
			
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------05---------");
		
		/*for(int i=0 ; i<5 ; i++) {
			for(int j = 4-i; j<0 ; j--) {
				System.out.print(" ");
			}
			for(int k=0; k < (i*2+1); k++) {  //공백 0+1, 2+1, 4+1, 6+1, 8+1
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
