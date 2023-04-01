package com.programmers.apr23;

import java.util.Arrays;

public class intro230401_1 {
	
	// 배열 원소의 길이
	
	/** 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의
	 *  길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요. */
	
	// 다음부터는 다른 언어로 풀어볼 예정
	
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int length = strlist.length;
        for(int i = 0; i < length; i++) {
        	answer[i] = strlist[i].length();
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
		intro230401_1 obj = new intro230401_1();
		String[] array = {"We", "are", "the", "world!"};
		int[] result = obj.solution(array);
		System.out.println(Arrays.toString(result));
		
	}

}
