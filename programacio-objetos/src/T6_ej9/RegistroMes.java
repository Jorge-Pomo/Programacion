package T6_ej9;

public class RegistroMes {

	//Atributos
	private String nombreMes;
	private int año;
	private Temperaturas temperaturas;
	
	//Constructores
	public RegistroMes() {
	}
	
	public RegistroMes(String nombreMes, int año, Temperaturas temperaturas) {
		this.nombreMes = nombreMes;
		this.año = año;
		this.temperaturas = temperaturas;
	}
	
	//Getters && Setters
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	public String getNombreMes() {
		return nombreMes;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	public int getAño() {
		return año;
	}
	
	public void setTemperaturas(Temperaturas temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	public Temperaturas getTemperaturas() {
		return temperaturas;
	}
	
	//Metodos
	public void tooString() {
		System.out.println("Registro de temperaturas del mes "+ this.nombreMes +" del año " + this.año);
		System.out.println("-------- Temperaturas --------");
		temperaturas.mostrar();
		System.out.println("-- Temperatura media:" + temperaturas.media());
		System.out.println("-- Temperatura máxima:" + temperaturas.maxima() + ", Temperatura minima:" + temperaturas.minima());
	}
}
