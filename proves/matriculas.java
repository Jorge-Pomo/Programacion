package proves;

import java.util.Scanner;

public class matriculas {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] matriculas = {0,1,2,3,4,5,6,7,8,9};
		String letras = "bcdfghjklmnpqrstvwxyz";
		char[] letra = letras.toCharArray();
		
		String matricula;
		
		int numerosF;
		
		//Recojer datos matricula
		System.out.println("Deme la matricula");
		matricula = sc.nextLine();
		
		//Dividir la matricula en [Numeros] [Letras]
		String numerosM = matricula.substring(0, 4);		
		String letrasM = matricula.substring(4);
		char[] letrasMat = new char[3];
		
		//Calculo de numeros y letras
		if(numerosM.equals("9999")) {
			numerosF = 0000;
			
			if(letrasMat[2] == 'z') {
				letrasMat[2] = 'b';
				if(letrasMat[1] == 'z') {
					letrasMat[1] = 'b';
					
					int buscaLetra = letras.indexOf(letrasMat[0]);
					buscaLetra = buscaLetra + 1;
					
					letrasMat[0] = letra[buscaLetra];
					
				}
			}else {
				int buscaLetra = letras.indexOf(letrasMat[2]);
				buscaLetra = buscaLetra + 1;
				
				letrasMat[2] = letra[buscaLetra];
			}
			
		}else {
			 numerosF = Integer.parseInt(numerosM) + 1;
			
			String.format("%04d", numerosF);
		}
		
		System.out.println(matricula+" "+numerosF+letrasMat[0]+letrasMat[1]+letrasMat[2]);
	}

}
