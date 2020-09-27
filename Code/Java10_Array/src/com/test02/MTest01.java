package com.test02;

import java.util.Arrays;

public class MTest01 {
	public static void main(String[] args) {
		int[] original = {10,20,30,40};
		
		int[] copy = original; //original 주소값이 리턴됨 (reference 복사) >> 복사본 변경시, 원본도 변경됨
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original == copy); //true
		
		copy[1]=22;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original.hashCode()); //hashCode() = 주소값
		System.out.println(copy.hashCode());
	}

}
