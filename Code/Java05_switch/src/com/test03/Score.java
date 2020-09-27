package com.test03;

public class Score {

	public double getAvg(int kor, int eng, int math) {
		int sum = kor + eng + math;
		double avg = (double) sum / 3;

		return avg;
	}
	public String getGrade(double avg) {
		String grade = "";

		/*
		 * if((avg>=90)&&(avg<=100)){ System.out.print("A"); } else
		 * if((avg>=80)&&(avg<=89)) { System.out.print("B"); } else
		 * if((avg>=70)&&(avg<=79)) { System.out.print("C"); } else
		 * if((avg>=60)&&(avg<=69)) { System.out.print("D"); } else
		 * System.out.println("F");
		 */

		// switch는 정수형, 문자형, 문자열만 가능
		switch ((int) avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}

		return grade;

	}
}
