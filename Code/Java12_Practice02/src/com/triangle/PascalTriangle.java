package com.triangle;

import java.util.Scanner;

public class PascalTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄 출력할거여? ");
		int n = sc.nextInt();
		
		int [][]arr = new int[n][n*2];
		
		  for(int i=0 ; i < arr.length; i++ ) {
			  for(int j=0; j < n*2-1; j++) {
				  
				  if((j==n-i-1)||(j==n+i-1)) {//맨 처음 1
					  arr[i][j]=1;
				  }
				  
				  if((i>=2)&&(j>=2)) { //2행부터 1
					  arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1];
				  }
				  if(arr[i][j]==0) { //0을 공백으로 변환
					  System.out.print(" ");
				  }
				  else {
					  System.out.print(arr[i][j]);
				  }
			  }
			  System.out.println();
		  }
	} 
	
	
	//
	/*
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("level : ");
		
		int n = sc.nextInt();
		
		int [][]arr = new int [n][];
		arr[0] = new int[] {1};
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = new int[i+1];
			
			for(int j=0 ; j<arr[i].length ; j++) {
				if((j==0)||(j==arr[i].length-1)) {
					arr[i][j]=1;
				}
				else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		prn(arr);
		
	}
	
	public static void prn(int[][] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=arr.length; j>i; j--) {
				System.out.print("  ");
			}
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
	*/
	//
	

}
