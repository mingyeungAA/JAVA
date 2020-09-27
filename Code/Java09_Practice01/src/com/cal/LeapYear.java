package com.cal;

import java.util.Scanner;

/*
 * 그후 그레고리오력에서는 다음과 같은 치윤법(置閏法)을 정하고 시행하였다. 
 * 즉, ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, 
 * ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, >> &&
 * ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다. >> ||
 * 
 */
public class LeapYear { 
	//이름 앞에 is가 붙어있으면 boolean
	//hasXX(parm)이면 boolean
	//toXX(parm)이면 Object (~로 바꿔주는)
	
	public static void main(String[] args) {
		//임의의 연도를 입력했을때,
		//해당 연도가 윤년이면 "xxxx년은 윤년이 맞습니다."
		//윤년이 아니면, "xxxx년은 윤년이 아닙니다." 라고 출력하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하라 : ");
		int year = sc.nextInt();
		
		boolean a = isLeapYear(year);
		
		if(a==true) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		sc.close();
	}

	public static boolean isLeapYear(int year) {
		// 윤년이면 true, 윤년이 아니면 false
		
		/*if ((year % 4 == 0) && !((year%100==0)&& !(year % 400 == 0))) { //윤년 
			return true;
		}
		else
			return false;
	}*/
	
	if((year%4==0) && !(year%100==0)||(year%400==0)) {
		return true;
	}
	else
		return false;
	}
	
	/*
	public static boolean isLeapYear(int year) {
		boolean leap=false;
		if((year%4==0) && (year%100 !=0) || (year%400==0)) {
			leap=true;
		}
		
		return leap;
	} */
}
