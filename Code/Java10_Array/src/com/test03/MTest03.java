package com.test03;

import java.util.Arrays;

public class MTest03 {
	/*
	 *  1 4 7
	 *  2 5 8
	 *  3 6 9
	 *  모양의 배열을 생성하고 출력하자.
	 */
	public static void main(String[] args) {
		int [][]array = new int[3][3];
		int cnt=1;
		
		//
		/*
		for(int i=0 ; i< array.length ; i++) {
			cnt=i+1;
			for(int j=0 ; j<array[i].length ; j++) {
				array[i][j] = cnt;
				cnt+=3;
			}
			System.out.println(Arrays.toString(array[i]));
		} */
		
		//
		for(int i=0 ; i<array.length ;i++) {
			for(int j=0 ; j<array[i].length ;j++) {
				array[j][i]=cnt++;
			}
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
