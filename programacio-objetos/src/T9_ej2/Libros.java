package T9_ej2;

public class Libros extends Publicaciones{

	//Atributos
	private String autor;
	
	//Constructor
	public Libros(int codigo, String añoPubli, boolean prestado, String autor) {
		super(codigo, añoPubli, prestado);
		this.autor = autor;
	}
	
	//Getters && Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//Metodos
	@Override
	public String toString() {
		return super.toString() + " Autor:" + autor;
	}
}
