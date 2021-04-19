package T8_ej6;

public abstract class Empleado {

	//Atributos
	private String nombre;
	private int edad;
	private double salario;
	
	private final int PLUS = 500;
	
	//Constructores
	public Empleado() {
		
	}
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	//Getters && Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getPLUS() {
		return PLUS;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS + "]";
	}
}
