package T8_ej3;

public class Oficial extends Operario{

	//Constructores
	public Oficial(String nombre) {
		super(nombre);
	}

	//Metodos
	public String toString() {
		return super.toString() + " --> Oficial";
	}
}
