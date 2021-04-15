package T8_ej3;

public class Operario extends Empleado{

	//Constructores
	public Operario(String nombre) {
		super(nombre);
	}
	
	//Metodos
	public String toString() {
		return super.toString() + "--> Operario";
	}
	
}
