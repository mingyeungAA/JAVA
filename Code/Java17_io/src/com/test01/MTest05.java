package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest05 {
	public static void main(String[] args) throws IOException  {
		File f1 = new File("b.txt");
		
		myOutput(f1);  //output을 위에다 쓰기
		myInput(f1);  //두개 순서를 바꿔서 출력하면 에러뜸
		
	}
	
	//출력
	private static void myInput(File f1) throws IOException{  
		FileInputStream fin = new FileInputStream(f1);   //기준은 java (file -> java)
		int res = 0;
		while((res=fin.read()) != -1) {
			System.out.print((char)res);
		}
		
		fin.close();
	
	}
	
	//입력
	private static void myOutput(File f1) throws IOException {
		FileOutputStream fo = new FileOutputStream(f1);  //java -> file(기준은 java)
		
		for(int i=65 ; i<=90; i ++) {  //아스키코드(A-Z)
			fo.write(i);
		}
		fo.close();
	}
		
}
