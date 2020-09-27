package com.test01;

public class MinMax {
	
	public static void main(String[] args) {
		/*
		 * 메모리 영역은 static
		 * 1. 어디서나 접근 가능하며,
		 * 모든 기능을 수행한 후에는 정수 하나가 리턴되는
		 * min 이라는 이름의 메소드를 만들자.
		 * 해당 매소드는 정수값 두 개를 입력 받아서
		 * 둘 중 더 작은 숫자를 리턴해주는 기능을 한다.
		 * -삼향연산자를 사용하자
		 * 2. 위와 같은 방법으로, 둘 중 더 큰 숫자를 리턴해주는 기능을 하는 max 메소드를 만들자.
		 * 3. main 메소드에서 임의의 숫자 두 개를 넣어서, main 매소드와 max 메소드에서 리턴되는 값을 출력하자
		 */
		
		System.out.println(min(10, 5));
		System.out.println(max(10, 5));
		
		
	}
	
	public static int min(int a, int b) {
		int min = (a < b)? a : b;

		return min;
	}
	
	public static int max(int a, int b) {
		int max = (a > b)? a : b;

		return max;
	}

}
