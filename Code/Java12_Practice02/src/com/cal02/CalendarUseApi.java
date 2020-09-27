package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {
	
	public static void prn(int year, int month) {
		//윗부분
		System.out.printf("\t\t %d 년  %d 월 \n",year,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		
		Calendar cal = Calendar.getInstance(); //객체 생성
		
		cal.set(year,month-1,1); //
		
		int start = cal.get(Calendar.DAY_OF_WEEK);  //일 수 
		
		for(int i=1; i<start ; i++) {  //ㅇ앞에 공백
			System.out.printf("\t");
		}
		
		
		for(int i=1 ; i<=cal.getActualMaximum(Calendar.DATE); i++ ) { //1월-12월
			System.out.printf("%d\t",i);  //일 수가 출력됨
			
			if(start%7==0) {  //7일이 되면 다음줄로
				System.out.println();
			}
			start++; //start는 일수 
		}
		
	}

}
