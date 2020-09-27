package com.test01;

class MyThread02 extends Thread {
	
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println("i: "+i);
		}
	}
}

public class MTest02 {

	public static void main(String[] args) {
		System.out.println("main thread 시작");
		
		MyThread02 thread02 = new MyThread02();
		MyThread02 thread01 = new MyThread02();
		thread02.start(); //그냥 바로 Thread상속 받아서 바로 start() 사용할 수 잇음
		thread01.start();
		
		
		System.out.println("main thread 끝");
	}
}
