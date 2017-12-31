package java_study;

public class GugudanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] result = new int[9];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i+1);
//		}
//		
//		for(int i=0; i < result.length; i++) {
//			System.out.println("2 * "+(i+1)+" : "+result[i]);
//		}
//		
//		int[] result3 = new int[9];
//		for(int i = 0; i < result3.length; i++) {
//			result3[i] = 3 * (i+1);
//		}
//		
//		for(int i=0; i < result3.length; i++) {
//			System.out.println("3 * "+(i+1)+" : "+result3[i]);
//		}
//		
//		int[] result4 = new int[9];
//		for(int i = 0; i < result4.length; i++) {
//			result4[i] = 4 * (i+1);
//		}
//		
//		for(int i=0; i < result4.length; i++) {
//			System.out.println("4 * "+(i+1)+" : "+result4[i]);
//		}
//		
//		int[] result5 = new int[9];
//		for(int i = 0; i < result5.length; i++) {
//			result5[i] = 5 * (i+1);
//		}
//		
//		for(int i=0; i < result5.length; i++) {
//			System.out.println("5 * "+(i+1)+" : "+result5[i]);
//		}
//		
//		int[] result6 = new int[9];
//		for(int i = 0; i < result6.length; i++) {
//			result6[i] = 6 * (i+1);
//		}
//		
//		for(int i=0; i < result6.length; i++) {
//			System.out.println("6 * "+(i+1)+" : "+result6[i]);
//		}
//		
//		int[] result7 = new int[9];
//		for(int i = 0; i < result7.length; i++) {
//			result7[i] = 7 * (i+1);
//		}
//		
//		for(int i=0; i < result7.length; i++) {
//			System.out.println("7 * "+(i+1)+" : "+result7[i]);
//		}
//		
//		int[] result8 = new int[9];
//		for(int i = 0; i < result8.length; i++) {
//			result8[i] = 8 * (i+1);
//		}
//		
//		for(int i=0; i < result8.length; i++) {
//			System.out.println("8 * "+(i+1)+" : "+result8[i]);
//		}
//		
//		int[] result9 = new int[9];
//		for(int i = 0; i < result9.length; i++) {
//			result9[i] = 9 * (i+1);
//		}
//		
//		for(int i=0; i < result9.length; i++) {
//			System.out.println("9 * "+(i+1)+" : "+result9[i]);
//		}
		
		for(int i = 2; i < 10; i++) {
			System.out.println(i + " ´Ü : ==================>");
			int[] result = new int[9];
			for(int j = 0; j < result.length; j++) {
				result[j] = i * (j+1);
			}
			
			for(int j=0; j < result.length; j++) {
				System.out.println(i+" * "+(j+1)+" : "+result[j]);
			}
		}

	}

}
