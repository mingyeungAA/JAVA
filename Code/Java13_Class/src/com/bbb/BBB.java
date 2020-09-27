
package com.bbb;

import com.aaa.AAA;  //package가 다르면, import하면 된다

//BBB클래스는 AAA클래스를 상속받음
public class BBB extends AAA {  //AA를 상속받은 bbb클래스
	
	private int b;
	
	public BBB() {
		//super(); //기본으로 상위클래스의 기본생성자가 출력된다(생략이 되어있어도)
		System.out.println("BBB 생성");
	}
	public BBB(int b){
		//super();  //생략하면 그냥기본으로 상위클래스의 기본생성자가 출력됨(생략안해도됨)
		this.b=b;
		System.out.println("BBB 생성 (b 받아서 생성)");
	}
	public BBB(int abc, int b) {
		super(abc);//AAA클래스의 파라미터하나인 생성자 호출   > 파라미터를 ㅆ지 않으면 기본생성자가 호출됨
		this.b=b;
		System.out.println("BBB생성 (abc,b 받아서 생성)");
	}
	
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		int sum=super.getAbc() + this.getB();
		//getAbc()라고 써도 오류 없음. 
		
		return sum;
	}
	public void prn() { //오버라이드(재정의)
		System.out.println("BBB의 prn!!!!!!");
	}
}
