package com.programmers;

import java.util.Arrays;

public class intro230323_6 {
	
	/** 정수가 담긴 리스트 num_list가 주어질 때, 
	 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 
	 * return 하도록 solution 함수를 완성해보세요. */
	
		public int[] solution(int[] num_list) {
			int[] answer = new int[2];
			
			for(int i = 0; i < num_list.length; i++) {
				if(num_list[i] % 2 == 0) {
					answer[0]++;
				} else {
					answer[1]++;
				}
			}
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_6 obj = new intro230323_6();
		int[] num_list = {1, 3, 5, 7};
		int[] result = obj.solution(num_list);
		System.out.println(Arrays.toString(result));
	}

}
