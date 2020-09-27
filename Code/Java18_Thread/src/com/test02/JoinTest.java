package com.test02;

class MyCalc extends Thread{
	private int start;
	private int end;
	private int sum;
	
	public MyCalc (int start, int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() {
		sum=0;
		
		for(int i=start ; i<=end ; i++) {
			sum+=i;
			System.out.println("Currend Thread: "+currentThread().getName());
		}
	}
	public int getSum() {
		return sum;
	}
	
}

public class JoinTest {
	public static void main(String[] args) {
		
		MyCalc thread01 = new MyCalc(1,5);
		MyCalc thread02 = new MyCalc(6,10);
		
		thread01.start();
		thread02.start();
		
		try {
			thread01.join();
			thread02.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread01 sum : "+thread01.getSum());
		System.out.println("Thread02 sum : "+thread02.getSum());
		System.out.println("Total sum : "+(thread01.getSum()+thread02.getSum()));
			
		
	}

}
