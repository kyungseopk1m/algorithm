package com.programmers.apr23;

import java.util.Arrays;

public class intro230401_1 {
	
	// �迭 ������ ����
	
	/** ���ڿ� �迭 strlist�� �Ű������� �־����ϴ�. strlist �� ������
	 *  ���̸� ���� �迭�� retrun�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// �������ʹ� �ٸ� ���� Ǯ� ����
	
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int length = strlist.length;
        for(int i = 0; i < length; i++) {
        	answer[i] = strlist[i].length();
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
		intro230401_1 obj = new intro230401_1();
		String[] array = {"We", "are", "the", "world!"};
		int[] result = obj.solution(array);
		System.out.println(Arrays.toString(result));
		
	}

}
