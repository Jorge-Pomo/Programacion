package T8_ej4;

import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		
		Electrodomesticos[] elect = new Electrodomesticos[10];

		elect[0] = new Lavadora(10, 40);
		elect[1] = new Lavadora(50, 120);
		elect[2] = new Lavadora(5, 30);
		elect[3] = new Lavadora(90, 85);
		elect[4] = new Television(34, 22);
		elect[5] = new Television(55, 79);
		elect[6] = new Television(69, 35);
		elect[7] = new Television(58, 92);
		elect[8] = new Electrodomesticos(50, 80, "violeta", 'D');
		elect[9] = new Electrodomesticos(26, 49, "NEGRO", 'B');
		
		for (int i = 0; i < elect.length; i++) {
			System.out.println(elect[i].precioFinal());
		}
		 
		 double sumL = 0;
		 double sumT = 0;
		 double sumE = 0;
		 
		 for (int i = 0; i < elect.length; i++) {
			 
			 String clase = String.valueOf(elect[i].getClass());
			 String [] clases = clase.split(Pattern.quote("."));
			 
			 switch(clases[1]){
			case "Lavadora" :
				sumL = sumL + elect[i].precioFinal();
				break;
			case "Television":
				sumT = sumT + elect[i].precioFinal();
				break;
			case "Electrodomesticos":
				sumE = sumE + elect[i].precioFinal();
				break;
			}
		}
		 
		 sumE = sumE + sumL + sumT;
		 
		 System.out.printf("La suma de Electrodomesticos es de = " + sumE + "\nLa suma de Television es de = " + sumT + "\nLa suma de Lavadoras es de = " + sumL);
	}

}
