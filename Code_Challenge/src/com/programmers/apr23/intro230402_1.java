package com.programmers.apr23;

import java.util.*;

public class intro230402_1 {
	
	// 중복된 문자 제거
	
	/** 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 
	 * 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요. */
	
	// 생각보다 더 어렵다. 블로그 참고 많이 함.
	
	public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        List<String> arr = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++) {
        	if(!arr.contains(String.valueOf(my_string.charAt(i)))) {
        		arr.add(String.valueOf(my_string.charAt(i)));
        	}
        }
        return String.join("", arr);
    }
	
	public static void main(String[] args) {
		
		intro230402_1 obj = new intro230402_1();
		String my_string = "We are the world";
		String result = obj.solution(my_string);
		System.out.println(result);
		
	}

}
