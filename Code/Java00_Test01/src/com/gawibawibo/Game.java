package com.gawibawibo;

import java.util.Scanner;

public class Game {
	
	public static String isWin(int ai, int player) {
		/*  가     바       보
		 	0	1	2  (나)
		가 0	무	승	패
		바 1	패	무	승
		보 2	승	패	무
		 (ai)
		 
		 */
		
		String[][] winDrawLose = {
				{"draw","win","lose"},
				{"lose","draw","win"},
				{"win","lose","draw"}
		};
		
		return winDrawLose[ai][player];
	}	
	
	public static void main(String[] args) {
		Ai ai = new Ai();
		Player player = new Player();
		
		System.out.println("[GawiBawiBo Game]");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			ai.setSelect(); //컴퓨터가 랜덤으로 냈음
			player.setSelect(); //내가 냈음
			
			//뭐냈는지 보여주는
			System.out.printf("Ai : %s VS Player : %s\n", ai.getHand(), player.getHand());
			//결과출력
			System.out.println(isWin(ai.getSelect(), player.getSelect()));
			
			System.out.println("more? 1. yes 2. no");
			int more = sc.nextInt();
			System.out.println();
			if(more == 2) {
				System.out.println("End");
				break;
			}
		}
	}

}
