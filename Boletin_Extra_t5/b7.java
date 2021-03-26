package Boletin_Extra_t5;

public class b7 {

	public static void main(String[] args) {
		
		int[] arr1 = new int [100];
		int[] arr2 = new int [100];

		for (int i = 0; i < arr2.length; i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}
		
		for (int i = 100; i >= 0; i--) {
			arr2[i] = i+1;
			System.out.println(arr2[i]);
		}
		
	}

}
