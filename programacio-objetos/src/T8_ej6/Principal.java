package T8_ej6;

public class Principal {

	public static void main(String[] args) {
		Comercial co1 = new Comercial(100, "Jorge", 18, 300);
		Comercial co2 = new Comercial(250, "Diego", 31, 300);
		
		Repartidor rep1 = new Repartidor("zona 1", "Mar", 21, 500);
		Repartidor rep2 = new Repartidor("zona 3", "Marta", 19, 500);
		
		System.out.println(co1.toString());
		System.out.println(co2.toString());
		
		System.out.println(rep1.toString());
		System.out.println(rep2.toString());
		
		co1.plus();
		co2.plus();
		rep1.plus();
		rep2.plus();
		
		System.out.println(co1.getSalario());
		System.out.println(co2.getSalario());
		
		System.out.println(rep1.getSalario());
		System.out.println(rep2.getSalario());

	}

}
