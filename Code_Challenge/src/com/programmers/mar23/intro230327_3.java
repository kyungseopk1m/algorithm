package com.programmers.mar23;

import java.util.*;

public class intro230327_3 {
	
//	�ִ� ����� (1)
	
	/** ���� �迭 numbers�� �Ű������� �־����ϴ�. 
	 * numbers�� ���� �� �� ���� ���� ���� �� �ִ� �ִ��� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public int solution(int[] numbers) {
	        int answer = 0;
	        
	        Arrays.sort(numbers); // �迭 ������������ ����
	        
	        return numbers[numbers.length-1] * numbers[numbers.length-2];
	    }
	
	public static void main(String[] args) {
		
		intro230327_3 obj = new intro230327_3();
		int[] numbers = {1, 2, 3, 4, 5};
		int result = obj.solution(numbers);
		System.out.println(result);
	}

}
