package com.test01;

class MyThread03 extends Thread{
	
	public MyThread03(String name) {
		super(name);  //부모한테 name전달
	}
	
	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++) {
			System.out.println(this.getName()+" : "+i);
		}
		System.out.println("---"+this.getName()+"---");
	}
}


public class MTest03 {
	public static void main(String[] args) {
		
		MyThread03 dog = new MyThread03("멍머이");
		MyThread03 cat = new MyThread03("야옹이");
		
		//thread scheduling : 우선순위(Priority), 순환할당(round-robin) 
		dog.setPriority(10);  //dog에 먼저 우선순위를 줬다고 먼저 끝내라 먼저 시작해라 라는 의미는 아님 , 더많이 넣겠다라는 의미
		cat.setPriority(Thread.MIN_PRIORITY);
		dog.start();
		cat.start();
		
		System.out.println(dog.getName() + " => "+dog.getPriority());
		System.out.println(cat.getName() + " => "+cat.getPriority());
		
	}

}
