package com.programmers.mar23;

import java.util.*;

public class intro230324_5 {
	
//	�������� ����
	
	/** �������̶� �� ���� ���ڸ� ������ ���Ͽ� ¦���� ��Ÿ�� ������ (a, b)�� ǥ���մϴ�.
	 *  �ڿ��� n�� �Ű������� �־��� �� �� ������ ���� n�� �ڿ��� �������� ������
	 *   return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	
		public int solution(int n) {
			int answer = 0;
			int count = 0;
			
			for(int i = 1; i <= n; i++) {
				if ( n % i == 0) {
					count++;
				}
			}
			answer = count;
		    return answer;
		}
	
	public static void main(String[] args) {
		
		intro230324_5 obj = new intro230324_5();
		int n = 100;
		int result = obj.solution(n);
		System.out.println(result);
		
	}

}
