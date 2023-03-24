package com.programmers.mar23;

import java.util.*;

public class intro230325_2 {
	
//	개미 군단
	
	/** 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
	 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
	 * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 
	 * 문자열을 return 하도록 solution 함수를 완성해보세요. 모스부호는 다음과 같습니다. */
	
	/** a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} */
	
	// 어려워서 구글링 많이 했음. 추가 학습 필요.
	
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
