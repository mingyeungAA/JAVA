package com.cal01;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("year : ");
		int year = sc.nextInt();
		System.out.println("month : ");
		int month = sc.nextInt();
		
		DayOfCalendar.prn(year, month);
		
	}

}
