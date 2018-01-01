package java_study;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		// Mission1 : 사용자 입력 값으로 N * N 단 만들기
		System.out.print("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
				
		for(int i=2; i<=inputNum; i++) {
			int[] result = calculate(i, inputNum);
			print(result);
		}
		
		// Mission2 : 사용자 입력 값  "8,7" 로 팔칠단 만들기
		System.out.print("구구단 중 출력할 단과 회수는?(콤마로 분리) : ");
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
