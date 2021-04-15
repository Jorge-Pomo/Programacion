package T9_ej0;

import T6_ej1.Coche;

public abstract class MiembroUPV extends Persona{

	//Atributos
	private String carnet;
	
	//Constructor
	public MiembroUPV() {
		
	}
	
	public MiembroUPV(String carnet, String nombre, int edad, Coche c) {
		super(nombre, edad, c);
		this.carnet = carnet;
	}
	
	//Getters && Setters
	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	//Metodos
	public abstract void menuIntranet();
}
