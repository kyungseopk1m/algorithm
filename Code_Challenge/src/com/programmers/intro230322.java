package com.programmers;

/** 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요. */

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

