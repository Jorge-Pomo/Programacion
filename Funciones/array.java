package Funciones;

public class array {

	public static void numeros(int[][] nums){
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int) (Math.random()*10);
				
				System.out.print(nums[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] vector = new int[5][5];
		
		numeros(vector);
		
		int num = (int) (Math.random()*10);
		System.out.println(num);

	}

	
	
	
}
