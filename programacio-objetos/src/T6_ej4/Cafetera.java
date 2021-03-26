package T6_ej4;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	//Constructors
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	public Cafetera(int capMax) {
		this.capacidadMaxima = capMax;
	}
	
	public Cafetera(int capMax, int capAct) {
		this.capacidadMaxima = capMax;
		this.cantidadActual = capAct;
		
		if(this.cantidadActual > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		}
	}
	
	//Getters & Setters
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	
	//Metodos
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int servir) {
		if(servir >= this.cantidadActual) {
			this.cantidadActual = 0;
		}else {
			this.cantidadActual = cantidadActual - servir;
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int agregar) {
		this.cantidadActual = cantidadActual + agregar;
	}
	
	
}
