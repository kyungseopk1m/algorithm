package com.programmers.mar23;

import java.util.Arrays;

public class intro230324_3 {
	
	/** 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
	 *  numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 
	 *  정수 배열을 return 하도록 solution 함수를 완성해보세요. */
	
		public int[] solution(int[] numbers, int num1, int num2) {
	        return Arrays.copyOfRange(numbers, num1, (num2 + 1));
		}
	
	public static void main(String[] args) {
		
		intro230324_3 obj = new intro230324_3();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		int num1 = 2;
		int num2 = 4;
		int[] result = obj.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(result));
		
	}

}
