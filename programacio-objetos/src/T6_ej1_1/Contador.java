package T6_ej1_1;

public class Contador {

	private int cont;
	
	//Constructor
	public Contador() {
		
	}
	
	public Contador(int valor) {
		if(valor > 0) {
			this.cont = valor;
		}else {
			this.cont = 0;
		}
	}
	
	public Contador(Contador c) {
		this.cont = c.cont;
	}
	
	//Getters & Setters
	public void setCont(int cont) {
		this.cont = cont;
	}
	public int getCont() {
		return cont;
	}
	
	//Metodos
	public void incrementar(int incremento) {
		this.cont = cont + incremento;
	}
	
	public void decrementar(int decremento) {
		if(this.cont > decremento) {
			this.cont = cont - decremento;
		}else {
			this.cont = 0;
		}
	}
	
}
