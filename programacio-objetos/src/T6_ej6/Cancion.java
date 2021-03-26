package T6_ej6;

public class Cancion {

	//Atributos
	private String titulo;
	private String autor;
	
	//Constructores
	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	public Cancion() {
		this.titulo = "";
		this.autor = "";
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
	
	//Metodos
	public String dameTitulo() {
		return this.titulo;
	}
	public String dameAutor() {
		return this.autor;
	}
	
	public void ponTitulo(String titu) {
		this.titulo = titu;
	}
	public void ponAutor(String aut) {
		this.autor = aut;
	}

}
