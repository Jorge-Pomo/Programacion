/**
 * 
 */
package T8_ej5;

/**
 * @author Jorge Pomo Ramón
 *
 */
public class NoPerecedero extends Producto{

	//Atributos
	private String tipo;
	
	//Constructores
	public NoPerecedero(String tipo, String nombre, double precio) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	//Getters && Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodos
	@Override
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}
	
}
