package com.challenge;

import java.util.Arrays;

public class Code1 {
	
	public static void main(String[] args) {
		int result = 0;
		System.out.println(result);
		
		// ������� �ڵ� ¥�ּ���.
		// 1. �˸��� ���� �����ϰ� ����ϱ�
		//  Ex) ���������� 1000 ��� �ϱ�
		int value = 1000;
		System.out.println(value);
		
		// 1.1 ���������� 94743616344 ����ϱ�
		long value1 = 94743616344L;
		System.out.println(value1);
		
		// 1.2 �Ǽ������� 3.14 ����ϱ�
		double value2 = 3.14;
		System.out.println(value2);
		
		// 1.3 100�� 3���� ������, �Ҽ��� ǥ���ϱ� ex) 33.333333
		double num1 = 100;
		double num2 = 3;
		double value3 = num1 / num2;
		System.out.printf("%.6f\n",value3);
		
		
		// 1.4 �Ǽ� 12.71�� �����ϰ�, �Ҽ��� ������ ex) 12
		double num3 = 12.71;
		System.out.println(Math.floor(num3));
		
		// 1.5 byte b�� 128�� �ʱ�ȭ ������ ��Ű��
		byte b = (byte) 128;
		System.out.println(b);
		
		
		
//		2. ���� �����ڿ� if�� Switch�� �Բ� ����ϱ�
		// Ex) val2��� ���ڰ� 100���� ū�� Ȯ���ϰ�, ��� '��' '�ƴϿ�' ����ϱ�
		
//		int val2 = 123;
//		if(val2 > 100) {
//			System.out.println("��");
//		}else {
//			System.out.println("�ƴϿ�");
//		}
		
		//2.1 �Ѽ��� �Է¹޾� 2�� ���, 3�� ���, 5�� ������� Ȯ���ϼ���. 
		
//		int num21 =0;
//		if(num21 % 2 == 0) {
//		}
//		if(num21 % 3 == 0) {
//			
//		}
//		if(num21 % 5 == 0) {
//			
//		}
		
		
		//2.2 // 1~300 �߿� �Ѽ��� �Է¹ް�, 
			  // 1~100���� ����, 100�ʰ� ~ 200 ���� ����, 200~�ʰ� �������� �и��Ͽ� ����ϼ���.
		      // 50 = 1~100 ���� , 124 = 100~200����

		//2.3 switch���� ���� ���ڿ� ���ڸ� �����ϴ� �ڵ带 �ۼ��ϼ���.
		
		
		//2.4 ID/PW�� �Է¹ް�, ID�� 5���� �̻��̰�, ID�� PW�� ���Ե��� ���� ���¸�
 		//    if�� �ϳ��� üũ���ּ���.
		
//		String id = "asdas";
//		String pw = "1212";
//		
//		if(id.length() < 5 || id.contains(pw)) {
//			System.out.println("�߸��� ����Դϴ�.");
//		}
				
				
		
		
		
//		3. �ݺ���
		// ex) 1~10���� ����ϱ�
		
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
//		
//		// 3.1 ������ 2�ܸ� ����ϱ� ex) 2 X 1 = 2 �÷�
//		for(int i=1; i<=9; i++) {
//			System.out.println("2 X " + i +" = " + (i*2));
//		}
		
		// 3.2 1���� 100���� ¦���� ��� ����ϱ�
		
//		for(int i = 1; i <= 100; i++) { // 1 ~ 100
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		// 3.3 1���� 100���� �� �߿� 5�� ����� 7�� ����� Ȯ���ϰ� ����ϱ�.
		
//		for(int i = 1; i <= 100; i++) { // 1 ~ 100
//			if(i%5 == 0) {
//				System.out.println("5�� ����Դϴ�.");
//			}
//			if(i%7 == 0) {
//				System.out.println("7�� ����Դϴ�.");
//			}
//		}
		
		// 3.4 1���� 1000���� �� �߿� 
		//     3�� ����̸鼭 4�� ����� ���� ��� ã��, &&
		//     ���߿� 20���� ã���� �ݺ��� �����ϱ�.
		
//		int count = 0;
//		for(int i = 1; i <= 1000; i++) { // 1 ~ 1000
//			if(i%3 == 0 && i%4 == 0) {
//				System.out.println("5�� ����Դϴ�.");
//				count++;
//				if(count > 20) {
//					break;
//				}
//			}
//		}
		
//		4. ��ø �ݺ���
		// 4.1 ������ 1�ܺ��� 9�ܱ��� ��� ����ϴµ�, ���� �ٲ𶧸��� "x��" ǥ���ϱ�
		// ex) 2 X 9 = 18;
		//     3�� ����!
		//     3 X 1 = 3
		
//		for(int i = 2; i < 10; i++) { // 2 ~ 9
//			System.out.println(i+"�� ����");
//			for(int j=2; j < 10; j++) { // 2 ~ 9
//				System.out.println(j +" X "+ i + " = " + (i*j));
//			}
//		}
		
		// 4.2 ������ 1�ܺ��� 9�ܱ��� ��� ����ϴµ�
		// 9�ܱ��� ���η� ����ϱ�
		// ex) 2X1=1 3X1=3 4X1=4 ...
		//     2X2=2 3X2=6 4X2=8
		
		// 4.3 ����ڿ��� 1~100 ���� 2���� �Է� �ް�, �� ���� ���� ���� ���� ��� ����ϱ�.
		//     ��, ���� �ݺ��ϱ�.
		// �Է� 53, 47
		// ��� 48, 49, 50, 51, 52
		
//		int num1  = 30; 
//		int num2  = 40; 
//
//		if(num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		
//		for(int i = num1 ; i <= num2; i++) {
//			System.out.println(i);
//		}
		
		
		
//		5. �迭
//		5.1 �迭 ���������� 10�� ĭ�� �����ϰ�, 1���� 10������ �� �ʱ�ȭ �ϱ� 

//		5.2 �迭 ���������� 100������ �����ϰ�, 3�� 7�� ��� 100�� ã�Ƽ� �ֱ�
		// 21, 42 .....
		
//		int array[] = new int[100]; 
//		int counter = 0;
//		for(int i = 0; ; i++) {
//			if(i % 3 == 0 && i % 7 == 0 ) {
//				array[counter++] = i;
//				if(counter == 100) {
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(array));
		
		
//		5.3 �迭 String������ 10�� ���� �����ϰ� ������� ���� �Է¹޾� �� �����ϱ�.
		//  ��, exit�� �Է½� �ٷ� �����ϰ� ���� ���� ������ ��� ���
		
		
//		5.4 �迭 String������ 10�� ���� �����ϰ� ������� ���� �Է¹޾� �� �����ϱ�.
		//  ���߿� ���ڷ� �Էµ� ���� ����ϱ�
		
		
//		5.5 �迭 String������ 10�� ���� �����ϰ� ����ڿ��� '����' ���� �Է¹޾� �� �����ϱ�.
		//  ���߿� ���ĺ� ���� ��� count �غ���.
		// �Է� : abc bbb ccc
		// a : 1��
		// b : 4��
		// c : 4��
		
//		String[] arrayStr = new String[10];
//		for(int i=0; i< 10; i++) {
//			arrayStr[i] = ""+(char)('a'+i) + (char)('c'+i) + (""+((char)('e'+i))).repeat(i) ; 
//			System.out.println(arrayStr[i]);
//		}
//		
//		int[] counterArray = new int['z'-'a' + 1]; 
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j<arrayStr[i].length(); j++) {
//				String str = arrayStr[i];
//				counterArray[str.charAt(j) - 'a']++;
//			}
//		}
//		
//		for(int i= 0; i< counterArray.length; i++) {
//			System.out.println((char)('a'+i) +" : " + counterArray[i]);
//		}

	}

}
