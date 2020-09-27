package com.point;

import java.util.Scanner;
/*
public class PointLength {
	//원점(0,0)부터 입력한 점(x,y)까지의
	//거리를 구하자.
	//hint : Math class (java.lang.Math)
	 
	public static double plength(int x, int y) {
		
		double length = (double)Math.sqrt(x*x+y*y);//루트?
		System.out.println("거리는 : "+length);
		
		return length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x=sc.nextInt();
		System.out.print("y: ");
		int y=sc.nextInt();
		
		plength(x,y);
	}

}
*/
public class PointLength {
	//원점(0,0)부터 입력한 점(x,y)까지의
	//거리를 구하자.
	//hint : Math class (java.lang.Math)
	public static double plength(int x, int y) {
		
		double len = 0;
		//len = root( x*x+y*y );
		//len = root(Math.pow(x,2)+Math.pow(y,2));
		//len = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		
		len = Math.hypot(x, y);
		return len;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x=sc.nextInt();
		System.out.print("y: ");
		int y=sc.nextInt();
		
		double res = plength(x,y);
		System.out.printf("원점부터 (%d,%d) 까지의 거리: %f",x,y,res);
		
		sc.close();
	}

} 
