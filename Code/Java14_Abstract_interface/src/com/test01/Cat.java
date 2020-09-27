package com.test01;

public class Cat extends Animal {//상속받는 클래스에서 반드시 구현! >> 이렇게 안하려면 public class abstract cat extends animal 이렇게 해야함

	@Override  //재정의 , 부모것을 가지고 와서 다시 만드는 ,확장시키는
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

}
