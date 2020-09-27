package com.opr;

import java.util.Scanner;


public class DigitSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 숫자를 입력해 주세요 : ");
		int input = sc.nextInt();
		
		//사칙연산을 사용하여 각 자리수를 구하자.
		
		int a = input/1000;          //(input/1)%10 >> 4 
		int b = (input%1000)/100;    //(input/10)%10 >> 3
		int c = ((input%1000)%100)/10; //(input/100)%10 >> 2
		int d = (((input%1000)%100)%10)/1; //(input/1000)%10 >> 1;
		
		int sum = a + b + c + d;
		System.out.println(sum);
	}

}
