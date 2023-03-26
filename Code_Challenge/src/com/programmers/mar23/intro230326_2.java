package com.programmers.mar23;

import java.util.*;

public class intro230326_2 {
	
//	점의 위치 구하기
	
	/** 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 
	 * 사분면은 아래와 같이 1부터 4까지 번호를매깁니다. */
	
		public int solution(int[] dot) {
	        
	        if(dot[0] > 0) {
	        	return (dot[1] > 0) ? 1 : 4;
	        } else {
	        	return (dot[1] > 0) ? 2 : 3;
	        }
	    }
	
	public static void main(String[] args) {
		
		intro230326_2 obj = new intro230326_2();
		int[] dot = {-7, 9};
		int result = obj.solution(dot);
		System.out.println(result);
		
	}

}
