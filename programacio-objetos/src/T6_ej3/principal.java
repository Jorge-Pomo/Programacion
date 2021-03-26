package T6_ej3;

public class principal {

	public static void main(String[] args) {
		Fecha fech1 = new Fecha(29, 2, 1972);
		Fecha fech2 = new Fecha(31, 4, 2020);
		Fecha fech3 = new Fecha(31, 3, 2020);
		Fecha fech4 = new Fecha(30, 6, 2020);
		Fecha fech5 = new Fecha(31, 12, 2020);

		System.out.println(fech1.fechaCorrecta());
		System.out.println(fech2.fechaCorrecta());
		System.out.println(fech3.fechaCorrecta());
		System.out.println(fech4.fechaCorrecta());
		System.out.println(fech5.fechaCorrecta());

		System.out.print(fech1.getDia() + " " + fech1.getMes() + " " + fech1.getAño() + " - ");
		fech1.diaSiguiente();
		System.out.print(fech1.getDia() + " " + fech1.getMes() + " " + fech1.getAño());

		System.out.println();

		System.out.print(fech2.getDia() + " " + fech2.getMes() + " " + fech2.getAño() + " - ");
		fech2.diaSiguiente();
		System.out.print(fech2.getDia() + " " + fech2.getMes() + " " + fech2.getAño());

		System.out.println();

		System.out.print(fech3.getDia() + " " + fech3.getMes() + " " + fech3.getAño() + " - ");
		fech3.diaSiguiente();
		System.out.print(fech3.getDia() + " " + fech3.getMes() + " " + fech3.getAño());

		System.out.println();

		System.out.print(fech4.getDia() + " " + fech4.getMes() + " " + fech4.getAño() + " - ");
		fech4.diaSiguiente();
		System.out.print(fech4.getDia() + " " + fech4.getMes() + " " + fech4.getAño());
		
		System.out.println();

		System.out.print(fech5.getDia() + " " + fech5.getMes() + " " + fech5.getAño() + " - ");
		fech5.diaSiguiente();
		System.out.print(fech5.getDia() + " " + fech5.getMes() + " " + fech5.getAño());

	}
}
