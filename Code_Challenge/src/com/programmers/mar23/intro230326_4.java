package com.programmers.mar23;

import java.util.*;

public class intro230326_4 {
	
//	배열 회전시키기
	
	/** 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
	 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 
	 * return하도록 solution 함수를 완성해주세요. */
	
	// 범위값은 항상 헷갈린다.. 구글링 많이 함. 추가 학습 필요
	
		public int[] solution(int[] numbers, String direction) {
	        int[] answer = new int[numbers.length];
	        
	        switch (direction) {
	        case "right":
	        	int temp1 = numbers[numbers.length-1];
	        	for(int i = numbers.length-1; i > 0; i--) {
	        		answer[i] = numbers[i-1];
	        	}
	        	answer[0] = temp1;
				break;
	        
			case "left":
				int temp = numbers[0];
				for(int i = 0; i < numbers.length-1; i++) {
					answer[i] = numbers[i+1];
				}
				answer[numbers.length-1] = temp;
				break;
			}
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230326_4 obj = new intro230326_4();
		int[] number = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] result = obj.solution(number, direction);
		System.out.println(Arrays.toString(result));
		
	}

}
