package com.programmers.mar23;

public class intro230322_5 {
	
	/** �Ӿ��̳� ���ڰ��Դ� ���ڸ� ���� �������� �߶� �ݴϴ�. 
	 * ���ڸ� �������� ����� �� n�� �Ű������� �־��� ��,
	 *  n���� �ֹ��� ���ڸ� ������ �ʰ� ��� ���� ���� ���� ������ �Ծ�� �Ѵٸ�
	 *   �ּ� �� ���� ���Ѿ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public int solution(int n) {
			int answer = 0;
			
			for(int i = 1; i <= 6 * n; i++) {
				if(6 * i % n == 0) {
					answer = i;
					break;
				}
			}
			return answer;
		}
	
		
	public static void main(String[] args) {
		
		intro230322_5 obj = new intro230322_5();
		
//		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
//		double answer = obj.solution(numbers);
//		System.out.println(answer);
		
		int n = 10;
		int answer = obj.solution(n);
		System.out.println(answer);
		
	}

}
