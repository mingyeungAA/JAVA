package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest04 {
	public static void main(String[] args) {
		
		File f1 = new File("a.txt");
		
		myOutput(f1);
		myInput(f1);
		
		
	}
	private static void myOutput(File f1) {
		
		/// try with resources > try괄호 안에다가 resource관련한 것을 넣어주면, 자동으로 close()해줌
		try(FileWriter fw = new FileWriter(f1)){
			fw.write("연습중입니다.\n");
			fw.append("가나다\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void myInput(File f1) {
		try(FileReader fr = new FileReader(f1)){
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
