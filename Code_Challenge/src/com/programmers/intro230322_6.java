package com.programmers;

public class intro230322_6 {
	
	/** �Ӿ��̳� ���ڰ��Դ� ���ڸ� �� �������� �� �������� ���ϴ� ���� ���� �߶��ݴϴ�.
	 *  ���� ���� �� slice�� ���ڸ� �Դ� ����� �� n�� �Ű������� �־��� ��, 
	 *  n���� ����� �ּ� �� ���� �̻� ���ڸ� �������� 
	 *  �ּ� �� ���� ���ڸ� ���Ѿ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public int solution(int slice, int n) {
			int answer = 0;
			
			if(n % slice == 0) {
				answer = n / slice;
			}else {
				answer = n / slice + 1;
			}
			return answer;
		}
	
		
	public static void main(String[] args) {
		
		intro230322_6 obj = new intro230322_6();
		
//		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
//		double answer = obj.solution(numbers);
//		System.out.println(answer);
		
		int slice=4;
		int n = 12;
		int answer = obj.solution(slice, n);
		System.out.println(answer);
		
	}

}
