package com.programmers.mar23;

import java.util.Arrays;

public class intro230323_2 {
	
	/** �Ӿ��̴� �߿� ������ ���̽� �Ƹ޸�ī�븸 ���ʴϴ�. 
	 * ���̽� �Ƹ޸�ī��� ���ܿ� 5,500���Դϴ�. �Ӿ��̰� ������ �ִ� ��
	 *  money�� �Ű������� �־��� ��, �Ӿ��̰� �ִ�� ���� �� �ִ�
	 *   �Ƹ޸�ī���� �� ���� ���� ���� ������� ���� �迭�� 
	 *   return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public int[] solution(int money) {
			int[] answer = new int[2];
			answer[0] = money/5500;
			answer[1] = money%5500;
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_2 obj = new intro230323_2();
		int money = 14000;
		int[] result = obj.solution(money);
		System.out.println(Arrays.toString(result));
		
	}

}
