package com.opr;

import java.util.Arrays;
import java.util.Scanner;

public class JarisuLoop {
	public static void main(String[] args) {
		//반복문을 사용하여 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 숫자를 입력해 주세요 : ");
		int input = sc.nextInt();
	
		int sum = 0;
		for(int target=input ; target>0 ; target/=10) {
			sum+=target%10;
		}
		System.out.println(sum);
	}
}
