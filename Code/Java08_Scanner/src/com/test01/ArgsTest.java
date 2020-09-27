package com.test01;

public class ArgsTest {
	
	//run as-> run configuration -> argument -> ${string_prompt}
	
	//main : 프로그램의 주 진입점 -> jvm
	// > 제일 먼저 찾고, 실행
	// > 원래는 프로젝트당 한개의 main만 있어야 함
	
	public static void main(String[] args) {
		String s = args[0];
		System.out.println(s);
		
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println("args : "+args[i]);
		}
		
	}

}
