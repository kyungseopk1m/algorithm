package com.programmers;

public class intro230322_4 {
	
	/** �Ӿ��̳� ���ڰ��Դ� ���ڸ� �ϰ� �������� �߶� �ݴϴ�. 
	 * ���ڸ� �������� ����� �� n�� �־��� ��, 
	 * ��� ����� ���ڸ� �� ���� �̻� �Ա� ���� �ʿ��� ������ ���� 
	 * return �ϴ� solution �Լ��� �ϼ��غ�����. */
	
		public int solution(int n) {
			int answer = 0;
			
			if(n % 7 == 0) {
				answer = n / 7;
			}else {
				answer = n / 7 + 1;
			}
			
			return answer;
		}
	
		
	public static void main(String[] args) {
		
		intro230322_4 obj = new intro230322_4();
		
//		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
//		double answer = obj.solution(numbers);
//		System.out.println(answer);
		
		int n = 15;
		int answer = obj.solution(n);
		System.out.println(answer);
		
	}

}
