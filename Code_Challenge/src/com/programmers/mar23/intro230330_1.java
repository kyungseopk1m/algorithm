package com.programmers.mar23;

import java.util.*;

public class intro230330_1 {
	
//	�����ִ� ������ ���� (1)
	
	/** ���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� ��� 
	 * �ڿ������� ���� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public int solution(String my_string) {
	        int answer = 0;
	        
	        my_string = my_string.toLowerCase().replaceAll("[a-z]", "");
	        String[] arr = my_string.split("");
	        
	        for(int i = 0; i < arr.length; i++) {
	        	answer += Integer.parseInt(arr[i]);
	        }
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230330_1 obj = new intro230330_1();
		String my_string = "1a2b3c4d123";
		int result = obj.solution(my_string);
		System.out.println(result);
	}

}
