package T8_ej3;

public class Directivo extends Empleado{

	//Construcotr
	public Directivo(String nombre) {
		super(nombre);
	}
	
	//Metodos
	public String toString() {
		return super.toString() + "--> Directivo";
	}
}
