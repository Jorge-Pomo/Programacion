package proves;

import java.util.Scanner;

public class desgloseBilletesMonedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precio;
		int[] valor = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int[] resultado = new int[14];
		
		System.out.println("Dime un precio:");
		precio = sc.nextDouble();
		
		
		
		int precioE = (int) (precio * 100);
		
		for (int i = 0; i < valor.length; i++) {
			if((precioE / valor[i]) != 0) {
				if((valor[i] / 100) != 0) {
					if(valor[i]/100 > 9) {
						System.out.print(precioE/valor[i]+" de "+(valor[i] / 100));
						if(valor[i] / 100 <= 2) {
							System.out.printf("%16s %n", " billetes");
						}else {
							System.out.printf("%16s %n", " billete");
						}
					}else {
						System.out.printf(precioE/valor[i]+" de "+(valor[i] / 100));
						if(valor[i] / 100 <= 2) {
							System.out.printf("%16s %n", " euros");
						}else {
							System.out.printf("%16s %n", " euro");
						}
					}
				}else {
					System.out.printf(precioE/valor[i]+" de "+valor[i]);
					if(valor[i] / 100 <= 2) {
						System.out.printf("%16s %n", " centimos");
					}else {
						System.out.printf("%16s %n", " centimo");
					}
				}
				precioE = precioE - ((precioE / valor[i])*valor[i]);
			}
		}
	}

}
