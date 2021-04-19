/**
 * 
 */
package T8_ej5;

/**
 * @author Jorge Pomo Ramón
 *
 */
public class Producto {

	//Atributos
	private String nombre;
	private double precio;
	
	//Constructores
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters && Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public double calcular(int cantidad) {
		return precio * cantidad;
	}
	
}
