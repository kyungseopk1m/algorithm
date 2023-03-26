package com.programmers.mar23;

import java.util.*;

public class intro230326_3 {
	
//	2�������� �����
	
	/** ���� �迭 num_list�� ���� n�� �Ű������� �־����ϴ�.
	    num_list�� ���� ����� ���� 2���� �迭�� �ٲ� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		num_list�� [1, 2, 3, 4, 5, 6, 7, 8] �� ���̰� 8�̰� n�� 2�̹Ƿ� 
		num_list�� 2 * 4 �迭�� ������ ���� �����մϴ�. 2�������� �ٲ� ������
		num_list�� ���ҵ��� �տ������� n���� ���� 2���� �迭�� �����մϴ�. */
	
		public int[][] solution(int[] num_list, int n) {
	        int[][] answer = {};
	        
	        int length = num_list.length;
	        
	        answer = new int[length/n][n];
	        
	        for(int i = 0; i < length; i++) {
	        	answer[i/n][i%n] = num_list[i];
	        }
			
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230326_3 obj = new intro230326_3();
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] result = obj.solution(num_list, n);
//		System.out.println(Arrays.toString(result)); 2���� �迭�� Arrays.deepToString() �޼��� ����ؾ���.
		System.out.println(Arrays.deepToString(result));
		
	}

}
