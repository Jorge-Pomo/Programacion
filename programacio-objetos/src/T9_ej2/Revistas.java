package T9_ej2;

/**
 * Ejercicio 2 Tema 9 1r DAM-PROG
 * 
 * @author Joge Pomo Ramón
 * 
 * @since 2021-04-23
 *
 */

public class Revistas extends Publicaciones {

	// Atributos
	private int numero;

	// Constructor
	/**
	 * Constructor parametrizado con todos los atributos
	 * 
	 * @param codigo   indica el codigo de la revista
	 * @param añoPubli indica el año de publicación
	 * @param prestado indica el estado del libor (prestado o no)
	 * @param numero   indica el numero de revistas que hay
	 */
	public Revistas(int codigo, String añoPubli, boolean prestado, int numero) {
		super(codigo, añoPubli, prestado);
		this.numero = numero;
	}

	// Getters && Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Metodos
	/**
	 * Metodo toString() crea una cadena de texto con todos los atributos y sus
	 * valores
	 */
	@Override
	public String toString() {
		return super.toString() + "Numero:" + numero;
	}
}
