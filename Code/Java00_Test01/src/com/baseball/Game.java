package com.baseball;
import java.util.Arrays;
import java.util.Scanner;

public class Game extends Print {
	
	static int stage = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Referee referee = new Referee();
		int[] goal;
		int[] input;
		int cnt = 1;
		
		do {
			System.out.println(start);
			goal = new Ball().getGoal();
			System.out.println(Arrays.toString(goal)); //컴퓨터 랜덤 수 출력됨
			
			User user = new User();
			
			do {
				System.out.println(ingPre + (10 - stage + 1) + ingPost);
				input = user.input();
				int[] strike = referee.isStrike(goal, input);
				strikePrn(strike);
				
				if(strike[0] == 3) {
					System.out.println(win);
					break;
				}
				
				stage--;
			} while(stage > 0);
			
			if( stage == 0) {
				System.out.println(losePre + Arrays.toString(goal) + losePost);
			}
			System.out.println(end);
			String stop = sc.next();
			if(stop.toUpperCase().equals("N")) {
				break;
			}
			else if(stop.toUpperCase().equals("Y")) {
				stage=10;
			}
			else {
				break;
			}
			
		} while(true);
		
		System.out.println(bye);
	}

}
