package com.programmers;

public class intro230322_1 {
	
	/** �ֺ��� �־��� �� �߿��� ���� ���� ������ ���� �ǹ��մϴ�. 
	 * ���� �迭 array�� �Ű������� �־��� ��, �ֺ��� return �ϵ��� solution �Լ��� �ϼ��غ�����. 
	 * �ֺ��� ���� ���� -1�� return �մϴ�. */
	
		public int solution(int[] array) {
			int answer = array[0];
			int max = 0; int frequent[] = new int[1000];
			
			for(int i = 0; i < array.length; i++) {
				frequent[array[i]]++;
				
				if(max < frequent[array[i]]) {
					max = frequent[array[i]];
					answer = array[i];
				}
			}
			
			int temp = 0;
			for(int j = 0; j < 1000; j++) {
				if (max == frequent[j]) temp++;
				if(temp > 1) answer = -1;
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230322_1 obj = new intro230322_1();
		int[] array = {1, 2, 2, 2, 5, 7, 8, 10};
		int result = obj.solution(array);
		System.out.println(result);
		
	}

}
