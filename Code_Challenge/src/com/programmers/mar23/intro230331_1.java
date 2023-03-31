package com.programmers.mar23;

import java.util.*;

public class intro230331_1 {
	
//	���μ�����
	
	/** ���μ����ض� � ���� �Ҽ����� ������ ǥ���ϴ� ���Դϴ�. 
	 * ���� ��� 12�� ���μ� �����ϸ� 2 * 2 * 3 ���� ��Ÿ�� �� �ֽ��ϴ�. 
	 * ���� 12�� ���μ��� 2�� 3�Դϴ�. �ڿ��� n�� �Ű������� �־��� �� 
	 * n�� ���μ��� ������������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public int[] solution(int n) {
	        int[] answer = {};
	        List<Integer> arr = new ArrayList<Integer>();
	        
	        int idx = 2;
	        while (n > 1) {
	        	if(n % idx == 0) {
	        		if(!arr.contains(idx)) {
	        			arr.add(idx);
	        		}
	        		n /= idx;
	        	} else {
	        		idx++;
	        	}
	        }
	        
	        answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		intro230331_1 obj = new intro230331_1();
		int n = 12;
		int[] result = obj.solution(n);
		System.out.println(Arrays.toString(result));
	}

}
