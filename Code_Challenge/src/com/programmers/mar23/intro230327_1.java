package com.programmers.mar23;

import java.util.*;

public class intro230327_1 {
	
//	�ֻ����� ����
	
	/** �Ӿ��̴� ������ü ����� ���ڸ� �ϳ� ������ �ִµ� �� ���ڿ�
	 *  ������ü ����� �ֻ����� �ִ��� ���� ä��� �ͽ��ϴ�. 
	 *  ������ ����, ����, ���̰� ����Ǿ��ִ� �迭 box�� 
	 *  �ֻ��� �𼭸��� ���� ���� n�� �Ű������� �־����� ��, ���ڿ� �� �� �ִ�
	 *   �ֻ����� �ִ� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// �ֻ����� �ִ� ��� �� �� �ִ��� ���ϴ� ���� ����
	
		public int solution(int[] box, int n) {
	        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230327_1 obj = new intro230327_1();
		int[] box = {10, 8, 6};
		int n = 3;
		int result = obj.solution(box, n);
		System.out.println(result);
		
	}

}
