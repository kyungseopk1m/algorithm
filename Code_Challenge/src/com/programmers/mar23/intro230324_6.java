package com.programmers.mar23;

import java.util.*;

public class intro230324_6 {
	
//	�ܰ��༺�� ����
	
	/** ���ֿ����� �ϴ� �Ӿ��̴� ���� �������� PROGRAMMERS-962 �༺�� �ҽ����ϰ� �ƽ��ϴ�.
	 *  �Ա��ɻ翡�� ���̸� ���ؾ� �ϴµ�, PROGRAMMERS-962 �༺������ ���̸� ���ĺ�����
	 *   ���ϰ� �ֽ��ϴ�. a�� 0, b�� 1, c�� 2, ..., j�� 9�Դϴ�. 
	 *   ���� ��� 23���� cd, 51���� fb�� ǥ���մϴ�. ���� age�� �Ű������� �־��� ��
	 *    PROGRAMMER-962�� ���̸� return�ϵ��� solution �Լ��� �ϼ����ּ���.. */
	
	
		public String solution(int age) {
			String answer = "";
			String a = "abcdefghij";
			String[] arr = String.valueOf(age).split("");
			
			for(int i = 0; i < arr.length; i++) {
				answer += a.charAt(Integer.valueOf(arr[i]));
			}
	        return answer;
		}
	
	public static void main(String[] args) {
		
		intro230324_6 obj = new intro230324_6();
		int age = 100;
		String result = obj.solution(age);
		System.out.println(result);
		
	}

}
