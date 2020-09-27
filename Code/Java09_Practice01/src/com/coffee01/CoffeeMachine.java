package com.coffee01;
import java.util.Scanner;

public class CoffeeMachine {
	
	public void inputMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 넣어주세요 (1잔당 300원)\n");
		int money = sc.nextInt();
		
		if(money >= 300) {
			make(money); //메소드 호출
		}else {
			System.out.println("금액이 부족합니다.");
		}
	}
	
	private void make(int money) {
		int coffee = money/300;
		int change = money%300;
		System.out.printf("커피 %d 잔 나왔습니다. \n잔돈은 %d원 입니다.\n",coffee,change);
	}

}
