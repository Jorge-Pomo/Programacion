package proves;

public class primos {

	public static void main(String[] args) {
		
		int numM = 35;
		int cont = 1;
		int cont2 = 1;
		
		int contD = 0;
		
		int resto = 0;
		
		while(cont <= 35) {
			
			while(cont2 <= cont) {
				
				resto = cont%cont2;
				
				if(resto == 0) {
					contD++;
				}
				cont2++;
			}
			
			if(contD == 2) {
				System.out.println(cont+"es primo");
			}
			
			cont++;
			contD = 0;
			cont2 = 1;
		}

	}

}
