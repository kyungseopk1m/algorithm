package com.programmers;

/** ���� num1�� num2�� �־��� ��, num1�� num2�� ���� return�ϵ��� soltuion �Լ��� �ϼ����ּ���. */

public class intro230322 {
	
	public int solution(int num1, int num2) {
		num1 = 10;
		num2 = 49;
		return num1+num2;
	}
	
	public static void main(String[] args) {
		
		intro230322 obj = new intro230322();
		int result = obj.solution(10, 49);
		System.out.println(result);
	}
}

