package com.baseball;
import java.util.Scanner;

public class User {
	
	private int[] inputArr;
	private int size;
	
	public User() {
		size = 3;
		inputArr = new int[size];
	}
	
	public User(int size) {
		this.size = size;
		inputArr = new int[size];
	}
	
	public int[] input() {
		
		System.out.println(size + " 자리 수의 숫자를 입력해 주세요.");
		System.out.println("(각 숫자는 공백으로 구분, 1 ~ 9 사이의 숫자)");
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		for(int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(input[i]); //스트링 배열을 int로 바꿔서 배열에 넣어줄거야
		}
		
		return inputArr;
	}

}
