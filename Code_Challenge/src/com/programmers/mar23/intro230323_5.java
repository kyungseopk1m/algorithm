package com.programmers.mar23;

import java.util.Scanner;

public class intro230323_5 {
	
	/** "*"�� ���̿� �ʺ� 1�̶�� ���� ��, "*"�� �̿��� ���� �̵ �ﰢ���� �׸������մϴ�.
	 *  ���� n �� �־����� ���̿� �ʺ� n �� ���� �̵ �ﰢ���� ����ϵ��� �ڵ带 �ۼ��غ�����. */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	// �ﰢ���� ���� �Է�
			
			String str = "*";
			String star = "*";
			for (int i = 0; i < n; i++) {
				System.out.println(str);
				str = str.concat(star);
			}
		}
}
