package com.programmers;

import java.util.Arrays;

public class intro230323_7 {
	
	/** 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
	 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록
	 *  solution 함수를 완성해보세요. */
	
		public String solution(String my_string, int n) {
			String answer = "";
			String[] str = new String[my_string.length()];
			str = my_string.split("");
			
			for(int i = 0; i < my_string.length(); i++) {
				answer += str[i].repeat(n);
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_7 obj = new intro230323_7();
		String my_String = "seop";
		int n = 3;
		String answer = obj.solution(my_String, n);
		System.out.println(answer);
	}

}
