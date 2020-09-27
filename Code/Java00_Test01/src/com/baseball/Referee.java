package com.baseball;
public class Referee {
	
	/*
	 * int[] output;
	 * output[0] = strike;
	 * output[1] = ball;
	 * output[2] = out;
	 */
	
	public int[] isStrike(int[] goal, int[] input) {
		int[] output = new int[3];
		
		int strikeCount = 0;
		int ballCount = 0;
		
		for(int i = 0; i < goal.length; i ++) {
			for(int j = 0; j <input.length; j++) {
				if(goal[i] == input[j]) {  //같은 수
					if(i == j) {  //같은 자리 (strike)
						strikeCount++;
					} else ballCount++; //다른자리 (Ball)
				}
			}
			if(strikeCount + ballCount == 0) {  //3개 다 다르면 (out)
				output[2] = 1;
			} else {
				output[0] = strikeCount;
				output[1] = ballCount;
			}
		}
		
		return output;
	}

}
