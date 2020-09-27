package com.score;

public class MTest {
	public static void main(String[] args) {
		Score jung = new Score();
		jung.setName("정윤식");
		jung.setKor(85);
		jung.setEng(90);
		jung.setMath(25);
		
		System.out.println(jung);
		
		Score park = new Score("박건후",50,35,100);
		System.out.println(park);
	}

}
