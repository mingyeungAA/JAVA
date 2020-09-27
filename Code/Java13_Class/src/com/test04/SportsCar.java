package com.test04;

public class SportsCar extends Car {

	/*
	 * 기본 생성자와 색깔 하나를 받아서 초기화하는 파라미터 한개짜리 생성자
	 * 
	 * accelPedal과 breakPedal 메소드를 오버라이드 할 건데,
	 * "속도가 더 빨리 올라갑니다."
	 * "속도가 더 빨리 줄어듭니다." 라고 출력
	 * 
	 *  +- 15로 설정
	 *  
	 *  toString 오버라이드 해서
	 *  "sportsCar의 현재 속도는 x입니다." 라고 출력하기
	 */
	
	private String color;
	
	
	public SportsCar() {
		
	}
	public void accelPedal() {
		setSpeed(getSpeed() + 15);
		System.out.println("속도가 더 빨리 올라갑니다.");
		//speed+=15;
	}
	public void breakPeda() {
		setSpeed(getSpeed()-15);
		if(getSpeed() > 0) {
			System.out.println("속도가 더 빨리 줄어듭니다. ");
		}
		else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
	}
}
