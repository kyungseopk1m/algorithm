package com.programmers.mar23;

import java.util.*;

public class intro230326_2 {
	
//	���� ��ġ ���ϱ�
	
	/** ��и��� �� ����� x��� y���� �������� ���� �� �κ��Դϴ�. 
	 * ��и��� �Ʒ��� ���� 1���� 4���� ��ȣ���ű�ϴ�. */
	
		public int solution(int[] dot) {
	        
	        if(dot[0] > 0) {
	        	return (dot[1] > 0) ? 1 : 4;
	        } else {
	        	return (dot[1] > 0) ? 2 : 3;
	        }
	    }
	
	public static void main(String[] args) {
		
		intro230326_2 obj = new intro230326_2();
		int[] dot = {-7, 9};
		int result = obj.solution(dot);
		System.out.println(result);
		
	}

}
