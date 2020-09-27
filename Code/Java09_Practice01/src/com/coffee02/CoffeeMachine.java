package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {
	
	public void inputMoney() { //돈을 넣자
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 넣어주세요");
		int money = sc.nextInt();
		System.out.println("몇잔 만들까요? (1잔에 300원)");
		int coffee = sc.nextInt(); // coffee는 잔 수
		
		if(money >= coffee*300) { //money >= 잔수*300
				make(money,coffee); //메소드 호출
		}
		else {
			System.out.println("돈이 부족합니다.");
		}
	}
	private void make(int money, int coffee) {  //
		//money = 잔수 *300+잔돈;
		//잔돈 = money-(잔 수*300)
		int change = money-(coffee*300);
		System.out.println("커피 "+coffee+"잔 나왔습니다.");
		System.out.println("잔돈은 "+change+"원 입니다.");
				
	}

}
