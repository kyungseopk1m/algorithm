package com.programmers;

import java.util.*;

public class intro230324_4 {
	
//	진료순서 정하기
	
	/** 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
	 *  정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 
	 *  진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요. */
	
	//생각보다 더 어려워서 거의 구글링. 나중에 한번 더 체크하기.
	
		public int[] solution(int[] emergency) {
			int[] num = new int[emergency.length];
			int[] answer = new int[emergency.length];
			
			for(int i = 0; i <= emergency.length-1; i++) {
				num[i] = emergency[i];
			}
			
			Arrays.sort(num);
			
			for(int i = 0; i <= emergency.length-1; i++) {
				for(int j = 0; j<= emergency.length-1; j++) {
					if(num[i]==emergency[j]) {
						answer[j]=emergency.length-i;
					}
				}
			}
		    return answer;
		}
	
	public static void main(String[] args) {
		
		intro230324_4 obj = new intro230324_4();
		int[] emergency = {3, 76, 24};
		int[] result = obj.solution(emergency);
		System.out.println(Arrays.toString(result));
		
	}

}
