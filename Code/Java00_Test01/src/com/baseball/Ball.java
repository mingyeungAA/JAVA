package com.baseball;

public class Ball {
private int[] goal;
	
	public Ball() {
		goal = new int [3];
		makeGoal();
	}
	
	public Ball(int size) {
		goal = new int[size];
		makeGoal();
	}
	
	public int[] getGoal() {
		return goal;
	}
	
	private void makeGoal() {
		int cnt = 0;
		
		while(cnt < goal.length) {  //난수 중복 안되게
			int ran = (int)(Math.random()*9) + 1;
			if(!isSame(goal, ran)) {
				goal[cnt] = ran;
				cnt++;
			}
		}
	}
	
	private boolean isSame(int[] arr, int input) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				return true;
			}
		} return false;
	}
	
}
