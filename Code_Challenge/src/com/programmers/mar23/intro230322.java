package com.programmers.mar23;

import java.util.Arrays;

/** 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요. */

public class intro230322 {
	
//	public int solution(int num1, int num2) {
//		num1 = 10;
//		num2 = 49;
//		return num1+num2;
//	}

	/** 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 
	 * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 
	 * 중앙값을 return 하도록 solution 함수를 완성해보세요. */
	
	public int solution(int[] array) {
		Arrays.sort(array);
		int answer = array[array.length / 2];
		return answer;
	}
	
	public static void main(String[] args) {
		
		intro230322 obj = new intro230322();
		int[] array = {1, 3, 5, 7, 9};
		int result = obj.solution(array);
//		int result = obj.solution(10, 49);
		System.out.println(result);
	}
}

