package java_study;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// 2��
//		System.out.println("2��");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//		// 3��
//		System.out.println("3��");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
//		
//		//4��
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
//		// ����� �Է� �� �̿��Ͽ� ������ ���
//		System.out.print("������ �� ����� ����? : "); // print �� �ٹٲ� ���� ���
//		Scanner scaner = new Scanner(System.in);
//		int number = scaner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
//		
//		scaner.close();
		
//		// 6�� : �ݺ��� - while
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1;
//		}
//		
//		// 7�� : for
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
		
		// 8,9 ��
		System.out.print("������ �� ����� ����? : "); // print �� �ٹٲ� ���� ���
		Scanner scaner = new Scanner(System.in);
		int number = scaner.nextInt();
		System.out.println("����� �Է��� �� : " + number);
		
		if(number < 2) {
			System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
		}else if(number > 9) {
			System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
		}else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
		
	}
}
