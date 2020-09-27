package com.lotto;

import java.util.Arrays;

/*
public class Lotto {
	
	//로또 배열을 생성
	private int[] make() {
		int []arr = new int[6];
		
		Lotto lt = new Lotto();
		lt.isSame(arr, (int)((Math.random()*45)+1));
		lt.sort(arr);
	
		return null;
	}

	//중복값 판별
	private boolean isSame(int []arr, int insert) { //넣어준값이 배열에 있나요?
		
		for(int i=0 ; i<arr.length ; i++) {
			//max-min+1 +min = 45-1+1 +1
			arr[i]=(int)((Math.random()*45)+1) ;
		}
		
		//insert = (int)((Math.random()*45)+1);
		
		for(int i=0 ; i<arr.length; i++) {
			if(arr[i]==insert) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	//정렬
	private void sort(int []arr) { //작은수부터 큰수까지
		Arrays.parallelSort(arr);
		
		for(int i=0 ; i< arr.length ;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	//출력
	public void prn() {
		Lotto lt = new Lotto();
		lt.make();
		//lt.sort(arr);
		
		//for(int i=0 ; i<arr.length; i++) {
			//System.out.print(arr[i]+" ");
		//}
		
		
	}
}
*/

public class Lotto{
	
	private int[] make(){
		int [] arr=new int [6];
		int index=0;
		
		while(index < 6) {
			int insert=(int) (Math.random()*45)+1;
			
			if(!isSame(arr,insert)) { //arr배열에 insert값이 있는지 없는지
				arr[index]=insert;
				index++;
			}
		}
		return arr;
	}
	
	private boolean isSame(int[] arr, int insert) {
		
		boolean same=false;
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] == insert) {
				same=true;
				break;
			}
		}
		return same;
	}
	
	private void sort(int []arr) { //버블정렬
		int temp=0;
		
		for(int i=0 ; i<arr.length ; i++) { //6줄 무조건 돌고
			for(int j=1; j<arr.length ;j++) {
				if(arr[j] <arr[j-1]) {
					int tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
				}
				
			}
		}
		
	}
	
	public void prn() {
		int[]arr = make();
		sort(arr);
		
		System.out.print("[");
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("]");
	}
}
