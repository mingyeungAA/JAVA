package com.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
   public static void main(String[] args) {
      
	   //서버
      ServerSocket serverSocket = null;
      
      //클라이언트
      Socket serviceSocket;
      
      //출력 객체 (클라이언트로 들어갈 것임)
      PrintWriter out = null;
      
      //클라이언트에게 data 받을 객체
      BufferedReader in = null;
   
      try {
         serverSocket = new ServerSocket(7777);  //serverSocket은 TCP, 
      } catch(IOException e) {
         e.printStackTrace();
      }
      
      while(true) {
         System.out.println("[서버] 클라이언트를 기다립니다 ...");
         
         try {
            serviceSocket = serverSocket.accept();
            System.out.println("[서버] 클라이언트가 접속했습니다.");
            
            //클라이언트에게 받을 객체 (들어온 데이터를 읽어서 버퍼로 만들고 있음)
            in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
            
            //클라이언트에게 보낼 객체
            out = new PrintWriter(serviceSocket.getOutputStream(),true); //true > 데이터 보내주고 공간을 비워주는
            
            //키보드가 입력한 걸 받는 객체
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            
            String inputLine;
            while((inputLine = in.readLine()) != null) {
               
            	System.out.println("[서버] 클라이언트가 보낸 메세지 : " + inputLine);
            	
              
               out.println("*" + (inputLine=stdin.readLine())); //>>입력받을거야 그걸 inputLine에 넣을겨
               //다시 클라이언트한테 보내줄거야
            }
            
            out.close();
            in.close();
            serviceSocket.close();
            serverSocket.close();
            
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

}