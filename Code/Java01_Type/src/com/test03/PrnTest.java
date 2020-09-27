package com.test03;

public class PrnTest {
	
	/*
	 * System.out.print() - 줄 바꿈 없음
	 * System.out.println() - 줄 바꿈 있음
	 * System.out.printf() - 'f':formatter (자리, 형식 지정)
	 * 
	 * java.util.Formatter
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.print("1. abc");
		System.out.println("2. def");
		int i = 100;
		System.out.printf("3. %10d %5d",i,i);
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		/*
		 * 시험점수  결과는 100점(su)이고, 학점은 'A'(ch)가 나왔다. 
		 * 나의 오늘 감정지수는 90.50%(d)이다.
		 */
		
		int su = 100;  //10칸
		char ch = 'A'; //5칸
		double d = 90.5; //5칸에 소수점 둘째자리까지 표시
		
		 
		
		System.out.printf("시험점수 결과는 %10d 점이고, 학점은 '%5c'가 나왔다. 나의 오늘 감정지수는  %5.2f%% 이다.",su,ch,d);
		
		
		
	}

}
