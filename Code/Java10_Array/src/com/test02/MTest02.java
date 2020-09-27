package com.test02;

import java.util.Arrays;

public class MTest02 {
	public static void main(String[] args) {
		
		int[] original = {10,20,30,40};
		//복사 1
		int[] copyOne = new int[original.length]; //새로운 복사본 만들기 >> 복사본이 변경되도 원본이 영향을 안 받는다.
		
		for(int i=0 ; i<original.length ; i++) {
			copyOne[i] = original[i];  //original의 배열 값을 copyOne 배열에 똑같이 넣는
		}
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		
		System.out.println(original == copyOne); //false
		copyOne[1] = 22;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		
		System.out.println("--------------------");
		
		//복사2
		int [] copyTwo = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		
		System.out.println(original == copyTwo); //false
		
		System.out.println("======================");
		
		
		int[] systemArray = new int[10];
		Arrays.fill(systemArray, 100);  //systemArray에다가 100으로 다 채워달라.
		System.out.println(Arrays.toString(systemArray));
		
		
		//System.arraycopy(
		//					원본 배열 객체,
		//					원복 시작 위치,
		//					복사 배열 객체,
		//					복사 시작 위치,
		//					복사 갯수
		//					)
		
		//복사3
		System.arraycopy(original,0,systemArray,2,3); //original은 0부터 가져올거고, systemArray는 2부터 붙여놓겠다. 3개를 가져오겠다.
		System.out.println(Arrays.toString(systemArray));
		
		
		
		
		System.out.println("------------------------------");
		//각각의 주소값 나옴(다 다름)
		System.out.println(original);  
		System.out.println(copyOne);
		System.out.println(copyTwo);
		System.out.println(systemArray);
		
	}

}
