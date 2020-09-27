package com.test01;

import java.util.Vector;  //vector는 list라는 요소를 상속받아서 사용


public class VectorTest01 {
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>(10,5); //배열 5칸씩 늘어나세요
		System.out.println(v.size()+" : "+v.capacity());
		
		for(int i = 0 ; i<9 ; i++) {
			v.add(i); //자동 박싱 >> v.add(Integer.valueOf(i);
		}
		System.out.println(v.size()+ " : "+v.capacity());
		System.out.println(v); //요소들의 값이 출력됨 (내부적으로 toString이 들어가 잇구나)
		
		v.add(9);
		System.out.println(v.size()+ " : "+v.capacity());
		System.out.println(v);
		
		v.add(10);
		System.out.println(v.size()+ " : "+v.capacity());
		System.out.println(v);
		
	}

}