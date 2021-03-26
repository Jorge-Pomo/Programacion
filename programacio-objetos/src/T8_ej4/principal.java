package T8_ej4;

public class principal {

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
						
		
	}

}
