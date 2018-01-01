package java_study;

public class GugudanMethod {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
//		int[] result = calculate(2); //2단
//		print(result);
//
//		int[] result3 = calculate(3); //3단
//		print(result3);
//		
//		int[] result4 = calculate(4); //4단
//		print(result4);
//		
//		int[] result5 = calculate(5); //5단
//		print(result5);
		
		for(int i=2; i<10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}

}
