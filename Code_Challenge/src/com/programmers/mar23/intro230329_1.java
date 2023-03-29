package com.programmers.mar23;

import java.util.*;

public class intro230329_1 {
	
//	문자열 정렬하기 (1)
	
	/** 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만
	 *  골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요. */
	
		public int[] solution(String my_string) {
			my_string = my_string.replaceAll("[a-z]", "");
			
			String[] arr = my_string.split("");
	        int[] answer = {};
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230329_1 obj = new intro230329_1();
		String my_string = "hi12392";
		int[] result = obj.solution(my_string);
		System.out.println(result);
	}

}
