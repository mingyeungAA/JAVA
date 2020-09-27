package com.test05;

public class SamsongTV implements TV {

	private int volume;
	
	public SamsongTV() {
		System.out.println("SamsongTV 구매 완료");
	}
	
	@Override
	public int volumeUP() {
		// TODO Auto-generated method stub
		return volume +=3;
		
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		if(volume>0) {
			return volume -=3;
		}
		else {
			return volume=0;
		}
		
	}

}
