package T8_ej8;

public class Rectangulo extends Poligono {

	// Atributos
	private double lado1;
	private double lado2;

	// Constructores
	public Rectangulo() {

	}

	public Rectangulo(double lado1, double lado2, int numLados) {
		super(numLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//getters && setters
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	//Metodos
	@Override
	public double per() {
		return lado1+lado2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n-- Es un rectángulo, sus lados son: " + lado1 + " X " + lado2 + "\n-- Perímetro del rectángulo:" + per();
	}
}
