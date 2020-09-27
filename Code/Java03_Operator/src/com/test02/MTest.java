package com.test02;

public class MTest {
	public static void main(String[] args) {
		/*
		 * 1. 다음 class diagram을 보고 class를 작성하자
		 * 
		 * 2. basketSetting 메서드에서는 String name과 int fruit라는 parameter가 있는데, name의 값을
		 * 전역변수 fruitName에 대입하고 fruit의 값을 fruitCount에 대입하자.
		 * 
		 * 
		 * 그 후, baseketPrn() 메서드를 호출하자.
		 * 
		 * 3. basketPrn에서는 "바구니 안의 과일 : xx" (과일이름)을 출력하고, basketSize의 값이 fruitCount 값보다
		 * 더 크거나 같으면 "xx의 갯수는 n개 입니다." (과일이름, 과일 숫자) 작으면 "바구니가 넘쳤습니다." 를 출력하자. 삼항연산자를
		 * 사용하라.
		 */

		FruitBasket.basketSize = 20; //basketSize는 static

		FruitBasket bananaBasket = new FruitBasket(); //nonstatic 호출방식(객체생성)
		bananaBasket.basketSetting("바나나", 10);
		System.out.println(bananaBasket.basketSize); //basketSize는 static >> nonstatic은 static에 접근 가능!! >> basketSize는 전체에 20이 적용된것
		System.out.println(bananaBasket.fruitCount); //fruitCount는 nonstaic이기 때문에, 바나나에는 10이 저장됨 >> nonstatic은 각각에 적용됨
		
		//FruitBasket.basketSize = 40;
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.basketSetting("사과", 22);
		System.out.println(appleBasket.basketSize);
		System.out.println(appleBasket.fruitCount); //fruitCount는 nonstaic이기 때문에, 사과에는 22이 저장됨
	}

}
