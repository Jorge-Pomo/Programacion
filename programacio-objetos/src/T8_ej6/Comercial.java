package T8_ej6;

public class Comercial extends Empleado{

	//Atributos
	private double comision;
	
	//Constructores
	public Comercial() {
		
	}
	public Comercial(double comision, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	//Getters && Setters
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Comercial [comision=" + comision + " nombre=" + getNombre() + " edad=" + getEdad() + " salario=" + getSalario() + "]";
	}
	
	public void plus() {
		if(getEdad() > 30 && comision > 200) {
			setSalario(getSalario() + getPLUS());
		}
	}
}
