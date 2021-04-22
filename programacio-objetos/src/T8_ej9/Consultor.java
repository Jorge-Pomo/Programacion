package T8_ej9;

public class Consultor extends Trabajador {

	// Atributos
	private int horas;
	private int tarifa;

	// Constructores
	public Consultor() {

	}

	public Consultor(String nombre, String puesto, String direccion, int telefono, int fecha_nacimiento,
			int fecha_contratación, int NSS, int horas, int tarifa) {
		super(nombre, puesto, direccion, telefono, fecha_nacimiento, fecha_contratación, NSS);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	// getters && setters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	// Metodos
	private double calcularPaga() {
		return horas * tarifa;
	}
	
	@Override
	public String toString() {
		return "Consultor " + super.toString() + " . Salario:" + calcularPaga() + " €";
	}
}
