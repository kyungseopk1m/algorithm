package com.programmers.mar23;

import java.util.*;

public class intro230330_1 {
	
//	숨어있는 숫자의 덧셈 (1)
	
	/** 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 
	 * 자연수들의 합을 return하도록 solution 함수를 완성해주세요. */
	
		public int solution(String my_string) {
	        int answer = 0;
	        
	        my_string = my_string.toLowerCase().replaceAll("[a-z]", "");
	        String[] arr = my_string.split("");
	        
	        for(int i = 0; i < arr.length; i++) {
	        	answer += Integer.parseInt(arr[i]);
	        }
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230330_1 obj = new intro230330_1();
		String my_string = "1a2b3c4d123";
		int result = obj.solution(my_string);
		System.out.println(result);
	}

}
