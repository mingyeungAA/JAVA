package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	//collection을 상속 받고 있지 않음  값을 효과적으로 관리하기 위한 객체
	//(key:value)
	//key를 통해서 값에 접근할 수 있다.
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(111, "one");
		map.put(112,"two");
		map.put(113,"three");
		map.put(114, "four");
		map.put(115, "five");
		map.put(111, "ONE");
		map.put(116,"ONE");
		//System.out.println(map); //순서 없음, value는 중복 가능(key는 중복 불가능)
		
		//System.out.println(map.get(111));
		
		prn(map);
		
	}
	
	public static void prn(Map<Integer, String>map) {
		Collection<String> values = map.values(); //map안의 value값을 values에 저장
		System.out.println(values); //값들 출력
		Set<Integer> keys = map.keySet(); //map안의 키값들을 keys에 저장
		System.out.println(keys); //키값들만 출력됨
		
		
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		//Map.entry >> key와 value를 따로 잘라서 묶음으로 가지고 있음
		for(Entry<Integer,String> e : entry) {
			System.out.printf("%d : %s\n",e.getKey(),e.getValue());
		}
		
		
		//iterator를 사용하여, 값이 four인 키를 출력하자
		
		//Iterator ir = map.iterator(); //Map은 collection객체가 아니라서 iterator가 없음
		Iterator<Entry<Integer,String>> ir = entry.iterator();
		while(ir.hasNext()) {
			Entry<Integer,String> element = ir.next(); //ir.next()는 바로 다음 값을 가르키는데, 이것을 element에 담아 두면 ㄱ냥 그 값을 가르키게 되서 담아서 사용한다.ㄴ
			if(element.getValue().equals("four")) {
				System.out.println(element.getKey());
			}
		}
		
		
	}

}
