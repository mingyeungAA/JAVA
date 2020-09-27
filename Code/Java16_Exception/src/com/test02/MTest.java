package com.test02;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {

		int a = 0;

		try {
			System.out.println("숫자를 입력해 주세요: ");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();

			System.out.println(a + 10);
			
			if(a==7) {
				throw new MyException();  //throw 원하는 예외를 발생시켜서 객체에 던지는
				
			}else if(a==29) {
				throw new MyException("29 시러");
			}

		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("내가 발생시킨 예외");
		}catch(Exception e) { //모든 exception을 catch하겠다. 
			//>>하나하나 잡는게 더 좋음
			e.printStackTrace();
			System.out.println("가장 큰 예외"); //숫자가 아닌 다른 값을 넣으면 출력됨
		}

	}

}
