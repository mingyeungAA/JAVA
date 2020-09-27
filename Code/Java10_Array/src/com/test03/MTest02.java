package com.test03;

import java.util.Arrays;

public class MTest02 {
	/*
	 *  1  2  3  4  5
	 *  6  7  8  9  10
	 *  11 12 13 14 15
	 *  16 17 18 19 20
	 *  21 22 23 24 25
	 *  
	 *  1. for문과 if문을 사용하여 이와 같은 2차원 배열을 완성하자.
	 *  2. 해당 배열을 출력하자.
	 */
	
	/*
	 public static void main(String[] args) {
	 
		int [][]array = new int [5][5];  
		
		int cnt= 0;
		
		for(int i = 0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				cnt++;
				array[i][j]=cnt;
			}
			System.out.print(Arrays.toString(array[i])+" ");
			System.out.println();	
		}
		*/
		//
		public static void main(String[] args) {
			
			//1   2  3  4  5
			//10  9  8  7  6
			//11 12 13 14 15
			//20 19 18 17 16
			//21 22 23 24 25
			
			int [][]array = new int [5][5];  
			
			int cnt= 1;
			
			/*
			for(int i = 0 ; i<array.length ; i++) {
				for(int j=0 ; j<array.length ; j++) {
					array[i][j]=cnt;  //array[i][j] = cnt++; //후위연산자
					cnt++;
				}
			}
			*/
				//System.out.print(Arrays.toString(array[i])+" ");
				//System.out.print(Arrays.toString(array) //0번지에 배열이 들어가 있어서 주소값이 출력됨 >> 잘못된 방법
				//System.out.print(Arrays.deepToString(array)); //일자로 출력됨
			
				/*
				for(i = 0; i<array.length; i++) {
					for(int j=0 ; j<array[i].length ; j++) {
						System.out.printf("%3d",array[i][j]);
					}
					System.out.println();
				}
				*/
				
				
			for(int i=0 ;i<array.length ; i++) {
				if(i%2==0) {
					for(int j=0 ; j<array[i].length; j++) {
						array[i][j]=cnt++;
					}
				}
				else {
					for(int j=array[i].length-1 ; j>=0 ; j--) {
						array[i][j] = cnt++;
					}
				}
			}
			
			/* 이건 출력 안된ㅋㅋㅋ
			for(int i=0; i<array.length ; i++) {
				for(int j=0 ; j<array[i].length ;j++) {
					array[i][j]=cnt++;
					if((i==1)||(i==3)) {
						for(j=array[i].length-1 ; j>=0 ; j--) {
							array[i][j]=cnt++;
						}
					}
				}
			}
			*/
			
			
			//출력문
			for(int i = 0; i<array.length; i++) {
				for(int j=0 ; j<array[i].length ; j++) {
					System.out.printf("%3d",array[i][j]);
				}
				System.out.println();
			}
				
		}

		
	

}
