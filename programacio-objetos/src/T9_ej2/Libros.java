package T9_ej2;

/**
 * Ejercicio 2 Tema 9 1r DAM-PROG
 * 
 * @author Joge Pomo Ram�n
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
	 * @param a�oPubli indica el a�o de publicaci�n
	 * @param prestado indica el sestado (si prestado o no)
	 * @param autor    indica el autor del libro
	 */
	public Libros(int codigo, String a�oPubli, boolean prestado, String autor) {
		super(codigo, a�oPubli, prestado);
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
