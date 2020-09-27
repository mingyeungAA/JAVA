package com.baseball2;

public class Game {
	
	public static String isWin(int[] ai, int[] player) {
		String res = "";
		int cnt = 0;

		for (int i = 0; i < 3; i++) {

			if (ai[i] == player[i]) {
				res = "Strike";
				System.out.print(res);
			}

			for (int j = 0; j < 3; j++) {
				if ((ai[i] == player[j]) && (i != j)) {
					res = "ball";
					System.out.print(res);
				}

			}

			for (int k = 0; k < 3; k++) {
				if (ai[i] != player[k]) {
					cnt++;
					if(cnt==9) {
						res = "out";
						System.out.println(res);
						break;
					}
				}
			}
		}

		return "";
	}

	public static void main(String[] args) {

		Ai ai = new Ai();
		Player player = new Player();

		System.out.println("게임 시작!");

		ai.setSelect(); // ai의 랜덤 숫자 출력
		System.out.println();
		player.setSelect(); // 내가 숫자 입력

		// for (int i = 0; i < 10; i++) {
		System.out.println(isWin(ai.getSelect(), player.getSelect()));

		// }

	}

}
