package com.test01;

import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		
		Vector<String> v= new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("김선달");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		prn(v);
		trans(v);
	}
	
	public static void trans(Vector<String>vector) {
		//1."홍길동"의 인덱스를 찾고,
		//  해당 인덱스에 있는 값을  "홍길순"으로 바꾸자.
		vector.indexOf("홍길동");

		vector.set(vector.indexOf("홍길동"), "홍길순");
		
		for (String element : vector) { //뒤에 값을 바꾸면 큰일남!(vector)
			System.out.print(element+ " ");
		}
		System.out.println();
				
		
		//2."~~신"으로 끝나는 객체를 찾고,
		//  만일 있다면, "신"을 "자"로 바꾸자
		System.out.println("-------");
		for(int i=0 ; i<vector.size() ; i++) {

			//System.out.println(vector.get(i));
			
			if(vector.get(i).endsWith("신")) {
				vector.set(vector.indexOf(vector.get(i)),vector.get(i).replace("신", "자"));  //String이라서 immutable해서 값을 다시 넣어줘야 된다.	
			}
		}
		System.out.println(vector);
		
		//3.마지막 글자가 "호"인 이름을 찾고,
		//  만일 있다면, 삭제하자.
		for(String element : vector) {
			if(element.endsWith("호")) {
				//vector.remove(element);  //뒤의 덩어리를 바꿔주는 거라서 오류뜸
			}
		}
		for(int i=0 ; i<vector.size() ; i++) {
			if(vector.get(i).endsWith("호")){
				vector.remove(i);
			}
		}
		System.out.println(vector);
		
	}
	
	public static void prn(Vector<String>vector) {
		//향상된 for문, forEach문   >> for( 데이터들의값을 받을 수 잇는 변수  : 덩어리(배열.컬랙션..) )
		for (String element : vector) { //뒤에 값을 바꾸면 큰일남!(vector)
			System.out.print(element+ " ");
		}
		System.out.println();
	}
	
	/*
	 * foreach문
	 * 
	 *for(type var : iterate){
	 *  body-of-loop
	 *  } 
	 * 
	 */

}
