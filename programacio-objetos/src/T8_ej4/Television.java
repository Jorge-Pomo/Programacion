package T8_ej4;

/**
*
* @autor: Jorge Pomo Ramón
* Ejercicio 4 Tema 8 – Herencia
* 1r DAM-PROG
* 
*/

public class Television extends Electrodomesticos {

	// Atributos
	private int resolucion;
	private boolean smartTV;

	// Constructor
	public Television() {
		resolucion = 20;
		smartTV = false;
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.smartTV = false;
	}

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
