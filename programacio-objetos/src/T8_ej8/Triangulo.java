package T8_ej8;

public class Triangulo extends Poligono{

	//Atributos
	private double lado1;
	private double lado2;
	private double lado3;
	
	//Constructores
	public Triangulo() {
		
	}
	public Triangulo(double lado1, double lado2, double lado3, int numLados) {
		super(numLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	//Metodos
	@Override
	public double per() {
		return lado1+lado2+lado3;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n-- Es un triángulo, sus lados son: " + lado1 + " X " + lado2 + " X " + lado3 + "\n-- Perímetro del triángulo:" + per();
	}
}
