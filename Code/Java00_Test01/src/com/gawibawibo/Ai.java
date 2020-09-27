package com.gawibawibo;

public class Ai extends GawiBawiBo {
	
	public void setSelect() {		// 부모의 setSelect와 다름(오버라이딩이 아님) - 부모는 파라미터가 있고 Ai는 없기 떄문
		super.setSelect((int)(Math.random()*3));
	}

}
