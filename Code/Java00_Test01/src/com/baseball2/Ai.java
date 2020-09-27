package com.baseball2;

public class Ai extends Baseball {
	public void setSelect() {
		for(int i=0 ; i<super.getSelect().length ; i++) {
			int ran = (int)((Math.random()*9)+1);
			System.out.print(super.getSelect()[i]=ran);
		}
		
	}
	
	//중복제거
	public void nono() {
		for(int i=0 ; i<super.getSelect().length ; i++) {
			
		}
	}

}
