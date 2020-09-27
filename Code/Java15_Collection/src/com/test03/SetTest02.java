package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest02 {
	public static void main(String[] args) {
		Score s01 = new Score("홍길동",90,80,88);
		Score s02 = new Score("이순신",100,66,85);
		Score s03 = new Score("김선달",68,77,100);
		
		Set<Score> school = new HashSet<Score>();
		school.add(s01);
		school.add(s02);
		school.add(s03);
		
		prn(school);
		//trans(school);
		
	}
	
	public static void trans(Set<Score> set) {
		// set 객체에서 이름이 홍길동인 Score객체를 찾아서
		// 국어점수를 0점으로 변경 후 전체 출력하자.
		// 단, iterator를 사용하자
		
		Iterator<Score> ir = set.iterator();
		while(ir.hasNext()) {
			Score tmp = ir.next();
			if(tmp.getName().equals("홍길동")){
				tmp.setKor(0);
			}
		}
		for(Score sc:set) {
			System.out.println(sc);
		}
		
	}
	
	public static void prn(Set<Score> set) {
		//방법 1.
		for(Score sc : set) {
			System.out.println(sc.getName());
		}
		System.out.println("----------------------------");
		
		//방법 2.
		Object[] arr = set.toArray();
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(((Score)arr[i]).getName());//object가 더 큰 타입이니까 형변환 필요
		}
		System.out.println("-----------------------------");
		
		
		//방법 3. : collection내부의 값을 순회하는 표준화된 방법
		Iterator<Score> iterator = set.iterator(); //
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
	}

}
