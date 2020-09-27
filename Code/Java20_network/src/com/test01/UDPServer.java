package com.test01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//UDP
public class UDPServer {
	public static void main(String[] args) throws Exception {
		
		//서버 생성
		DatagramSocket ds= new DatagramSocket(9999); //Listen할 포트. DatagramPocket을 받기위한 socket생성
		System.out.println("서버입니다.");
		
		//data 받아줄 공간
		byte[] buff = new byte[1024]; //데이터를 받을 버퍼
		
		//packet을 받는다.
		DatagramPacket receivePacket =  new DatagramPacket(buff,buff.length); //데이터를 받을 pocket생성
		
		//
		ds.receive(receivePacket); //데이터 수신될 때까지 대기됨
		System.out.println(new String(receivePacket.getData()));  //실제 데이터를 문자열로 반환하여 출력
		
		
		ds.close();
		ds.disconnect();
		
		
	}

}
