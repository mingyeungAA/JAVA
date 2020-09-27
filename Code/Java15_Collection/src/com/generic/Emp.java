package com.generic;

//t : type
public class Emp<T> {
	
	private T empno; //위에서 선언을 해줘서 T 타입을 쓸 수 잇음 >> 설계도에서는 어떤 타입이 들어올지 몰라서 일단 T로 해둔것임
	private String ename;
	
	public Emp() {
		
	}
	public Emp(T empno, String ename) {
		this.empno=empno;
		this.ename=ename;
	}
	public T getEmpno() {
		return empno;
	}
	public void setEmpno(T empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	
}
