package com.programmers;

import java.util.Arrays;

public class intro230324_3 {
	
	/** ���� �迭 numbers�� ���� num1, num2�� �Ű������� �־��� ��,
	 *  numbers�� num1�� ° �ε������� num2��° �ε������� �ڸ� 
	 *  ���� �迭�� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public int[] solution(int[] numbers, int num1, int num2) {
	        return Arrays.copyOfRange(numbers, num1, (num2 + 1));
		}
	
	public static void main(String[] args) {
		
		intro230324_3 obj = new intro230324_3();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		int num1 = 2;
		int num2 = 4;
		int[] result = obj.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(result));
		
	}

}
