package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MTest02 {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://blogfiles.naver.net/20150619_224/28686_1434691052105vnEid_JPEG/%C6%F7%C4%CF%B8%F3_%C7%C7%C4%AB%C3%F2_%BD%BA%C6%E4%BC%C8.mp4_001399091.jpg");
		
		byte[] b = new byte[1];
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());  
		//DataInputStream과 FileOutputStream의 차이는???? >> Datainput/outputStream은 자바 기본자료형 데이터를 입출력할 수 있고, Fileinput/outputStream은 byte단위의 데이터만 입출력할 수 있다.
		//Datainput/outputStream은 데이터 입출력시, 바이트로 변환하여 출력해야 한다.
		
		FileOutputStream fo = new FileOutputStream("data.jpg");
		
		while(di.read(b,0,1) != -1) { 
			//아규미터 값이 왜 3개나 들어감????
			//>>read(byte[]b, int off(=start offset), int len)
			fo.write(b,0,1);
		}
		fo.close();
		di.close();
	}

}
