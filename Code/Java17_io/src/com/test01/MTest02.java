package com.test01;

import java.io.File;

public class MTest02 {
	public static void main(String[] args) {

		File f1 = new File("c:\\");

		printFiles(f1);

	}

	public static void printFiles(File f1) {
		// 파일 목록과 폴더 목록을 구분해서 출력하자.
		// 파일의 갯수와 폴더의 갯수를 출력하자.

		// file : ssss
		// dir : ssssss

		// file 갯수 : n개
		// dir 갯수 : n개

		int fileCnt = 0;
		int dirCnt = 0;

		// File[] file = new File[] {};

		for (File f : f1.listFiles()) {
			if (f.isFile()) {
				fileCnt++;
				System.out.println("file  : " + f);
			} else {
				dirCnt++;
				System.out.println("dir : " + f);
			}

		}
		System.out.println("file 갯수 : " + fileCnt);
		System.out.println("dir 갯수 : " + dirCnt);

	}

}
