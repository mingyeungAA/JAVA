package com.palindrome;

import java.util.Scanner;

public class PalindromeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("아무거나 입력해주세요 : ");
		String input = sc.next();
		
		if(isPalin(input)) {
			System.out.println(input+" : 회문이 맞습니다.");
		}
		else {
			System.out.println(input+" : 회문이 아닙니다.");
		}
		 
	}
	public static boolean isPalin(String input) {
		//input.toCharArray();
	
		char []input2 = input.toCharArray();
		
		for(int i=0 ; i<input2.length ; i++) {
			if(input2[i]==input2[input2.length-i-1]) {
				return true;
			}
			else {
				return false;
			}
		}
		
		/*
		String reverse="";
		for(int i=input.length() ; i>0 ; i--) {
			reverse +=input.charAt(i-1);
		}
		return revers.equals(input)?true:false;
		*/
		
		
		/*
		char[] original = input.toCharArray();
		char[] reverse = new char[original.length];
		int idx=0;
		for(int i =original.length; i>0 ; i--) {
			reverse[idx]=original[i-1];
			idx++;
		}
		
		for(int i=0; i<original.length ; i++) {
			if(original[i] != reverse[i]) {
				return false;
			}	
		}
		return true;
		*/
		
		
		/*
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		
		return input.equals(sb.toString())?true:false;
		*/
		
		
		return false;
	}
}
