package com.test01;

/**
 * javadoc test<br>
 * Hello, World!를 출력하는 class<br><br>
 * 
 * javadoc 만드는 방법<br>
 * project 우클릭 - export - javadoc - %JAVA_HOME%\bin\javadoc.exe<br>
 * VM 옵션에 -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 추가
 * 
 * @author 배민경
 *
 */
public class Type01 {
	/**
	 * main method. 프로그램의 주 진입점.
	 * 
	 * @param args 기본 파라미터
	 */
	public static void main(String[] args) {
		//주석: 사람을 위해 남겨놓는 정보 = compile 시 제거됨
		System.out.println("Hello, World!");
		/*
		 * 여러 줄 주석
		 * 주석 =  정보(설명)
		 */
	}

}
