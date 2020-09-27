package com.test02;

public class Gugu {
	
	public static void main(String[] args) {
		//gugudan();
		gugudan02();
	}
	
	public static void gugudan() {
		//2*1=2
		//2*2=4
		//....
		//9*9=81
		//for문 사용해서 구구단 출력하자.
		
		for(int i=2; i<10 ; i++) {
			for(int j=1 ; j<10 ; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}
	
	
	public static void gugudan02() {
		//while 사용해서 출력
		/*int i=1;
		int j=0;
		
		while(i<9) {
			j=0; //*****j가 10이 되기 때문에 초기화를 해야된다.****
			i++; //i=2
			while(j<9) {
				j++; //j=1,2,3,...9	
				System.out.println(i+" * "+j+" = "+(i*j));
			}		
			
		}*/
	
		int i=2;
		while(i<10) {
			System.out.println("<<"+i+"단>>");
			int j=1;
			while(j<10) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
		
	}

}
