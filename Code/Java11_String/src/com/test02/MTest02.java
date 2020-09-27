package com.test02;

import java.util.StringTokenizer;

public class MTest02 {
	
	private static String str = "The,String,class,represents,character,strings.";
	
	public static void main(String[] args) {
		//String cut
		
		System.out.println(str.substring(4,10));
		
		String[] tmp = str.split(","); //해당문자를 기준으로 자르것임.
		for(int i=0 ; i<tmp.length ; i++) {
			System.out.println(i+"번지 : "+tmp[i]);
		}
		
		
		StringTokenizer st = new StringTokenizer(str,","); //str을 ,를 기준으로 자른 토큰
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
