package com.test05;

public interface TV {
	
	int volumeUP(); //interface라서 추상메서드임(body없음) > 자식클래스에서 구현해야됨!
	int volumeDown();
	
	//igTV는 +-1,  samsongTV는 +-3
	//생성자 호출시, "XX TV 구매 완료" 출력

}
