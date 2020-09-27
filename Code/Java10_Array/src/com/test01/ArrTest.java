package com.test01;

import java.util.Arrays;

public class ArrTest {
	public static void main(String[] args) {
		//1. a-z는 1차원 배열에 저장(반복문 사용)
		//a b c d e f 
		//g h i j k l
		//m n o p q r
		//s t u v w x
		//y x
		//출력
		char[] ch = new char[26];
		
		/*
		char c = 'a';
		int count=0;
		for(int i=0 ; i<ch.length ;i++) {
			ch[i]=c++;
		}
		for(int i=0 ; i<ch.length ; i++) {
			System.out.print(ch[i]+" ");
			count++;
			if(count%6==0) {
				System.out.println();
			}
		}*/
		
		for(int i=0 ; i<ch.length ; i++) {
			ch[i]=(char)('a'+i);
		}
		prn(ch);
		
		System.out.println();
		System.out.println("=======================");
		
		//2. 위에서 만든 배열을 거꾸로 출력
		
		/*for(int i=ch.length ; i>0 ; i--) {
			System.out.print(ch[i]+" ");
			count++;
			if(count%6==0) {
				System.out.println();
			}
		}*/
		
		
		/*
		 for(int i=0 ; i<ch.length ; i++) {
			ch[i]=(char)('z'-i);
		}
		prn(ch);
		*/
		
		reverse(ch);
		
		System.out.println();
		System.out.println("=======================");
		
		//3. 1번에서 만든 배열을 대문자로 출력
		
		/*for(int i=0 ; i<ch.length ; i++) {
			//Character.isUpperCase(c);
			System.out.print(ch[i]+" ");
			count++;
			if(count%6==0) {
				System.out.println();
			}
		}*/
		
		
		/*
		for(int i=0 ; i<ch.length ; i++) {
			ch[i]=(char)('A'+i);
		}
		prn(ch);
		*/
		
		upper(ch);		
	}
	
	public static void upper(char[] ch) {
		for(int i=1; i<=ch.length ; i++) {
			System.out.print(Character.toUpperCase(ch[i-1])+" ");
			if(i%6==0) {
				System.out.println();
			}
		}
	}
	
	public static void reverse(char[] ch) {
		int cnt=1;
		for(int i=ch.length ; i>0 ; i--) {
			System.out.print(ch[i-1]+ " ");
			if(cnt%6==0) {
				System.out.println();
			}
			cnt++;
		}
	}
	
	public static void prn(char[] ch) { //출력
		for(int i=1 ; i<=ch.length ; i++) {
			System.out.print(ch[i-1]+" ");
			if(i%6==0) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
}
