package com.programmers.mar23;

public class intro230322_3 {
	
	/** ���� �迭 numbers�� �Ű������� �־����ϴ�. 
	 * numbers�� ������ ��հ��� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public double solution(int[] numbers) {
			double answer = 0;
			double sum = 0;
			
			for(int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			answer = sum / numbers.length;
			return answer;
		}
	
		
	public static void main(String[] args) {
		
		intro230322_3 obj = new intro230322_3();
		
		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		double answer = obj.solution(numbers);
		System.out.println(answer);
		
	}

}
