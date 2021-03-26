package T6_ej7;

public class Alumno {

	//Atributos
	private String nombre;
	private int numExpediente;
	private Notas notasAlumnos;
	
	//Constructores
	public Alumno() {
		
	}
	public Alumno(String nombre, int numExpediente, Notas notasAlumnos) {
		this.nombre = nombre;
		this.numExpediente = numExpediente;
		this.notasAlumnos = notasAlumnos;
	}
	
	//Getters & Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre; 
	}
	
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	public int  getNumExpediente() {
		return numExpediente;
	}
	
	public void setNotasAlumnos(Notas notasAlumnos) {
		this.notasAlumnos = notasAlumnos;
	}
	public Notas getNotasAlumnos() {
		return notasAlumnos;
	}
	
	//Metodos
	public void tooString() {
		System.out.println("Alumno: " + this.nombre);
		System.out.println("------- Notas -------");
		notasAlumnos.Mostrar();
		System.out.println("-- Nota media:" + notasAlumnos.media());
	}
}
