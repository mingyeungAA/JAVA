package com.singleton;

//singleton 패턴 >> new 연산자 못사용  >> 객체 하나만 사용할때 사용
//메모리에(heap)에 객체를 한번만 생성

public class Singleton {
	
	//2.객체를 확인할 주소(reference) 선언
	private static Singleton singleton; 
	
	
	//1. 외부에서 객체를 생성할 수 없도록, 생성자를 private으로 만든다. >> new연산자 사용할 수 없다.
	private Singleton()	{
		System.out.println("Singleton instance 생성");
	}

	//3. 객체생성 메소드 >> 거의 getInstance명으로 사용됨  >> 해당 주소값이 있는지 없는지 확인 
	public static Singleton getInstance() {
		
		if(singleton==null) {
			System.out.println("new!");
			singleton = new Singleton();  //이미 주소값이 들어가잇으면 생성 안함
		}
		
		return singleton;
	}
}
