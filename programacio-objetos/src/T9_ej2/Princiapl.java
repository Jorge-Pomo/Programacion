package T9_ej2;

/**
 * Ejercicio 2 Tema 9 1r DAM-PROG
 * 
 * @author Joge Pomo Ramón
 * 
 * @since 2021-04-23
 *
 */

public class Princiapl {

	public static void main(String[] args) {
		/**
		 * Array de 4 objetos, 2revistas y 2libros
		 */
		Publicaciones[] publi = new Publicaciones[4];

		publi[0] = new Revistas(0001, "2021", true, 7);
		publi[1] = new Revistas(0002, "2020", false, 4);

		publi[2] = new Libros(0003, "2019", true, "Diego");
		publi[3] = new Libros(0004, "2019", false, "Jorge");

		/**
		 * Llamamos al metodo toString() de todos los objetos del array
		 */
		for (int i = 0; i < publi.length; i++) {
			System.out.println(publi[i].toString());
		}

		// Mostramos el metodo devolver tanto de revista y de libro, con las dos
		// posibilidades
		publi[0].devolver();
		publi[3].devolver();

		// Mostramos el metodo prestar tanto de revista como de libro, con las dos
		// posibilidades
		publi[1].prestar();
		publi[2].prestar();
	}

}
