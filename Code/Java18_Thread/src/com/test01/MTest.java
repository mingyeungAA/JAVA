package com.test01;

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0 ; i<10 ; i++) {
			System.out.println("i: "+i);
		}
	}

}

public class MTest {
	public static void main(String[] args) {
		// main thread가 가장 먼저 ,,(우선순위가 높다)
		System.out.println("program 시작-----------");
		
		/*
		//Thread아님!!
		MyThread thread01 = new MyThread();
		MyThread thread02 = new MyThread();
		thread01.run();
		thread02.run();
		*/
		
		//멀티thread  (한번에 여러개가 같이 돌고 잇음)
		//main, thread01, thread02가 번갈아가면서 실행됨 (그래도 main이 우선순위가 높음) >> 세개가 같이 돌고 잇는데, main이 순서가 높아서 시작이 실행되고 thread01,thread02가 실행되는 중에 끝이 출력됨...
		Thread thread01 = new Thread(new MyThread());
		Thread thread02 = new Thread(new MyThread());
		thread01.start();
		thread02.start();
		
		System.out.println("programd 끝------------");
	}

}
