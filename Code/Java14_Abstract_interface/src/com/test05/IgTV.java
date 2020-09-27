package com.test05;

public class IgTV implements TV {

	private int volume;
	
	public IgTV() {
		System.out.println("IgTV 구매  완료");
	} 
	
	@Override
	public int volumeUP() {
		// TODO Auto-generated method stub
		return volume += 1 ;
		
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		if(volume >0) {
			return volume -= 1;
		}
		else {
			return volume=0;
		}
		
		//return (--volume >=0)?volume:0;
		
		/*
		 * volume--;
		 * if(volume <0 ){
		 *	 volume = 0;
		 * }
		 * return volume;
		 */
		
	}

}
