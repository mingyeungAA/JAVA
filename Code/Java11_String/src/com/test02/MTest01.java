package com.test02;

public class MTest01 {
	public static void main(String[] args) {
		//StringTest();
		StringBufferTest();
	}
	public static void StringTest() {
		String s = "안녕하세요. ";
		System.out.println(s.hashCode());
		
		s+="저는 ";
		s+="배민경 입니다.";
		System.out.println(s.hashCode());
		System.out.println(s);
		
		s.replace("안녕하세요.", "하이!");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		s=s.replace("안녕하세요.", "하이!");
		System.out.println(s);
		System.out.println(s.hashCode());
		
	}
	
	public static void StringBufferTest() { //StringBuffer는 변한다.mutable. 값이 바뀌어도 주소값은 안바뀐다.
		StringBuffer sb = new StringBuffer("하이");
		System.out.println(sb.hashCode());
		
		sb.append("저는 ").append("배민경").append("입니다.");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.replace(0,5,"하이!"); //mutable이기 때문에 이렇게 값을 변경해주기만해도 대입됨
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}

}
