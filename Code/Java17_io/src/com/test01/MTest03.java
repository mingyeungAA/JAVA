package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest03 {
	public static void main(String[] args) {
		File f1 = new File("a.txt");  //아직은 파일이 만들어진 것은 아님  >> 그저 객체 생성
		try {
			myOutput(f1);
			myInput(f1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void myInput(File f1) throws IOException {  //IOException이 더 크다.
		FileReader fr = new FileReader(f1);
		
		int ch;
		
		//처음부터 파일의 끝까지, 한글자씩 읽어서 가져오자 >> 파일의끝을 -1로 잡는다.(그렇게 만들어져씀..)
		while((ch=fr.read()) != -1) {  //아스키코드로 >> checked exception >> throws 
			System.out.print((char)ch);
			
		}
		fr.close();
		
	}
	private static void myOutput(File f1) throws IOException {  //throws : 
		FileWriter fw = new FileWriter(f1,true);  //false는 그대로 나옴 , true는 두번씩(++) 써짐
		
		fw.write("연습중입니다.\n");  //write와 append 의 차이????
		fw.append("abc\n").append("def\n");
		
		fw.close();
	}

}
