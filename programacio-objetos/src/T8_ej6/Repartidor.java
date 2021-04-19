package T8_ej6;

public class Repartidor extends Empleado{

	//Atributos
	private String zona;
	
	//Constructor
	public Repartidor() {
		
	}
	public Repartidor(String zona, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	//Getters && Setters
	public String getComision() {
		return zona;
	}
	public void setComision(String zona) {
		this.zona = zona;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + " nombre=" + getNombre() + " edad=" + getEdad() + " salario=" + getSalario() + "]";
	}
	
	public void plus() {
		if(getEdad() < 25 && zona.equals("zona 3")) {
			setSalario(getSalario() + getPLUS());
		}
	}
	
	
}
