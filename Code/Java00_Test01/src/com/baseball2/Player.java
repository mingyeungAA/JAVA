package com.baseball2;

import java.util.Scanner;

public class Player extends Baseball {
	
	public void setSelect() {
		System.out.println("숫자를 입력하세요(1-9) : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<super.getSelect().length ; i++) {
			getSelect()[i]=sc.nextInt();
			if((getSelect()[i]<0)||(getSelect()[i]>9)){
				System.out.println("숫자를 다시 입력해주세요 (1-9)");
			}
		}
		
	}
}

	
