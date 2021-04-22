package T9_ej2;

public class Revistas extends Publicaciones{

	//Atributos
	private int numero;
	
	//Constructor
	public Revistas(int codigo, String añoPubli, boolean prestado, int numero) {
		super(codigo, añoPubli, prestado);
		this.numero = numero;
	}	
	
	//Getters && Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Metodos
	@Override
	public String toString() {
		return super.toString() + "Numero:" + numero;
	}
}
