package com.test02;

public class MyException extends Exception{
	

	public MyException() {
		this("MyException Test"); //파라미터 하나짜리를 호출해줄거야
	}
	public MyException(String message) {
		super(message);
	}
}
