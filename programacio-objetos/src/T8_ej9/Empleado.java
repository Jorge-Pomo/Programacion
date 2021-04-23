package T8_ej9;

import java.text.DecimalFormat;

public class Empleado extends Trabajador {

	// Atributos
	private int sueldo;
	private double impuestos = 0.3 * sueldo;
	private static final int nPAGAS = 14;

	DecimalFormat formato1 = new DecimalFormat("#.00");

	// Constructores
	public Empleado() {

	}

	public Empleado(String nombre, String puesto, String direccion, int telefono, int fecha_nacimiento,
			int fecha_contratación, int NSS, int sueldo) {
		super(nombre, puesto, direccion, telefono, fecha_nacimiento, fecha_contratación, NSS);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	// getters && setters
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	// Metodos
	private double calcularPaga() {
		return (sueldo - impuestos) / nPAGAS;
	}

	public String toString() {
		return "Empleado " + super.toString() + " . Salario:" + formato1.format(calcularPaga());
	}

}
