package T8_ej4;

/**
*
* Ejercicio 4 Tema 8 – Herencia
* 1r DAM-PROG
* 
* @author Jorge Pomo Ramón
* 
* @since 2021-04-14 
* 
*/

public class Television extends Electrodomesticos {

	// Atributos
	private int resolucion;
	private boolean smartTV;

	// Constructor
	/**
	 * Constructor que inicializa los atributos por defecto
	 * @param resolucion la resolucion por defecto sera de 20
	 * @param smartTV el smartTV por defecto sera false
	 */
	public Television() {
		resolucion = 20;
		smartTV = false;
	}

	/**
	 * Constructor que inicializa los atributos por defecto
	 * @param precioBase inicializa el precio por defecto
	 * @param peso inicializa el peso por defecto
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.smartTV = false;
	}

	/**
	 * Constructor inicializado por el usuario
	 * @param precioBase El usuario indica el precio base
	 * @param peso El usuario indica el peso
	 * @param color El usuario indica el color
	 * @param consumoElectrico El usuario indica el consumo
	 * @param resolucion El usuario indica la resolucion
	 * @param smartTV El usuario indica si es smartTV
	 */
	public Television(int precioBase, int peso, String color, char consumoElectrico, int resolucion, boolean smartTV) {
		super(precioBase, peso, color, consumoElectrico);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}

	// Getters && Setters
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	//Metodos
	/**
	 * Metodo que indica el precio final de la television
	 * @return
	 * <ul>
	 * 	<li>Si la resolucion es mayor de 40, precioFinal * 0.3 + preciofinal</li>
	 * 	<li>Si la TV es smartTV, precioFinal + 50</li>
	 *</ul>
	 */
	@Override
	public double precioFinal() {
		double resu = super.precioFinal();
		
		if(resolucion > 40) {
			resu = resu * 0.3 + resu; 
		}
		
		if(smartTV = true) {
			resu = resu + 50;
		}
		
		return resu;
	}
}
