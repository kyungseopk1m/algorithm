package com.programmers.mar23;

import java.util.*;

public class intro230325_3 {
	
//	���� ���� ��
	
	/** ������ 2 ������ 0 ���� 5�� ǥ���մϴ�. ���� ���� ���� ���� ������� ��Ÿ��
	 *  ���ڿ� rsp�� �Ű������� �־��� ��, rsp�� ����� ���� ���� ���� ��� �̱�� ��츦 
	 *  ������� ��Ÿ�� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ��غ�����. */
	
		public String solution(String rsp) {
			String answer = "";
			String[] arr = rsp.split("");
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals("2")) {
					answer += "0";
				} else if(arr[i].equals("0")) {
					answer += "5"; 
				} else if(arr[i].equals("5")) {
					answer += "2";
				}
			}
	        return answer;
		}
	
	public static void main(String[] args) {
		
		intro230325_3 obj = new intro230325_3();
		String rsp = "250";
		String result = obj.solution(rsp);
		System.out.println(result);
		
	}

}
