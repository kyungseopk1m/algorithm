package com.programmers;

import java.util.Arrays;

public class intro230322_2 {
	
	/** ���� n�� �Ű������� �־��� ��, n ������ Ȧ���� ������������ ��� �迭��
	 *  return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public int[] solution(int n) {
			int[] answer = new int[(n+1)/2];
			
			for (int i = 1; i <= n; i++) {
				if(i % 2 == 1) {
					answer[i/2] = i;
				}
			}
			
			return answer;
		}
	
		
	public static void main(String[] args) {
		
		intro230322_2 obj = new intro230322_2();
		int n = 11;
		int[] result = obj.solution(n);
		System.out.println(Arrays.toString(result));
		
//		int[] array = {1, 2, 2, 2, 5, 7, 8, 10};
//		int result = obj.solution(array);
//		System.out.println(result);
		
	}

}
