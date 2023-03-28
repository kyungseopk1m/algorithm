package com.programmers.mar23;

import java.util.*;

public class intro230328_2 {
	
//	모음 제거
	
	/** 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
	 *  문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을
	 *   return하도록 solution 함수를 완성해주세요. */
	
	// replaceAll() 함수
	// replaceAll(변환하고자 하는 대상이 될 문자열, 변환할 문자 값)
	
	
		public String solution(String my_string) {
	        return my_string.replaceAll("[aeiou]", "");
	    }
	
	public static void main(String[] args) {
		
		intro230328_2 obj = new intro230328_2();
		String my_string = "nice to meet you";
		String result = obj.solution(my_string);
		System.out.println(result);
	}

}
