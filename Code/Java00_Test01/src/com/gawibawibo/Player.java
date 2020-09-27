package com.gawibawibo;

import java.util.Scanner;

public class Player extends GawiBawiBo {
	
	public void setSelect() {
		System.out.println("\ninput select\n0 : Gawi, 1 : Bawi, 2 : Bo");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		//super.setSelect(select); //번호롤 입력받은 가위바위보를 상위클래스의 field에 잇는 select에 값을 넣어주는
	}

}
