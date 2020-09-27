package com.test01;

import java.io.*;  //*를 하면, 메모리에 적재되는 클래스들이 많아지니 무거워진다.

public class MTest01 {
	public static void main(String[] args) {
		
		File file = new File("c:/test_io");  //c드라이브 안에 "test_io"이름의 폴더 생성할 거야
		if(file.exists()) {
			System.out.println("exists...");
		}
		else {
			System.out.println("new!!");
			file.mkdirs(); //make dirctory 만들거야
		}
		
		File file01 = new File(file,"AA"); //"file"폴더에 "AA"폴더 만들거야
		file01.mkdir();  // mkdir()과 mkdirs()기능은 같음.(=만들어라)
		
		File file02 = new File("c:/test_io","BB");  //"test_io"폴더에 "BB"폴더 만들거야
		file02.mkdir();
		
		File txtFile = new File(file01, "a.txt");  //file01객체(file폴더에)에 "a"이름을 가지는 text파일을 만들거야
		try {
			// IOException : Checked Exception
			txtFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("끝!");
		}
		
		
	}

}
