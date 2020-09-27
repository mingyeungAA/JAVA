package com.test01;

import java.util.Arrays;

public class MTest01 {
	public static void main(String[] args) {
		
		//방법1  
		int [] a;        //>> 선언  (= int a[] )  >>보통 []를 앞에 씀
		a = new int[5];   //>> 정의
		a[0]=1;   //초기화 (값을 넣어주는 것)
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		//방법2
		int[] b = new int[] {5,3,1,2,4};  //선언=정의{초기화}
		
		//방법3
		int[] c= {6,7,9,0,8};   //선언 = {초기화}
		
		
		int [] arr = {};
		arr[0]=1; //배열 추가 불가능
		
		
		System.out.println(Arrays.toString(arr));
		
		
		//System.out.println(a[2]);
		//System.out.println(b[3]);
		//System.out.println(c[2]);
		
		//System.out.println(c);
		
		//prn(a);
		
		String[] s=new String[] {"have","a","nice","day"};
		//modi(s);
		
		//System.out.println(Arrays.toString(b));  //for문 안쓰고 배열 출력  Arrays.toString(배열명);
	}
	
	public static void modi(String[] s) {
		//s배열에서 nice를 good으로 바꾸고, 전체 출력하자.
		s[2] = "good";
		for(int i=0; i<s.length ; i++) {
			System.out.print(s[i]+ " ");
		}
	}
	
	public static void prn(int[] arr) {
		//arr의 0번지 부터 arr.length-1번지까지 값을
		//반복적으로 출력
		
		for(int i=0; i<arr.length ;i++) {
			System.out.printf("%2d",arr[i]);
		}
		
	}

}
