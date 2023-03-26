package com.programmers.mar23;

import java.util.*;

public class intro230326_4 {
	
//	�迭 ȸ����Ű��
	
	/** ������ ��� �迭 numbers�� ���ڿ� direction�� �Ű������� �־����ϴ�. 
	 * �迭 numbers�� ���Ҹ� direction�������� �� ĭ�� ȸ����Ų �迭�� 
	 * return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// �������� �׻� �򰥸���.. ���۸� ���� ��. �߰� �н� �ʿ�
	
		public int[] solution(int[] numbers, String direction) {
	        int[] answer = new int[numbers.length];
	        
	        switch (direction) {
	        case "right":
	        	int temp1 = numbers[numbers.length-1];
	        	for(int i = numbers.length-1; i > 0; i--) {
	        		answer[i] = numbers[i-1];
	        	}
	        	answer[0] = temp1;
				break;
	        
			case "left":
				int temp = numbers[0];
				for(int i = 0; i < numbers.length-1; i++) {
					answer[i] = numbers[i+1];
				}
				answer[numbers.length-1] = temp;
				break;
			}
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230326_4 obj = new intro230326_4();
		int[] number = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] result = obj.solution(number, direction);
		System.out.println(Arrays.toString(result));
		
	}

}
