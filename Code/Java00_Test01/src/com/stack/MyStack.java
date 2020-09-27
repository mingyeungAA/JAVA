package com.stack;

import java.util.Arrays;

public class MyStack {
	
	private int top = -1;
	private int size;
	private Object[] arr; //정수뿐만 아니라 모든 것을 받아오는 배열 선언.
	
	public MyStack() {
		this.size = 5;  //this.size는 field에 있는 size를 가르킴.
		arr = new Object[size];  
	}
	
	public MyStack(int size) {
		this.size = size;  //field의 size = 매개변수 size
		arr = new Object[size];
	}
	
	public void push(Object input) {  //Object타입인 input변수
		top++;  // -1(0)
		if(top >= size) {
			System.out.println("Overflow");
			top--;  //0(-1)
		} else arr[top] = input;  //arr[0]=input
	}
	
	public Object pop() { //꺼내는
		if(top < 0) {
			return "undereflow";
		} else {
			Object rtn = arr[top];
			arr[top] = null;
			top--;
					
			return rtn;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
}















