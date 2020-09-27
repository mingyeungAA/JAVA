package com.test04;

public class Student {
	
	//1. 정수형 파라미터 3개를 받아서 정수를 리턴하는 getSum이라는 메서드를 만들자.
	//각 파라티머터의 이름은 kor, eng, math 이다.
	//어디서나 접근, 참조할 수 있고, static 영역에 저장되는 메서드이다.
	
	//2. 정수형 파라미터 1개를 받아서 실수값을 리턴하는 getAvg라는 메서드를 만들자.
	//파라미터의 이름은 sum이고, 해당 클라스내에서만 사용할 수 있고, static 영역에 저장되는 메서드이다.
	public static void main(String[] args) {
		int kor, eng, math;  //선언
		kor = eng = math = 0;  //초기화
		
		kor = 100;
		eng = 40;
		math = 79;
		
		int sum = 0;
		double avg = 0;
		//위의 문제에서 선언한 메서드를 사용하여
		//총점과 평균을 console에 출력하라.
		
		sum = Student.getSum(kor, eng, math);
		System.out.println("총점 : "+sum);
		
		avg = Student.getAvg(sum); //왜 안됐찌말려따
		System.out.println("평균: "+avg);
		/*double myavg=Student.getAvg(sum);
		System.out.println(myavg);*/
		
		System.out.println("평균은  "+getAvg(getSum(kor,eng,math)));
	}
	
	public static int getSum(int kor, int eng, int math) {
		int sum = kor+eng+math;
		return sum;
	}
	
	private static double getAvg(int sum) {
		double avg = sum/3;
		return avg;
	}
	
	
}