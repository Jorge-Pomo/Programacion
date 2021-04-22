package T8_ej9;

public class Principal {

	public static void main(String[] args) {

		Trabajador tra1 = new Trabajador("Juan", "Programador", "la Pobal Llarga", 633303679, 06112002, 22042021, 44444444);
		Empleado emp1 = new Empleado("Jose", "Programador", "Castello", 666666666, 02142000, 22112020, 555555, 25000);
		Consultor cons1 = new Consultor("Juan", "Programador", "Alberic", 777777777, 0221123, 20011336, 666666, 9, 10);
		
		System.out.println(tra1.toString());
		System.out.println(emp1.toString());
		System.out.println(cons1.toString());
	}

}
