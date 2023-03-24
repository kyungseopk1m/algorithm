package com.programmers.mar23;

import java.util.*;

public class intro230325_2 {
	
//	���� ����
	
	/** �Ӿ��̴� ģ������ �𽺺�ȣ�� �̿��� ������ �޾ҽ��ϴ�. 
	 * �׳��� ���� �� ���� �̸� �ص��ϴ� ���α׷��� ������� �մϴ�. 
	 * ���ڿ� letter�� �Ű������� �־��� ��, letter�� ���� �ҹ��ڷ� �ٲ� 
	 * ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����. �𽺺�ȣ�� ������ �����ϴ�. */
	
	/** a ~ z�� �ش��ϴ� �𽺺�ȣ�� ������� ��� �迭�Դϴ�.
{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} */
	
	// ������� ���۸� ���� ����. �߰� �н� �ʿ�.
	
		public String solution(String letter) {
			String answer = "";
			String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
			String[] morse;
			
			morse = letter.split(" ");
			
			for(String s : morse) {
				for(int i = 0; i < morseList.length; i++) {
					if(s.equals(morseList[i])) {
						answer += Character.toString(i + 'a');
					}
				}
			}
	        return answer;
		}
	
	public static void main(String[] args) {
		
		intro230325_2 obj = new intro230325_2();
		String letter = ".... . .-.. .-.. ---";
		String result = obj.solution(letter);
		System.out.println(result);
		
	}

}
