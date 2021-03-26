package T6_ej2;

public class Libro {

	private String titulo;
	private String autor;
	private int nEjemplos;
	private int nEjemPresta;
	
	//Constructores
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int nEjemplos, int nEjemPresta) {
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplos = nEjemplos;
		this.nEjemPresta = nEjemPresta;
	}
	
	//Getters & Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setNEjemplos(int nEjemplos) {
		this.nEjemplos = nEjemplos;
	}
	public int getNEjemplos() {
		return nEjemplos;
	}
	
	public void setNEjemPresta(int nEjemPresta) {
		this.nEjemPresta = nEjemPresta;
	}
	public int getNEjemPresta() {
		return nEjemPresta;
	}
	
	//Metodos
	public boolean prestamo(int prestado) {
		boolean resu = false;
		
		if(this.nEjemPresta - this.nEjemplos > prestado) {
			this.nEjemPresta = nEjemPresta + prestado;
			resu = true;
		}
		
		return resu;
	}
	
	public boolean devolucion() {
		boolean resu = false;
		
		if(this.nEjemPresta < this.nEjemplos) {
			this.nEjemPresta = nEjemPresta - 1;
			resu = true;
		}
		
		return resu;
	}
}
