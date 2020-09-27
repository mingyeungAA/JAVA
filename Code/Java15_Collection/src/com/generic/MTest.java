package com.generic;

public class MTest {

	public static void main(String[] args) {
		Emp<String> aCompany = new Emp<String>();
		
		aCompany.setEmpno("A1111");
		aCompany.setEname("홍길동");
		
		Emp<Integer> bCompany = new Emp<Integer>(7890, "이순신");
		
		Emp cCompany = new Emp(123.46, "김선달"); //타입을 안정해주니, empno에 Object(모든값을 다 담을 수 있는)가 들어감
		
		System.out.println(aCompany.getEmpno());
		System.out.println(bCompany.getEmpno());
		System.out.println(cCompany.getEmpno());
		
	}
}
