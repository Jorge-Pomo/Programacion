package T8_ej1;

public class Empleado {

	// Atributos
	private String nombre;
	private String dni;
	private int edad;
	private boolean casado;
	private double salario;

	// Constructores
	Empleado() {
	}

	Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	// Getters && Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Metodos
	public String clasificacion() {
		String tipo = "";

		if (edad <= 18) {
			tipo = "Novato";
		} else {
			if (edad >= 19 && edad <= 25) {
				tipo = "Junior";
			} else {
				if (edad > 25) {
					tipo = "Senior";
				}
			}
		}

		return tipo;
	}

	public String mostrarDatos() {
		return nombre + " " + dni + " " + edad + " " + casado + " " + salario;
	}

	public void aumentarSueldo(double porcentaje) {
		this.salario = salario + porcentaje;
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
