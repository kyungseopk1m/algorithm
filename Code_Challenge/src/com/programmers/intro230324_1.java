package com.programmers;

public class intro230324_1 {
	
	/** ���ڿ� my_string�� ���� letter�� �Ű������� �־����ϴ�. 
	 * my_string���� letter�� ������ ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public String solution(String my_string, String letter) {
			return my_string.replaceAll(letter, "");
		}
	
	public static void main(String[] args) {
		
		intro230324_1 obj = new intro230324_1();
		String my_string = "abcdef";
		String letter = "f";
		String result = obj.solution(my_string, letter);
		System.out.println(result);
		
	}

}
