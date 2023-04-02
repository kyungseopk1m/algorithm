package com.programmers.apr23;

import java.util.*;

public class intro230402_1 {
	
	// �ߺ��� ���� ����
	
	/** ���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� �ߺ��� ���ڸ� �����ϰ� 
	 * �ϳ��� ���ڸ� ���� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
	// �������� �� ��ƴ�. ��α� ���� ���� ��.
	
	public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        List<String> arr = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++) {
        	if(!arr.contains(String.valueOf(my_string.charAt(i)))) {
        		arr.add(String.valueOf(my_string.charAt(i)));
        	}
        }
        return String.join("", arr);
    }
	
	public static void main(String[] args) {
		
		intro230402_1 obj = new intro230402_1();
		String my_string = "We are the world";
		String result = obj.solution(my_string);
		System.out.println(result);
		
	}

}
