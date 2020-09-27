package com.test02;

public class FruitBasket {
	// field(전역변수)
	static int basketSize;  //static 붙은 = class 변수
	int fruitCount;         //static 안붙은 = instance 변수
	String fruitName;

	public FruitBasket() {
	}; // 생성자

	public void basketSetting(String name, int fruit) {
		fruitName = name;
		fruitCount = fruit;
		basketPrn();
	}

	private void basketPrn() {
		System.out.println("바구니 안의 과일 : "+fruitName);
		System.out.println((basketSize>=fruitCount)?(fruitName+"의 갯수는 "+fruitCount+"개 입니다."):("바구니가 넘쳤습니다."));
	}

}
