package com.test01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		
		//DatagramSocket : 실제 데이터의 전송을 책임지는 클래스
		//DatagramPacket : 애플리케이션에서 주고받을 데이터와 관련된 클래스
		//    (생성자로 송신/수신 기능 구분)
		
		//클라이언트 생성(포트 안써줌)
		DatagramSocket ds = new DatagramSocket();
		
		System.out.println("클라이언트 입니다.");
		
		//보낼 data
		byte[] buff = "연습입니다.".getBytes();
		
		//packet으로 감싼다.
		DatagramPacket sendPacket = new DatagramPacket(buff,buff.length,InetAddress.getByName("localhost"),9999);
		//getbyName >> ip address나 host을 출력한다.
		//                          new DatagramPacket(byte[] buf, int length, InetAddress address, int port);
		
		//보낸다.
		ds.send(sendPacket); //DatagramPacket 전송
		
		ds.close();
		ds.disconnect();	
	}
}
