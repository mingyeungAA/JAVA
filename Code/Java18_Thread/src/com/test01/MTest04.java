package com.test01;

public class MTest04 {
	public static void main(String[] args) {
		
		MyThread03 cat = new MyThread03("야옹이");
		MyThread03 dog = new MyThread03("멍멍이");
		
		long startTime = System.currentTimeMillis();
		
		cat.start();
		try {
			//thread가 종료될때까지 다른 thread를 멈춤
			cat.join(); //>>이거 실행되고 실행시간 뜨고 멍멍이(dog.start()) 실행됨
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		dog.start();
		
		long endTime = System.currentTimeMillis();  //컴퓨터의 현재 시간을 millisecond로 
		
		System.out.println("실행시간 : "+(endTime - startTime));  //왜 맨처음에 안뜨는가 >> cat.join()때문에
		
		
	}

}
