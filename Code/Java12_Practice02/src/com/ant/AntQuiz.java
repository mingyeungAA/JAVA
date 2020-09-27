package com.ant;

import java.util.Scanner;

public class AntQuiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇줄 출력할거여?");
		int jul = sc.nextInt();
		
		int [][]arr = new int [jul][];
		
		int a = 1;
		int b = 0;
		int cnt=0;
		
		//arr[1][0]=a;
		
		for(int i=0 ; i<arr.length; i++) {
			arr[i][0]=1;
			for(int j=0 ; j<arr[i].length ; j++){
				
				System.out.println(arr[i][0]==a);
				if(arr[i][j]==a) {
					cnt++;
				}
				cnt=0;
				System.out.print(arr[i][j]+" ");
			}
			
			
		}
		
		
		
		
		
	}
}
