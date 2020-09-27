package com.test03;

import java.util.Arrays;

public class MTest01 {
	/*
	 * 1. 5칸짜리 int 1차원 배열 생성하자.
	 * 2. 반복문을 사용하여 배열의 0번지부터 3번지까지 (4개)
	 *    5-9 난수를 대입하자.
	 * 3. 배열의 0-3번지에 대입된 값들을 모두 곱해서 4번인덱스에 저장하자.
	 * 4. 배열을 출력하자.
	 * 5. 배열 안에 모든 값을 더해서 출력하자.
	 *  
	 */
	
	/*
	public static void main(String[] args) {
		int[] array = new int[5];
		
		for(int i = 0; i <4 ; i++) {
			array[i]=(int)((Math.random()*5)+5);//9-5+1 +5
		}
		
		array[4] = array[0]*array[1]*array[2]*array[3];
		
		System.out.println(Arrays.toString(array)); //4번까지
		int sum = array[0]+array[1]+array[2]+array[3]+array[4];
		System.out.println("총합 : "+sum);	
	} 
	*/
	//
	public static void main(String[] args) {
		//1.
		int[] array = new int[5];
		//2.
		for(int i = 0; i <=3 ; i++) {
			array[i]=(int)((Math.random()*5)+5);//9-5+1 +5
		}
		//3.
		int tmp = 1; 
		for(int i = 0; i <=3  ; i++) {
			tmp *= array[i];
			
		}
		array[4] = tmp;
		
		//4.
		for(int i=0 ; i<array.length ; i++) {
			System.out.print(array[i]+" ");
		}
		
		//5.
		int sum = 0;
		for(int i=0 ; i<array.length ; i++) {
			sum+=array[i];
		}
		System.out.println("\n총 합 : "+sum);
			
	}
}
