package com.programmers.mar23;

import java.util.*;

public class intro230327_2 {
	
//	합성수 찾기
	
	/** 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로
	 *  주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요. */
	
	// 헷갈려서 구글링 참고했다. 반복문 학습 필요
	
		public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 1; i <= n; i++) {
	        	int count = 0;
	        	for(int j = 1; j <= i; j++) {
	        		count += (i % j == 0) ? 1 : 0; // 약수면 +1
	        	}
	        	answer += (count >= 3) ? 1 : 0; // 합성수는 약수가 3개 이상이어야 하기 때문에 answer +1
	        }
	        return answer; // 합성수의 개수 return
	    }
	
	public static void main(String[] args) {
		
		intro230327_2 obj = new intro230327_2();
		int n = 10;
		int result = obj.solution(n);
		System.out.println(result);
	}

}
