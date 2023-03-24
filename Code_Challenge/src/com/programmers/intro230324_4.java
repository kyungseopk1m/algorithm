package com.programmers;

import java.util.*;

public class intro230324_4 {
	
//	������� ���ϱ�
	
	/** �ܰ��ǻ� �Ӿ��̴� ���޽ǿ� �� ȯ���� ���޵��� �������� ���� ������ ���Ϸ��� �մϴ�.
	 *  ���� �迭 emergency�� �Ű������� �־��� �� ���޵��� ���� ������� 
	 *  ���� ������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	//�������� �� ������� ���� ���۸�. ���߿� �ѹ� �� üũ�ϱ�.
	
		public int[] solution(int[] emergency) {
			int[] num = new int[emergency.length];
			int[] answer = new int[emergency.length];
			
			for(int i = 0; i <= emergency.length-1; i++) {
				num[i] = emergency[i];
			}
			
			Arrays.sort(num);
			
			for(int i = 0; i <= emergency.length-1; i++) {
				for(int j = 0; j<= emergency.length-1; j++) {
					if(num[i]==emergency[j]) {
						answer[j]=emergency.length-i;
					}
				}
			}
		    return answer;
		}
	
	public static void main(String[] args) {
		
		intro230324_4 obj = new intro230324_4();
		int[] emergency = {3, 76, 24};
		int[] result = obj.solution(emergency);
		System.out.println(Arrays.toString(result));
		
	}

}
