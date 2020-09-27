package com.cal;



public class DayofCalendar {

	private static boolean isLeapYear(int year) {
		if((year%4==0) && !(year%100==0) || (year%400==0)) {
			return true; //윤년
		}
		else
			return false; //윤년 아님
		
	}
	
	//해당 년도의 해당 달의 일수 계산
	private static int dates(int year, int month) {
		
		int tmp = 0;
		
		//윤년이면 2월이 29일까지 있음
		if(isLeapYear(year)) { 
			switch(month) {
			case 1: case 3: case 5: case 7: case 9: case 11:
				tmp=31;
				break;
			case 4: case 6: case 8: case 10: case 12:
				tmp=30;
				break;
			case 2:
				tmp=29;
				break;
			}
		}
		//윤년이 아니면  2월은 28일까지
		else {
			switch(month) {
			case 1: case 3: case 5: case 7: case 9: case 11:
				tmp= 31;
				break;
			case 4: case 6: case 8: case 10: case 12:
				tmp=30;
				break;
			case 2:
				tmp=28;
				break;
			}
		}
		return tmp;
	}
	private static int whatday(int year, int month) {
		int dayofweek = 0;
		
		int sum=0;
		
		for(int i =1; i<year ; i++) {
			for(int j=1 ; j<=12 ; j++) {
				sum+=dates(i,j);
			}
		}
		
		for(int i=1 ; i<month ; i++) {
			sum+=dates(year,i);
		}
		
		sum++;
		
		dayofweek = sum%7;
		
		return dayofweek;
	}
	
	public static void prn(int year, int month) {
		System.out.printf("\t\t %d 년 %d 월 \n",year,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		int start = whatday(year,month);
		
		int last =  dates(year,month);
		
		for(int i=0 ; i<start ; i++) {
			System.out.println("\t");
		}
		
		for(int i=1 ; i<last ; i++) {
			System.out.printf("%d\t,i");
			start++;
			if(start%7==0) {
				System.out.println();
			}
		}
	}
	
	

}
