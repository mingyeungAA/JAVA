package com.random;

import java.util.Random;

public class MTest {
	public static void main(String[] args) {

		mathClass();
		//minMax();
		//randomClass();
	}
	
	public static void randomClass() { //java.utill class >> import 필요
		Random rd=new Random();
		System.out.println(rd.nextInt(100)); //0 <= x < 100
		// Random()은 무조건 0부터 (숫자)까지의 범위에서 랜덤
		
		
	}
	
	public static void minMax() {
		// 10-100 사이의 난수 발생시켜서 출력
		int a = (int)(Math.random()*91)+10; //100-10+1
		System.out.println(a);
		
		/*int min=10;
		int max=100;
		int rd=(int)(Math.random()*max-min+1))+min;
		System.out.println(rd);*/
	}

	public static void mathClass() {
		//0.0 <= x <1.0 숫자를 랜덤으로 리턴   => Math.random()
		double ran = Math.random();
		System.out.println(ran);
		
		//원하는 범위의 난수값 = (Math.random()*(max-min +1)) + min;
		int i =(int) (Math.random()*10); // 0~9
		System.out.println(i);
	}

}
