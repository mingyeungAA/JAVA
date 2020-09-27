package com.test02;

public class Season {
	
	public static String prn(int month) {
		String res = "";
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			res = "겨울"; break;
			//return "겨울";
		case 3:
		case 4:
		case 5:
			res = "봄";break;
		case 6:
		case 7:
		case 8:
			res = "여름";break;
		case 9:
		case 10:
		case 11:
			res = "가을";break;
		/*default:
			return "잘못된 월";*/ //return을 쓸경우, 모든 경우의 return이 필요하므로, 모든 경우를 다 썼는지 확인!
		}
		return res;
		
	}

}
