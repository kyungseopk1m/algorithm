package com.challenge;

import java.util.Arrays;
import java.util.Scanner;

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
		
		int val2 = 123;
		if(val2 > 100) {
			System.out.println("��");
		}else {
			System.out.println("�ƴϿ�");
		}
		
		//2.1 �Ѽ��� �Է¹޾� 2�� ���, 3�� ���, 5�� ������� Ȯ���ϼ���. 
		
		int num21 = 12;
		if(num21 % 2 == 0) {
			System.out.println("2�� ���");
		}
		if(num21 % 3 == 0) {
			System.out.println("3�� ���");
		}
		if(num21 % 5 == 0) {
			System.out.println("5�� ���");
		}
		
		//2.2 // 1~300 �߿� �Ѽ��� �Է¹ް�, 
			  // 1~100���� ����, 100�ʰ� ~ 200 ���� ����, 200~�ʰ� �������� �и��Ͽ� ����ϼ���.
		      // 50 = 1~100 ���� , 124 = 100~200����
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���.");
//		int num = sc.nextInt();
		int num = 124;
		
		switch(num / 100) {
		case 0:
			System.out.println("1~100 ����");
			break;
		case 1:
			if (num <= 200) {
				System.out.println("100~200 ����");
			} else {
				System.out.println("200~�ʰ� ����");
			}
			break;
			default:
				System.out.println("200�ʰ� ����");
				break;
		}

		//2.3 switch���� ���� ���ڿ� ���ڸ� �����ϴ� �ڵ带 �ۼ��ϼ���.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Ǵ� ���ڸ� �Է��ϼ���.");
//		String input = sc.nextLine();
		String input = "3";
		
		switch (input.charAt(0)) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("�Է��� ���� �����Դϴ�.");
			break;
		default:
			System.out.println("�Է��� ���� �����Դϴ�.");
			break;
		}
		
		//2.4 ID/PW�� �Է¹ް�, ID�� 5���� �̻��̰�, ID�� PW�� ���Ե��� ���� ���¸�
 		//    if�� �ϳ��� üũ���ּ���.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ID�� �Է����ּ���.");
//		String id = sc.nextLine();
//		System.out.println("PW�� �Է����ּ���.");
//		String pw = sc.nextLine();
		String id = "asdfgh";
		String pw = "qwert";
		
		
		if(id.length() < 5 || id.contains(pw)) {
			System.out.println("�߸��� ����Դϴ�.");
		} else {
			System.out.println("�α��� ����!");
		}
				
		
//		3. �ݺ���
		// ex) 1~10���� ����ϱ�
		
		for(int i = 0; i<10; i++) {
//			System.out.println(i);
		}
		
//		// 3.1 ������ 2�ܸ� ����ϱ� ex) 2 X 1 = 2 �÷�
		
		for(int i=1; i<10; i++) {
//			System.out.println("2 X " + i + " = " + (i*2));
		}
		
		// 3.2 1���� 100���� ¦���� ��� ����ϱ�
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
//				System.out.println(i);
			}
		}
		
		// 3.3 1���� 100���� �� �߿� 5�� ����� 7�� ����� Ȯ���ϰ� ����ϱ�.
		
		/**
		for(int i = 1; i <= 100; i++) {
			if(i%5 == 0 && i%7 == 0) {
				System.out.println(i + "�� 5�� 7�� ����Դϴ�.");
				continue;
			}
			if(i%5 == 0) {
				System.out.println(i + "�� 5�� ����Դϴ�.");
			}
			if(i%7 == 0) {
				System.out.println(i + "�� 7�� ����Դϴ�.");
			}
		}
		*/
		
		// 3.4 1���� 1000���� �� �߿� 
		//     3�� ����̸鼭 4�� ����� ���� ��� ã��,
		//     ���߿� 20���� ã���� �ݺ��� �����ϱ�.
		
		/**
		int count = 1;
		for(int i = 1; i <= 1000; i++) {
			if(i%3 == 0 && i%4 == 0) {
				System.out.println("3�� 4�� ��� = " + i );
				count++;
				if(count > 20) {
					System.out.println("3�� 4�� ����� 20�� ã�ҽ��ϴ�.");
					break;
				}
			}
		}
		*/
		
//		4. ��ø �ݺ���
		// 4.1 ������ 1�ܺ��� 9�ܱ��� ��� ����ϴµ�, ���� �ٲ𶧸��� "x��" ǥ���ϱ�
		// ex) 2 X 9 = 18;
		//     3�� ����!
		//     3 X 1 = 3
		
		/**
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "�� ����!");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		*/
		
		// 4.2 ������ 1�ܺ��� 9�ܱ��� ��� ����ϴµ�
		// 9�ܱ��� ���η� ����ϱ�
		// ex) 2X1=1 3X1=3 4X1=4 ...
		//     2X2=2 3X2=6 4X2=8
		
		/**
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + (i*j) +"\t");
			}
			System.out.println();
		}
		*/
		
		// 4.3 ����ڿ��� 1~100 ���� 2���� �Է� �ް�, �� ���� ���� ���� ���� ��� ����ϱ�.
		//     ��, ���� �ݺ��ϱ�.
		// �Է� 53, 47
		// ��� 48, 49, 50, 51, 52
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1~100 ���� �ȿ��� ���� �ϳ��� ���� �Է��ϼ���.");
//		int num43 = sc.nextInt();
//		System.out.println("1~100 ���� �ȿ��� ������ ���� �ϳ��� �Է��ϼ���.");
//		int num44 = sc.nextInt();
		int num43 = 30;
		int num44 = 35;
		
		if(num43 > num44) {
			int temp = num43;
			num43 = num44;
			num44 = temp;
		}
		
		for(int i = num43; i <= num44; i++) {
//			System.out.print(i + "\t");
		}
		
		
//		5. �迭
//		5.1 �迭 ���������� 10�� ĭ�� �����ϰ�, 1���� 10������ �� �ʱ�ȭ �ϱ� 
		
		int[] arr = new int[10]; // �迭 ����
		
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;		// 1���� 10���� �ʱ�ȭ
		}
		

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
