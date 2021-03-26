package T6_ej1;

public class Coche {

	// Atributos
	private String marca;
	private String color;
	private String modelo;
	
	// Geters and Seters
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public Coche(){
		
	}
	
	public Coche(String marca, String color, String modelo) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}
}
