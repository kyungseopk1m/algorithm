package com.programmers.mar23;

import java.util.*;

public class intro230325_4 {
	
//	������ ������ ����� ��
	
	/** �Ӿ��̴� ������ ģ���鿡�� �������ַ��� �մϴ�. ������ ��� �ٸ��� ������ϴ�.
	 *  �Ӿ��̰� ���� �ִ� ������ ���� balls�� ģ���鿡�� ������ ��
	 *   ���� ���� share�� �Ű������� �־��� ��, balls���� ���� �� share���� ������
	 *   ���� ������ ��� ����� ���� return �ϴ� solution �Լ��� �ϼ����ּ���. */
	
	// �ڵ常 ���� �������̴µ� ��� �����ؾ����� �ʹ� �򰥷ȴ�... �ð��� ���� �� ����
	// �ᱹ ���۸��� �߰�.. ���� ���ΰ� �ʿ��غ��δ�.
	
		public int solution(int balls, int share) {
	        return combination(balls, share);
	    }
		
		public static int combination(int balls, int share) {
			if (balls == share || share == 0) {
				return 1;
			}
			return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
			
		}
	
	public static void main(String[] args) {
		
		intro230325_4 obj = new intro230325_4();
		int balls = 5;
		int share = 3;
		
		int result = obj.solution(balls, share);
		System.out.println(result);
		
	}

}
