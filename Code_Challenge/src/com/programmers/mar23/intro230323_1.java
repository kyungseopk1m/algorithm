package com.programmers.mar23;

public class intro230323_1 {
	
	/** �Ӿ��̳� �ʰ��Դ� 10�� �� �̻� ��� 5%, 30�� �� �̻� ��� 10%,
	 *  50�� �� �̻� ��� 20%�� �������ݴϴ�. ������ ���� ���� price�� �־��� ��, 
	 *  �����ؾ� �� �ݾ��� return �ϵ��� solution �Լ��� �ϼ��غ�����. */
	
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
