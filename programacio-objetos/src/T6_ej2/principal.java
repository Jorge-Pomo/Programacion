package T6_ej2;

public class principal {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Green", "Chair", 300, 150);

		System.out.println(libro1.getTitulo()+" "+libro1.getAutor()+" "+libro1.getNEjemplos()+" "+libro1.getNEjemPresta());
	
		libro1.prestamo(125);
		System.out.println(libro1.getNEjemplos()+" "+libro1.getNEjemPresta());
		
		libro1.devolucion();
		System.out.println(libro1.getNEjemplos()+" "+libro1.getNEjemPresta());
		
		//Al prestar más de lo que hay no hace la operacion
		libro1.prestamo(300);
		System.out.println(libro1.getNEjemplos()+" "+libro1.getNEjemPresta());
		
		//No puede devolver porque estan todos ja
		libro1.prestamo(30);
		System.out.println(libro1.getNEjemplos()+" "+libro1.getNEjemPresta());
		
		libro1.devolucion();
		System.out.println(libro1.getNEjemplos()+" "+libro1.getNEjemPresta());
	}

}
