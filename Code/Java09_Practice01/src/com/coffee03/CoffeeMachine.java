package com.coffee03;

import java.util.Scanner;

public class CoffeeMachine {
	
	public void inputMoney() {
		Scanner sc=new Scanner(System.in);
		System.out.println("돈을 넣어주세요 ");
		int money = sc.nextInt();
		System.out.println("어떤 커피를 만들까요? (1. 일반커피 300원 , 2. 고급커피 500원)");
		int menu = sc.nextInt();
		System.out.println("몇잔 만들까요?");
		int coffee = sc.nextInt();
		
		if((money >= coffee*300) || (money >= coffee*500)) {
			make(money,coffee,menu);
		}
		else {
			System.out.println("돈이 부족합니다.");
		}
		
	}
	private void make(int money, int coffee,int menu) { //파라미터 3개
		//잔돈 = 받은돈-잔*300
		
		int change=0;
		if(menu==1) {
			change = money-(coffee*300);
		}
		else {
			change = money-(coffee*500);
		}
		
		
		System.out.println("커피 "+coffee+"잔 나왔습니다. 잔돈은 "+change+"원 입니다.");
	}

}
