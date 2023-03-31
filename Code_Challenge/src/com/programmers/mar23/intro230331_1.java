package com.programmers.mar23;

import java.util.*;

public class intro230331_1 {
	
//	소인수분해
	
	/** 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 
	 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 
	 * 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 
	 * n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요. */
	
		public int[] solution(int n) {
	        int[] answer = {};
	        List<Integer> arr = new ArrayList<Integer>();
	        
	        int idx = 2;
	        while (n > 1) {
	        	if(n % idx == 0) {
	        		if(!arr.contains(idx)) {
	        			arr.add(idx);
	        		}
	        		n /= idx;
	        	} else {
	        		idx++;
	        	}
	        }
	        
	        answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230331_1 obj = new intro230331_1();
		int n = 12;
		int[] result = obj.solution(n);
		System.out.println(Arrays.toString(result));
	}

}
