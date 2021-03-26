package T6_ej9;

public class RegistroMes {

	//Atributos
	private String nombreMes;
	private int a�o;
	private Temperaturas temperaturas;
	
	//Constructores
	public RegistroMes() {
	}
	
	public RegistroMes(String nombreMes, int a�o, Temperaturas temperaturas) {
		this.nombreMes = nombreMes;
		this.a�o = a�o;
		this.temperaturas = temperaturas;
	}
	
	//Getters && Setters
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	public String getNombreMes() {
		return nombreMes;
	}
	
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public int getA�o() {
		return a�o;
	}
	
	public void setTemperaturas(Temperaturas temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	public Temperaturas getTemperaturas() {
		return temperaturas;
	}
	
	//Metodos
	public void tooString() {
		System.out.println("Registro de temperaturas del mes "+ this.nombreMes +" del a�o " + this.a�o);
		System.out.println("-------- Temperaturas --------");
		temperaturas.mostrar();
		System.out.println("-- Temperatura media:" + temperaturas.media());
		System.out.println("-- Temperatura m�xima:" + temperaturas.maxima() + ", Temperatura minima:" + temperaturas.minima());
	}
}
