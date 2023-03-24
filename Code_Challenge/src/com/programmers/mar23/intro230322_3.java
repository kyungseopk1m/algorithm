package com.programmers.mar23;

public class intro230322_3 {
	
	/** 정수 배열 numbers가 매개변수로 주어집니다. 
	 * numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요. */
	
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
