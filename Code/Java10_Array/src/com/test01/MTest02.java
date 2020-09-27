package com.test01;

public class MTest02 {
	//다차원배열
	public static void main(String[] args) {
		//방법1 = 정방형 배열
		int[][]a = new int [3][2]; //정변배열
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
		
		//방법2 = 비정방형 배열
		int [][] b= new int[3][]; //가변배열
		b[0] = new int [3];  //0행은 3열
		b[1] = new int [5];  //1행은 5열
		b[2] = new int [1];  //2행은 1열
		//이렇게 값을 안넣어 주면 0으로 출력된다.
		
		//방법3
		int[][]c =  new int[][] {
			{1,2},
			{3,4,5},
			{6,7,8,9},
			{0}
		};
		
		//방법4
		int[][]d = {{1},{2,3,4,5},{6,7},{8}}; //선언, 초기화

		System.out.println(a[2][0]);
		System.out.println(c[2][3] + d[1][2]);
		
		prn(c);
		prn(d);
		
		String[][] s= {
				{"have","a","nice","day"},
				{"너무","어려워"},
				{"배열","2차원 배열"}
		};
		modi(s);
		
	}
	
	public static void modi(String[][] arr) {
		//nice > good
		//어려워 > 쉬워
		//전체출력
		arr[0][2] = "good";
		arr[1][1] = "쉬워";
		for(int i=0; i<arr.length ; i++) {
			for(int j =0; j<arr[i].length ;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void prn(int[][]arr) {
		//전체출력
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
