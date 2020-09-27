package com.stack;

import java.util.Arrays;

class Stack{
	private int top = -1;
	private int size;
	private Object[] arr;
	
	public Stack() {
		this.size = 5;
		arr = new Object[size];
	}
	
	public Stack(int size) {
		this.size = size;
		arr = new Object[size];
	}
	
	public void push(Object input) {
		top++;
		if(top >= size) {
			System.out.println("overflow");
			top--;
		}else {
			arr[top] = input;
		}
	}
	
	public Object pop() {
		if(top < 0) {
			return "underflow";
		}else {
			Object rtn = arr[top];
			arr[top] = null;
			top--;
			
			return rtn;
		}
	}
	public String toString() {
		return Arrays.toString(arr);
	}
	
}
public class MMStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("test");
		stack.push(1);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}
}
