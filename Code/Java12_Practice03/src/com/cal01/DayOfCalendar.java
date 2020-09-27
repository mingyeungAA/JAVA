package com.cal01;

public class DayOfCalendar {
	// 윤년 계산 (2월 29일 까지 있는 해)
	   private static boolean isLeapYear(int year) {
	      if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	         return true;
	      }
	      return false;
	   }

	   // 일수 계산
	   private static int dates(int year, int month) {
	      int tmp = 0;

	      if (isLeapYear(year)) {
	         switch (month) {
	         case 1:
	         case 3:
	         case 5:
	         case 7:
	         case 8:
	         case 10:
	         case 12:
	            tmp = 31;
	            break;
	         case 4:
	         case 6:
	         case 9:
	         case 11:
	            tmp = 30;
	            break;
	         case 2:
	            tmp = 29;
	            break;
	         }
	      } else {
	         if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	            tmp = 31;
	         } else if (month == 4 || month == 6 || month == 9 || month == 11) {

	            tmp = 30;
	         } else if (month == 2) {
	            tmp = 28;
	         }
	      }

	      return tmp;
	   }

	   // 요일 계산
	   private static int whatDay(int year, int month) {
	      int dayOfweek = 0; //시작일 지정

	      // 2020 4 입력했다고 가정
	      
	      int sum = 0;  //시작년도 부터 해당년도까지 달의 마지막 날을 모두 더해줌
	      
	      // 1년 1월 1일 부터 2019년 12월 31일 일수를 다더하고나서
	      for (int i = 1; i < year; i++) {
	         for (int j = 1; j < 13; j++) {
	            sum += dates(i, j);
	         }
	      }
	      
	      // 2020년 1월 1일 ~ 2020년 3월 31일까지 더해주고나서 1을 더해주면 2020년 4월 1일
	      for (int i = 1; i < month; i++) {
	         sum += dates(year, i);  //해당 년도의 달의 마지막 날을 모두 더해줌
	      }
	      
	      // 마지막 1일 더하기
	      sum++;  //원하는 달의 바로 전월의 마지막 날까지 저장되어 있음. sum값을 7로 나눌경우 전월의 마지막 날짜의 요일을 알 수 있음.

	      dayOfweek = sum % 7; // year년 month월 1일의 요일 (0:일요일 1:월요일 ...)  //시작일 지정을 위해 sum값을 7로 나눔(요일 지정하려고)

	      return dayOfweek;  //시작일 반환 (0-6 사이의 값 반환)
	   }

	   // 출력
	   public static void prn(int year, int month) {
	      // 윗부분
	      System.out.printf("\t\t %d년  %d월\n", year, month);
	      System.out.printf("  일\t  월\t  화\t  수\t  목\t  금\t  토\n");

	      // 시작 요일
	      int start = whatDay(year,month);  //시작일(day of week) 받아와서 입력

	      // 마지막 날짜
	      int last = dates(year,month);  //마지막 날짜(tmp) 받아와서 입력

	      // 해당 요일만큼 빈공간
	      for(int i = 0; i < start; i++) {  //시작일 전까지 공백 출력 >> 0:일요일...
	         System.out.print("\t");                      
	      }

	      // 출력
	      for(int i = 1; i <= last; i++) {  //마지막 날까지 1부터 출력해줌.
	         System.out.printf("%2d\t" , i);
	         start++;  //요일 증가
	         if(start%7==0) {
	            System.out.println();
	         }
	         
	      }
	      if(start%7!=0) {
	         System.out.println();
	      }
	   }

}
