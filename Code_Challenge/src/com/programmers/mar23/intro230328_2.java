package com.programmers.mar23;

import java.util.*;

public class intro230328_2 {
	
//	���� ����
	
	/** ����� a, e, i, o, u �ټ� ���� ���ĺ��� �������� �з��մϴ�.
	 *  ���ڿ� my_string�� �Ű������� �־��� �� ������ ������ ���ڿ���
	 *   return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// replaceAll() �Լ�
	// replaceAll(��ȯ�ϰ��� �ϴ� ����� �� ���ڿ�, ��ȯ�� ���� ��)
	
	
		public String solution(String my_string) {
	        return my_string.replaceAll("[aeiou]", "");
	    }
	
	public static void main(String[] args) {
		
		intro230328_2 obj = new intro230328_2();
		String my_string = "nice to meet you";
		String result = obj.solution(my_string);
		System.out.println(result);
	}

}
