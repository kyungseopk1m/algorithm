package com.programmers.mar23;

import java.util.*;

public class intro230329_1 {
	
//	���ڿ� �����ϱ� (1)
	
	/** ���ڿ� my_string�� �Ű������� �־��� ��, my_string �ȿ� �ִ� ���ڸ�
	 *  ��� �������� ������ ����Ʈ�� return �ϵ��� solution �Լ��� �ۼ��غ�����. */
	
		public int[] solution(String my_string) {
			my_string = my_string.replaceAll("[a-z]", "");
			
			String[] arr = my_string.split("");
	        int[] answer = {};
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230329_1 obj = new intro230329_1();
		String my_string = "hi12392";
		int[] result = obj.solution(my_string);
		System.out.println(result);
	}

}
