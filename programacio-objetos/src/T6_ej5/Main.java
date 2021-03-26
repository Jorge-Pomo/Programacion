package T6_ej5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora dia = new Hora();
		
		System.out.println(dia.getHoras()+dia.getminutos()+dia.getsegundos());
		
		dia.setHoras("05");
		dia.setminutos("35");
		dia.setsegundos("06");
		
		System.out.println(dia.getHoras()+":"+dia.getminutos()+dia.getsegundos());
		
		System.out.println(dia.aSegundos());
		System.out.println(dia.deSegundos(600));
		System.out.println(dia.segundosDesde(10));
		System.out.println(dia.siguiente());
		System.out.println(dia.anterior());
		System.out.println(dia.copia());
		System.out.println(dia.igualQue(5, 35, 6));
		System.out.println(dia.menorQue(5, 35, 5));
		System.out.println(dia.mayorQue(5, 35, 7));
		
		dia.leer();
		System.out.println(dia.getHoras()+dia.getminutos()+dia.getsegundos());
	}

}
