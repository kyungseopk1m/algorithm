package com.programmers;

public class intro230324_2 {
	
	/** �Ӿ��̳� �粿ġ ���Դ� 10�κ��� ������ ����� �ϳ��� ���񽺷� �ݴϴ�. 
	 * �粿ġ�� 1�κп� 12,000��, ������� 2,000���Դϴ�. 
	 * ���� n�� k�� �Ű������� �־����� ��, �粿ġ n�κа� ����� k���� �Ծ��ٸ�
	 *  �Ѿ󸶸� �����ؾ� �ϴ��� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public int solution(int n, int k) {
			int answer = 0;
			
			answer = n * 12000 + k * 2000;
			
			if(n >= 10) {
				answer -= n / 10 * 2000;
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230324_2 obj = new intro230324_2();
		int n = 64;
		int k = 6;
		int result = obj.solution(n, k);
		System.out.println(result);
		
	}

}
