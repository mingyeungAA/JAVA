package com.test03;

public class MTest04 { //달팽이
	/*
	 * 1   2   3   4   5
	 * 16  17  18  19  6
	 * 15  24  25  20  7
	 * 14  23  22  21  8
	 * 13  12  11  10  9 
	 * 
	 */
	
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		int tt=4;
		int RR=0;
		
		
		int cnt=1;
		
		 for(int i=0 ; i<1 ; i++) {
			 for(int j=0; j<5;j++) { //j=0,1,2,3,4,
				 array[i][j]=cnt++; //1,2,3,4,5
			 }
		 }
		 
		 for(int i=1; i<=2 ;i++) {
			 
			 for(int k=RR+1; k<=tt ; k++) { //6,7,8,9  //20,21
				 array[k][tt]=cnt++;
			 }
			 
			 for(int k=tt-1 ; k>=RR ; k--) { //10,11,12,13   //22,23
				 array[tt][k]=cnt++;
			 }
			 for(int k=tt-1 ; k>RR;k--) { //14,15,16    //24
				 array[k][RR]=cnt++;
			 }
			 for(int k=RR+1 ; k<tt ; k++) { //17,18,19  //25
				 array[RR+1][k]=cnt++;
			 }
			 
			 tt--;
			 RR++;
		 }
		
		//출력문
		for(int i=0; i<array.length; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				System.out.printf("%3d",array[i][j]);
			}
			System.out.println();
		}
		
	}

}
