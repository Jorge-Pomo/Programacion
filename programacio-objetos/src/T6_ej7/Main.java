package T6_ej7;

public class Main {

	public static void main(String[] args) {
		Notas mar = new Notas();
		Alumno jorge = new Alumno();
		jorge.setNombre("Jorge");
		
		mar.leer();
		jorge.setNotasAlumnos(mar);
		jorge.tooString();
		
		
	}

}
