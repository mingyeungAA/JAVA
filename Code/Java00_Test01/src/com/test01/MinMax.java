package com.test01;

public class MinMax {
	
	public static void main(String[] args) {
		/*
		 * �޸� ������ static
		 * 1. ��𼭳� ���� �����ϸ�,
		 * ��� ����� ������ �Ŀ��� ���� �ϳ��� ���ϵǴ�
		 * min �̶�� �̸��� �޼ҵ带 ������.
		 * �ش� �żҵ�� ������ �� ���� �Է� �޾Ƽ�
		 * �� �� �� ���� ���ڸ� �������ִ� ����� �Ѵ�.
		 * -���⿬���ڸ� �������
		 * 2. ���� ���� �������, �� �� �� ū ���ڸ� �������ִ� ����� �ϴ� max �޼ҵ带 ������.
		 * 3. main �޼ҵ忡�� ������ ���� �� ���� �־, main �żҵ�� max �޼ҵ忡�� ���ϵǴ� ���� �������
		 */
		
		System.out.println(min(10, 5));
		System.out.println(max(10, 5));
		
		
	}
	
	public static int min(int a, int b) {
		int min = (a < b)? a : b;

		return min;
	}
	
	public static int max(int a, int b) {
		int max = (a > b)? a : b;

		return max;
	}

}
