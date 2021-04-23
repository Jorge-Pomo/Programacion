package T9_ej2;

/**
 * Ejercicio 2 Tema 9 1r DAM-PROG
 * 
 * @author Joge Pomo Ram�n
 * 
 * @since 2021-04-23
 *
 */

public class Publicaciones implements Interf {

	// Atributos
	private int codigo;
	private String a�oPubli;
	private boolean prestado;

	// Consturcor
	/**
	 * Constructor por defecto con prestado = false
	 * 
	 * @param prestado indica si el libro esta prestado o en la libreria
	 */
	public Publicaciones() {
		prestado = false;
	}

	/**
	 * Constructor con 2 parametros y el parametro prestado por defecto a false
	 * 
	 * @param codigo   indica el codigo del libro
	 * @param a�oPubli indica el a�oi de publicaci�n del libro
	 */
	public Publicaciones(int codigo, String a�oPubli) {
		this.codigo = codigo;
		this.a�oPubli = a�oPubli;
		prestado = false;
	}

	/**
	 * Constructor con 3 parametros
	 * 
	 * @param codigo   indica el codigo del libro
	 * @param a�oPubli indica el a�oi de publicaci�n del libro
	 * @param prestado indica si esta prestado o no
	 */
	public Publicaciones(int codigo, String a�oPubli, boolean prestado) {
		this.codigo = codigo;
		this.a�oPubli = a�oPubli;
		this.prestado = prestado;
	}

	// Getters && Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getA�oPubli() {
		return a�oPubli;
	}

	public void setA�oPubli(String a�oPubli) {
		this.a�oPubli = a�oPubli;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	// Metodos

	/**
	 * Metodo toStrin() que convierte en cadena todo los atributos y sus valores
	 */
	public String toString() {
		return "Codigo:" + codigo + " A�o de la Publicaci�n:" + a�oPubli + " Prestado=" + prestado;
	}

	// Interface

	/**
	 * Metodo prestado() indica si el libro esta prestado
	 */
	@Override
	public boolean prestado() {
		return prestado;
	}

	/**
	 * Metodo prestar() indica si el liro esta disponible o se puede prestar. Si
	 * prestado() da true, no esta disponible, si da false si.
	 */
	@Override
	public void prestar() {
		if (prestado()) {
			System.out.println("NO esta disponible");
		} else {
			System.out.println("Si que esta disponible");
		}
	}

	/**
	 * Metodo devolver() retorna si el libro esta en el almacen o si lo han prestado
	 * Si prestado() == true el libro estara prestado, si no, estara en el almacen
	 */
	@Override
	public void devolver() {
		if (prestado()) {
			System.out.println("Lo han prestado");
		} else {
			System.out.println("El libro esta en el almacen");
		}

	}

}
