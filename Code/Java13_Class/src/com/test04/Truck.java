package com.test04;

public class Truck extends Car {

	/*
	 * 기본 생성자와 색깔 하나를 받아서 초기화하는 파라미터 한개짜리 생성자
	 * 
	 * accelPedal과 breakPedal 메소드를 오버라이드 할 건데,
	 * "속도가 더 천천히 올라갑니다."
	 * "속도가 더 천천히 줄어듭니다." 라고 출력
	 * 
	 *  +- 5로 설정
	 *  
	 *  toString 오버라이드 해서
	 *  "truckCar의 현재 속도는 x입니다." 라고 출력하기
	 */
	
	private String color;
	
	
	public Truck() {
	
	}
	
	public Truck(String color) {
		super(color); 
		//this.color=color; //field의 color에 color값을 넣는다. 
	}
	
	public void accelPedal() {
		setSpeed(getSpeed()+5);
		System.out.println("속도가 더 천천히 올라갑니다.");
		//speed += 5;
		//speed=speed+=5;
		//setter(getter+5);
	}
	
	public void breakPedal() {
		setSpeed(getSpeed()-5);
		//speed -=5;
		
		if(getSpeed() > 0) {
			System.out.println("속도가 더 천천히 줄어듭니다.");
		}
		else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
		
	}
	
	@Override
	public String toString() { //toString은 원래는 주소값을 리턴해준다.
		return "truck의 "+super.toString(); //toString을 오버라이드 함.
		//부모 Car의 toString을 또 다시 재정의함
		//>> "truck의 현재 속도는 speed입니다." 로 출력
	}
	
}
