package com.programmers.mar23;

import java.util.*;

public class intro230328_1 {
	
//	최댓값 만들기 (1)
	
	/** i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
	 * 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 
	 * 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요. */
	
	// 꽤 생소했다. 구글링 많이한 문제
	
	
		public static int fac(int n) { // 팩토리얼 구하는 메소드
			if(n==1) { // 매개변수로 들어온 정수가 1이면 1을 리턴
				return 1;
			}
			return n*fac(n-1); // 매개변수로 들어온 정수에 1을 빼고 다시 메소드에 넣음(재귀), 1이 될 때까지 계속 넣음
		}
		
		public int solution(int n) {
			int answer = 0;
			for(int i = 10; i > 0; i--) { // 10부터 1씩 감소
				if(fac(i) <= n) {	//매개변수로 들어온 n보다 작아지는 순간이 오면 리턴
					answer = i;
					break;
				}
			}
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230328_1 obj = new intro230328_1();
		int n = 7;
		int result = obj.solution(n);
		System.out.println(result);
	}

}
