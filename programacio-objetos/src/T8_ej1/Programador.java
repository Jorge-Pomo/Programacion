package T8_ej1;

public class Programador extends Empleado {

	// Atributos
	private int lineasCodigoPorHora;
	private String lenguajeDominante;

	// Constructores
	Programador() {

	}

	Programador(int lineasCodigoPorHora, String lenguajeDominante, String nombre, String dni, int edad, boolean casado,
			double salario) {
		super(nombre, dni, edad, casado, salario);
		this.lineasCodigoPorHora = lineasCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	// Getters && Setters
	public int getLineasCodigoPorHora() {
		return lineasCodigoPorHora;
	}

	public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	// Metodos
	public String nivelProgramacion() {
		String nivel = "level 1";

		if (lineasCodigoPorHora > 500) {
			nivel = "level 3";
		} else {
			if (lineasCodigoPorHora <= 200 && lineasCodigoPorHora >= 500) {
				nivel = "level 2";
			}
		}

		return nivel;
	}
}
