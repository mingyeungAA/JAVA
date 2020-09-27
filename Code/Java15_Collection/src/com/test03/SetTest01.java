package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("3");
		set.add("4");
		set.add("6");
		set.add("5");
		
		System.out.println(set);  //정렬 된 것이 아님(set은 순서 없음, 중복 안된다.) >> 알아서 넣은것임
		
		//findElement(set,"4");
		removeElement(set,"4");
		System.out.println(set);
	}
	
	public static void findElement(Set<String> set, String find) {  //set은 순서가 없기 때문에 index 활용을 못함(for int i=0 이것을 사용 못함)
		for(String element : set) {
			if(element.equals(find)) {
				System.out.println(find+" 찾았다.");
			}
		}
	}
	
	public static void removeElement(Set<String>set, String remove) {
		for(String element : set) {
			if(element.equals(remove)) {
				set.remove(element);
				break;
				
			}
		}
	}

}
