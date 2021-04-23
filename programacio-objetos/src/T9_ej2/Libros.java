package T9_ej2;

/**
 * Ejercicio 2 Tema 9 1r DAM-PROG
 * 
 * @author Joge Pomo Ramón
 * 
 * @since 2021-04-23
 *
 */

public class Libros extends Publicaciones {

	// Atributos
	private String autor;

	// Constructor
	/**
	 * Constructor parametrizado
	 * 
	 * @param codigo   indica el codigo del libro
	 * @param añoPubli indica el año de publicación
	 * @param prestado indica el sestado (si prestado o no)
	 * @param autor    indica el autor del libro
	 */
	public Libros(int codigo, String añoPubli, boolean prestado, String autor) {
		super(codigo, añoPubli, prestado);
		this.autor = autor;
	}

	// Getters && Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	// Metodos
	/**
	 * Metodo toString() devuelve cadena de texto con todos los atributos y sus
	 * valores
	 */
	@Override
	public String toString() {
		return super.toString() + " Autor:" + autor;
	}
}
