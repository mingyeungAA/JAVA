package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {
	public void prn(int year,int month) {
	      System.out.printf("\t\t %d년  %d월\n", year, month);
	      System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
	      
	      //calendar 클래스가 추상클래스라서 new 못씀
	      Calendar cal = Calendar.getInstance(); //객체생성 . 현재 날짜 받음
	      
	      
	      cal.set(year, month-1, 1 ); // year, month-1, 1 (MONHT 0~11) //12월을 출력하고 싶으면 month의 11를 출력해야된다.  //1일의 요일을 기준으로 시작

	      int start = cal.get(Calendar.DAY_OF_WEEK); //DAY_OF_WEEK 요일. 해당 월의 시작 요일 (1:일요일 - 7:토요일)

	      for (int i = 1; i < start; i++) {  //일요일이 1이니까, 1부터 시작
	         System.out.printf("\t"); //앞에있는 공백 설정
	      }
	      
	      for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) { //getActualMaximum 그 달의 최대일수. 해당 달을 가져오고 그 달의 마지막 날짜
	         System.out.printf("%d\t", i);
	         if (start % 7 == 0) { //
	            System.out.println();
	         }
	         start++;
	      }
	   }

}
