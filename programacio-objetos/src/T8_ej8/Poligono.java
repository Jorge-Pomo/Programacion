package T8_ej8;

public abstract class Poligono {

	//Atributos
	private int numLados;
	
	//Constructore
	public Poligono() {
		
	}
	public Poligono(int numLados) {
		this.numLados = numLados;
	}
	
	//getters && setters
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "El Polígono tiene " + numLados + " lados";
	}
	
	public abstract double per();
}
