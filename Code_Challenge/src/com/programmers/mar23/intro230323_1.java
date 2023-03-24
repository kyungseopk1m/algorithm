package com.programmers.mar23;

public class intro230323_1 {
	
	/** 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%,
	 *  50만 원 이상 사면 20%를 할인해줍니다. 구매한 옷의 가격 price가 주어질 때, 
	 *  지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요. */
	
		public int solution(int price) {
			int answer = 0;
			
			if (price >= 100000 && price < 300000) {
				answer = (int)(price * 0.95);
			} else if (price >= 300000 && price < 500000) {
				answer = (int)(price * 0.9);
			} else if (price >= 500000) {
				answer = (int)(price * 0.8);
			} else {
				answer= price;
			}
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_1 obj = new intro230323_1();
		int price = 580000;
		int result = obj.solution(price);
		System.out.println(result);
		
//		int[] array = {1, 2, 2, 2, 5, 7, 8, 10};
//		int result = obj.solution(array);
//		System.out.println(result);
		
	}

}
