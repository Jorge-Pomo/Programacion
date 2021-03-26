package proves;

import java.util.Scanner;

public class calcul_digitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int divNum;
		int restNum;

		System.out.println("Dime un número");
		num = sc.nextInt();

		divNum = num;
		restNum = num;
		
		for (int i = 0; i < 4; i++) {
			num = divNum % 10;
			divNum = divNum / 10;
			
			restNum = num;
			System.out.print(restNum);
		}
		System.out.println(divNum);
		
	
	}

}
