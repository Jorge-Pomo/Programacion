package T8_ej3;

public class Tecnico extends Operario{

	//Constructor
	public Tecnico(String nombre) {
		super(nombre);
	}

	//Metodos
	public String toString() {
		return super.toString() + " --> Tecnico ";
	}
}
