package com.test04;

public class Car { //object를 상속받고 잇는ㄷ
	private String color;
	private int speed;
	
	public Car() {
		
	}
	
	//파라미터 하나,색깔 하나 받아서 초기화
	public Car(String color) {
		
		this.color = color;//초기화
	}
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	//getter & setter 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed; //위 field에 있는 speed변수에 speed값을 넣어준다.
	}
	
	
	public void accelPedal() {
		System.out.println("속도가 올라갑니다.");
		speed +=10;
	}
	
	public void breakPedal() {
		speed -=10;
		if(speed>0) {
			System.out.println("속도가 줄어듭니다.");
		}
		else {
			System.out.println("멈췄습니다.");
			speed=0;
		}
	}
	
	
	@Override //재정의!!
	public String toString() { //주소값을 리턴해주는
		return "현재 속도는 "+speed+"입니다.";
		//하지만 주소값 나오게 하기 싫음 >> 나는 이렇게 출력하고 싶음
	}
	
	
	
}
