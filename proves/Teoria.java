package proves;

public class Teoria {

	public static void main(String[] args) {
		
		//Pasar de String a vector de char
		String sletrasDNI = "BCDFGHJKLMNPQRSTVWXYZ";
		char[] letrasDni = sletrasDNI.toCharArray();
		
		//Dividir un String en dos partes
		String matricula = "0485FPR";
		
		String numeros = matricula.substring(0, 4);
		String letras = matricula.substring(4);
		
		System.out.println(numeros + " " + letras);
		
		//Pasar de String a int
		int n = Integer.parseInt(numeros);
		
		System.out.println(n);
		
		//Encontrar la posicion de un carcater
		System.out.println(sletrasDNI.indexOf("z"));
		
		//Numero aleatorio de 1 a maximo
		for (int i = 0; i < 8; i++) {
			System.out.println((int) (Math.random()*8+1));	
		}
	}

}
