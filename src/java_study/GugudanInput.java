package java_study;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		// Mission1 : ����� �Է� ������ N * N �� �����
		System.out.print("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
				
		for(int i=2; i<=inputNum; i++) {
			int[] result = calculate(i, inputNum);
			print(result);
		}
		
		// Mission2 : ����� �Է� ��  "8,7" �� ��ĥ�� �����
		System.out.print("������ �� ����� �ܰ� ȸ����?(�޸��� �и�) : ");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		String[] splitValue = inputValue.split(",");
		int first = Integer.parseInt(splitValue[0]);
		int second = Integer.parseInt(splitValue[1]);
		
		for(int i=2; i<=first; i++) {
			int[] result = calculate2(i, first, second);
			print(result);
		}
		
		scanner.close();
		sc.close();
	}

	public static int[] calculate(int times, int inputNum) {
		int[] result = new int[inputNum];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static int[] calculate2(int times, int first, int second) {
		int[] result = new int[second];
		for(int i=0; i<second; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
