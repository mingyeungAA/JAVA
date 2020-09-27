package com.compare;

import java.util.Arrays;

public class MTest {
	public static void main(String[] args) {
		//Score 배열에 score 객체 3개 저장하자.
		
		Score score01 = new Score("배민경",90,40,57);
		Score score02 = new Score();
		score02.setName("이순신");
		score02.setKor(33);
		score02.setEng(56);
		score02.setMath(68);
		
		//System.out.println(score02);
		//System.out.println(score01);
		
		Score[] school = new Score[4];
		school[0]=score01;
		school[1]=score02;
		school[2] = new Score("김선달",40,100,60);
		school[3] = new Score("조세호",100,100,100);
		
		for(Score sc:school) {
			//System.out.println(sc);
		}
		Arrays.sort(school);
		
		for(Score sc:school) {
			System.out.println(sc);
		}
	}

}
