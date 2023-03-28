package com.programmers.mar23;

import java.util.*;

public class intro230328_1 {
	
//	�ִ� ����� (1)
	
	/** i���丮�� (i!)�� 1���� i���� ������ ���� �ǹ��մϴ�. 
	 * ������� 5! = 5 * 4 * 3 * 2 * 1 = 120 �Դϴ�. ���� n�� �־��� �� 
	 * ���� ������ �����ϴ� ���� ū ���� i�� return �ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// �� �����ߴ�. ���۸� ������ ����
	
	
		public static int fac(int n) { // ���丮�� ���ϴ� �޼ҵ�
			if(n==1) { // �Ű������� ���� ������ 1�̸� 1�� ����
				return 1;
			}
			return n*fac(n-1); // �Ű������� ���� ������ 1�� ���� �ٽ� �޼ҵ忡 ����(���), 1�� �� ������ ��� ����
		}
		
		public int solution(int n) {
			int answer = 0;
			for(int i = 10; i > 0; i--) { // 10���� 1�� ����
				if(fac(i) <= n) {	//�Ű������� ���� n���� �۾����� ������ ���� ����
					answer = i;
					break;
				}
			}
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230328_1 obj = new intro230328_1();
		int n = 7;
		int result = obj.solution(n);
		System.out.println(result);
	}

}
