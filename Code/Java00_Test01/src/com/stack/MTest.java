package com.stack;

public class MTest {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("test");
		stack.push(1);
		stack.push('a');
		stack.push('c');
		stack.push("◆");
		stack.push("ㄹ");
		System.out.println(stack);
		
		System.out.println("pop : " +stack.pop());
		System.out.println(stack);
		
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println(stack);
		System.out.println("pop : " +stack.pop());
		System.out.println(stack);
		System.out.println("pop : " +stack.pop());
		System.out.println("pop : " +stack.pop());
		System.out.println("pop : " +stack.pop());
		System.out.println("pop : " +stack.pop());
		System.out.println("pop : " +stack.pop());
		System.out.println(stack);
	}

}
