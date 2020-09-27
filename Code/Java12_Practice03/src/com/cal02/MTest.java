package com.cal02;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("년 입력 : ");
	      int year = sc.nextInt();
	      System.out.println("월 입력  : ");
	      int month = sc.nextInt();
	      
	      CalendarUseApi cal =new CalendarUseApi();
	      cal.prn(year, month);
	   }

}
