package com.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient implements Runnable {
   @Override
   public void run() {
      try {
         Socket clientSocket;
         PrintWriter out = null;
         BufferedReader in = null;
         BufferedReader stdin = null;
         

         System.out.println("클라이언트 서버에 접속합니다...");
         clientSocket = new Socket("localhost", 7777);

         //클라이언트가 서버로  보낼 객체
         out = new PrintWriter(clientSocket.getOutputStream(), true);
         
         //클라이언트가 서버로부터 받은 객체
         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
         
         //키보드가 입력한걸 받는 객체
         stdin = new BufferedReader(new InputStreamReader(System.in));
         
         String inputLine;
         while((inputLine=stdin.readLine()) != null) {
            
        	out.println(inputLine); //입력받은걸 서버로 보낼겨
            
            System.out.println("[클라이언트]서버로부터 다시 받은 메세지 : " + in.readLine());
         }
         
         out.close();
         in.close();
         stdin.close();
         clientSocket.close();
         

      } catch (UnknownHostException e) {
         e.printStackTrace();

      } catch (IOException e) {
         e.printStackTrace();
      }

   }

   public static void main(String[] args) {
      new Thread(new TCPClient()).start();
   }
}