package com.programmers.mar23;

import java.util.Arrays;

/** ���� num1�� num2�� �־��� ��, num1�� num2�� ���� return�ϵ��� soltuion �Լ��� �ϼ����ּ���. */

public class intro230322 {
	
//	public int solution(int num1, int num2) {
//		num1 = 10;
//		num2 = 49;
//		return num1+num2;
//	}

	/** �߾Ӱ��� � �־��� ������ ũ���� ������� �������� �� ���� �߾ӿ� ��ġ�ϴ� ���� �ǹ��մϴ�. 
	 * ���� ��� 1, 2, 7, 10, 11�� �߾Ӱ��� 7�Դϴ�. ���� �迭 array�� �Ű������� �־��� ��, 
	 * �߾Ӱ��� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
	public int solution(int[] array) {
		Arrays.sort(array);
		int answer = array[array.length / 2];
		return answer;
	}
	
	public static void main(String[] args) {
		
		intro230322 obj = new intro230322();
		int[] array = {1, 3, 5, 7, 9};
		int result = obj.solution(array);
//		int result = obj.solution(10, 49);
		System.out.println(result);
	}
}

