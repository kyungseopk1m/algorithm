package com.programmers.mar23;

import java.util.*;

public class intro230326_1 {
	
//	�� ������	
	
	/** �Ӿ��̴� ģ����� ���׶��� ���� �� ������ ������ �ϰ� �ֽ��ϴ�. 
	 * ���� 1������ ������ ���������� �� ���� �ǳʶٰ� �״��� ������Ը� ���� �� �ֽ��ϴ�. 
	 * ģ������ ��ȣ�� ����ִ� ���� �迭 numbers�� ���� K�� �־��� ��, k��°�� ���� ������ ����� 
	 * ��ȣ�� �������� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public int solution(int[] numbers, int k) {
			int answer = numbers[2 * (k - 1) % numbers.length];
	        return answer;
		}
	
	public static void main(String[] args) {
		
		intro230326_1 obj = new intro230326_1();
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		int result = obj.solution(numbers, k);
		System.out.println(result);
		
	}

}
