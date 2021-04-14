package T8_ej2;

import T6_ej1.Coche;

public class ProfesorEnfermo extends Profesor{

	//Constructores
	ProfesorEnfermo(String nombre, int edad, Coche c, String despacho, String horarioTutorias) {
		super(nombre, edad, c, despacho, horarioTutorias);
	}
	
	//Metodos
	@Override
	public String getConsultas(){
		return "El profesor está enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias";
		
	}
	

}
