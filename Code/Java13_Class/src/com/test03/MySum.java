package com.test03;

public class MySum {
	//(override : 보모클래스에서 만들어진 메소드가 자식클래스에서 같아야 한다.)
	//overloading : 같은 이름으로 다른 기능을 한다.(파라미터가 다름 / 이름만 같음)
	
	public int sum(int i) {
		
		return i+i;
		
	}
	public int sum(int i, int j) {
		
		return i+j;
		
	}
	public double sum(double d, double f) {
		return d+f;
	}
	
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
}
