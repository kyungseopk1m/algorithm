package com.programmers.mar23;

import java.util.Arrays;

public class intro230323_3 {
	
	/** ������ ��� �ִ� �迭 num_list�� �Ű������� �־����ϴ�. 
	 * num_list�� ������ ������ �Ųٷ� ������ �迭�� 
	 * return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public int[] solution(int[] num_list) {
			int[] answer = new int[num_list.length];
			
			for(int i = 0; i < num_list.length; i++) {
				answer[i] = num_list[num_list.length-i-1];
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_3 obj = new intro230323_3();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = obj.solution(num_list);
		System.out.println(Arrays.toString(result));
		
	}

}
