package com.programmers.mar23;

import java.util.*;

public class intro230327_2 {
	
//	�ռ��� ã��
	
	/** ����� ������ �� �� �̻��� ���� �ռ������ �մϴ�. �ڿ��� n�� �Ű�������
	 *  �־��� �� n������ �ռ����� ������ return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// �򰥷��� ���۸� �����ߴ�. �ݺ��� �н� �ʿ�
	
		public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 1; i <= n; i++) {
	        	int count = 0;
	        	for(int j = 1; j <= i; j++) {
	        		count += (i % j == 0) ? 1 : 0; // ����� +1
	        	}
	        	answer += (count >= 3) ? 1 : 0; // �ռ����� ����� 3�� �̻��̾�� �ϱ� ������ answer +1
	        }
	        return answer; // �ռ����� ���� return
	    }
	
	public static void main(String[] args) {
		
		intro230327_2 obj = new intro230327_2();
		int n = 10;
		int result = obj.solution(n);
		System.out.println(result);
	}

}
