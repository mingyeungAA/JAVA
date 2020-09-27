package com.gawibawibo;

public class GawiBawiBo {
	
	private int select;
	private String[] gawibawibo = {"Gawi", "Bawi", "Bo"};
	
	public int getSelect() {
		return select;
	}
	
	public void setSelect(int select) {
		this.select = select;
	}
	
	public String getHand() {
		return gawibawibo[select];  //field에 있는 select에 저장된 값을 가져오는
	}
	
}
