package com.programmers.mar23;

public class intro230323_4 {
	
	/** ���ڿ� my_string�� �Ű������� �־����ϴ�. 
	 * my_string�� �Ųٷ� ������ ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���. */
	
		public String solution(String my_string) {
			String answer = "";
			StringBuffer sb = new StringBuffer(my_string);
			String reverse = sb.reverse().toString();
			answer = reverse;
			
			return answer;
		}
	
	public static void main(String[] args) {
		
		intro230323_4 obj = new intro230323_4();
		String my_string = "abcde";
		String result = obj.solution(my_string);
		System.out.println(result);
	}

}
