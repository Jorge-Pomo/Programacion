/**
 * 
 */
package T8_ej5;

/**
 * @author Jorge Pomo Ramón
 *
 */
public class Perecedero extends Producto {

	// Atributos
	private int diasACaducar;

	// Constructores
	public Perecedero(int diasACaducar, String nombre, double precio) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	// Getters && Setters
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	// Metodos
	@Override
	public double calcular(int cantidad) {
		double resu = super.calcular(cantidad);

		if (diasACaducar == 1) {
			resu = super.calcular(cantidad) / 4;
		} else {
			if (diasACaducar == 2) {
				resu = super.calcular(cantidad) / 3;
			} else {
				if (diasACaducar == 3) {
					resu = super.calcular(cantidad) / 2;
				}
			}
		}
		return resu;
	}
}
