package com.programmers;

public class intro230324_1 {
	
	/** 문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
	 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요. */
	
		public String solution(String my_string, String letter) {
			return my_string.replaceAll(letter, "");
		}
	
	public static void main(String[] args) {
		
		intro230324_1 obj = new intro230324_1();
		String my_string = "abcdef";
		String letter = "f";
		String result = obj.solution(my_string, letter);
		System.out.println(result);
		
	}

}
