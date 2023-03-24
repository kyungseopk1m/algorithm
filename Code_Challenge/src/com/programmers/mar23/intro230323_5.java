package com.programmers.mar23;

import java.util.Scanner;

public class intro230323_5 {
	
	/** "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
	 *  정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요. */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	// 삼각형의 높이 입력
			
			String str = "*";
			String star = "*";
			for (int i = 0; i < n; i++) {
				System.out.println(str);
				str = str.concat(star);
			}
		}
}
