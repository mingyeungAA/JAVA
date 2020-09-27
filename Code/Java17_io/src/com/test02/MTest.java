package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest {
	public static void main(String[] args) throws IOException {
		
		String fileName = "a.jpg";
		
		/*
		FileInputStream f1 = new FileInputStream(fileName);
		BufferedInputStream b1 = new BufferedInputStream(f1);
		*/
		
		BufferedInputStream b1 = new BufferedInputStream(new FileInputStream(fileName)); //위의 두 문장을 하나로 합침 >> "a.jpg" 읽어올거야
		//buffered : 뭉텅이로 미리미리 가져오겠다
		
		FileOutputStream fo = new FileOutputStream(new File("c.jpg"));  //"c.jpg"라는 이름으로 내보낼거야
		
		//이 위에는 그저 써놓은것. 
		//아래부분이  출력
	    int a = 0;
	    while((a= b1.read()) != -1) {
	    	fo.write(a);
	    }
		
	    //최근에 열었던 것 부터 먼저 닫아줘야함
	    fo.close();
	    b1.close();
	    
	}

}
