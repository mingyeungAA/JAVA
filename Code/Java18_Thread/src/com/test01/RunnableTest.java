package com.test01;

import java.io.IOException;

public class RunnableTest {
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		try {
			Process prc = rt.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
			//Process prc = rt.exec("notepad.exe");
			System.out.println(rt.totalMemory());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
