package com.programmers;

public class intro230322_6 {
	
	/** 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
	 *  피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
	 *  n명의 사람이 최소 한 조각 이상 피자를 먹으려면 
	 *  최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요. */
	
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
