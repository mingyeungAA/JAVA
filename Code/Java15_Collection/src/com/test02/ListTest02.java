package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		for(int i = 0 ;i<=10; i++) {
			list.add(i+"");
		}
		//System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list,new MySortTest());
		System.out.println(list);
		
	}
}

class MySortTest implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) { //외부(파라미터2개)
		// TODO Auto-generated method stub
		
		int tmp01 = Integer.parseInt(o1);  //문자열을 기본타입(int)로 변환
		int tmp02 = Integer.parseInt(o2);
		
		if(tmp01 > tmp02) {
			return 1; //왼쪽이 크면 양수를 리턴하자.
		}
		else if(tmp01 < tmp02) {
			return -1;  //오른쪽이 크면 음수를 리턴하자.
		}
		
		return 0; //둘이 같으면 0을 리턴하자.
	}
	
}
