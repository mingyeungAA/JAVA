package com.cal01;

public class DayOfCalendar {
	
	//1년 1월 1이 = 월요일 가정
	
	
	//윤년계산
	private static boolean isLeapYear(int year) {
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			return true;
		}
		
		return false;
	}
	
	
	//일수 계산
	private static int dates(int year, int month) {
		int tmp=0;
		
		if(isLeapYear(year)) { //윤년일때
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				tmp=31;
				break;
			case 4: case 6: case 9: case 11:
				tmp=30;
				break;
			case 2:
				tmp=29;
				break;
			}
		}
		else {//윤년이 아닐때
			if(month==1 || month==3 ||month==5 || month==7||month==8 || month==10 || month==12) {
				tmp=31;
			}
			else if(month==4 || month==6 || month==9 || month==11) {
				tmp=30;
			}
			else if(month==2) {
				tmp=28;
			}
		}
		return tmp;
	}
	
	//요일계산 >> year년 month 월 1일의 요일
	private static int whatDay(int year, int month) {
		int dayOfWeek = 0;
		
		//2020년 4월 입력했다고 가정
		int sum=0;
		
		
		//1년 1월 1일 - 2019년 12월 31일
		for(int i=1 ;i<year ;i++) {
			for(int j=1; j<=12 ; j++) {
				sum+=dates(i,j);
			}
			
		}
		
		//2020년 1월 1일 - 2020년 3월 31일
		for(int i=1 ; i<month; i++) {
			sum+=dates(year,i);
		}
		
		//+1   >> 해당 달
		sum++;
		
		
		//year년 month월 1일의 요일 (0:일요일, 1:월요일,,,,)
		dayOfWeek = sum%7;
		
		
		return dayOfWeek;
	}
	
	//출력
	public static void prn(int year, int month) {
		//윗부분
		System.out.printf("\t\t %d 년  %d 월 \n",year,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		//시작 요일
		int start = whatDay(year, month);
		
		//마지막 날짜
		int last = dates(year,month);
		
		//해당 요일만큼 빈공간
		for(int i=0 ; i<start ;i++) {
			System.out.print("\t");
		}
		
		//출력
		for(int i = 1; i<=last ; i++) {
			System.out.printf("%d\t",i);
			start++;
			if(start%7==0) {
				System.out.println();
			}
		}
		
	}
	
	
	

}
