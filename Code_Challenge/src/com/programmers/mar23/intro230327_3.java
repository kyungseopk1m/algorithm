package com.programmers.mar23;

import java.util.*;

public class intro230327_3 {
	
//	최댓값 만들기 (1)
	
	/** 정수 배열 numbers가 매개변수로 주어집니다. 
	 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요. */
	
		public int solution(int[] numbers) {
	        int answer = 0;
	        
	        Arrays.sort(numbers); // 배열 오름차순으로 정렬
	        
	        return numbers[numbers.length-1] * numbers[numbers.length-2];
	    }
	
	public static void main(String[] args) {
		
		intro230327_3 obj = new intro230327_3();
		int[] numbers = {1, 2, 3, 4, 5};
		int result = obj.solution(numbers);
		System.out.println(result);
	}

}
