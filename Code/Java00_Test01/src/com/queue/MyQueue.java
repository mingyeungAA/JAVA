package com.queue;

import java.util.Arrays;

class Queue{  //가장 먼저들어간 데이터가 가장 먼저 나오는 FIFO
	
	private int size;
	private Object[] arr;
	private int front = -1;  //삭제된 데이터의 위치를 가리키는
	private int rear = -1;  //삽입된 데이터의 위치를 가리키는
	
	
	public Queue() {
		
	}
	
	public Queue(int size) {
		this.size = size;
		arr = new Object[size];
	}
	
	public void insert(Object input) {  //값넣는
		rear++;  //-1(0)
		if(rear >= size) {
			System.out.println("overflow");
			rear--;
		}else {
			arr[rear]=input;
			
		}
		
	}
	public Object deQueue() {  //값빼는
		rear=0;
		if(rear < 0) {
			return "underflow";
		}else {
			return 0;
		}
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
	
}

public class MyQueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.insert("test");
		queue.insert(1);
		System.out.println(queue);
		
		
	}

}
