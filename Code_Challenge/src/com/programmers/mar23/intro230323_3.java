package com.programmers.mar23;

import java.util.Arrays;

public class intro230323_3 {
	
	/** 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
	 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 
	 * return하도록 solution 함수를 완성해주세요. */
	
		public int[] solution(int[] num_list) {
			int[] answer = new int[num_list.length];
			
			for(int i = 0; i < num_list.length; i++) {
				answer[i] = num_list[num_list.length-i-1];
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_3 obj = new intro230323_3();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = obj.solution(num_list);
		System.out.println(Arrays.toString(result));
		
	}

}
