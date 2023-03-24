package com.programmers.mar23;

public class intro230323_4 {
	
	/** 문자열 my_string이 매개변수로 주어집니다. 
	 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요. */
	
		public String solution(String my_string) {
			String answer = "";
			StringBuffer sb = new StringBuffer(my_string);
			String reverse = sb.reverse().toString();
			answer = reverse;
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_4 obj = new intro230323_4();
		String my_string = "abcde";
		String result = obj.solution(my_string);
		System.out.println(result);
	}

}
