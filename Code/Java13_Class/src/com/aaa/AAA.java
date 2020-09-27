package com.aaa;

//class AAA (extends Object)  //extends는 상속 받았다는 의미
public class AAA {
	
	//field (전역변수) = 속성
	private int abc;                    //instance variable 인스턴스 변수(nonstatic이라서 객체를 생성해서 호출해야되기 때문에) (객체 하나하나에 적용되는)
	public static String def = "test";  //class variable 클래스 변수 (static은 해당 클래스 전체에 적용된다.)

	//기본생성자(파라미터가 없는)
	public AAA() { //생성자(클래스 명과 똑같이)
		//super();  //object
		System.out.println("AAA생성");
		
	}
	
	public AAA(int abc) {
		//super();
		System.out.println("AAA 생성(abc받아서 생성)");
		this.abc=abc; //field값의 instance값에 대입한다. (위의 파라미터 값이 아닌)
		//this는 클래스 안의 instance값을 가르킨다.
	}
	
	
	//method = 기능
	//getter & setter >> field에 접근할 수 있게 한다. 
	//>> 왜쓰는가? private을 안쓰고 public을 쓰면 되지 않는가/
	
	public int getAbc() { //getter
		
		return abc;
	}
	
	public void setAbc(int abc) { //field에 있는 abc값에 대입됨
		
		this.abc=abc;
	}
	
	public void prn() {
		System.out.println("AAA의 prn 메소드");
	}
	
	
}
