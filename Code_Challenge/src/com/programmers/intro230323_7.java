package com.programmers;

import java.util.Arrays;

public class intro230323_7 {
	
	/** ���ڿ� my_string�� ���� n�� �Ű������� �־��� ��, 
	 * my_string�� ����ִ� �� ���ڸ� n��ŭ �ݺ��� ���ڿ��� return �ϵ���
	 *  solution �Լ��� �ϼ��غ�����. */
	
		public String solution(String my_string, int n) {
			String answer = "";
			String[] str = new String[my_string.length()];
			str = my_string.split("");
			
			for(int i = 0; i < my_string.length(); i++) {
				answer += str[i].repeat(n);
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_7 obj = new intro230323_7();
		String my_String = "seop";
		int n = 3;
		String answer = obj.solution(my_String, n);
		System.out.println(answer);
	}

}
