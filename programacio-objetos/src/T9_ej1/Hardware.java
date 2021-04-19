package T9_ej1;

public class Hardware extends Producto {

	// Atributo
	private boolean periferico;

	// Constructores
	public Hardware() {

	}

	public Hardware(char codigo, String descripcion, boolean periferico) {
		super(codigo, descripcion);
		this.periferico = periferico;
	}
	
	//Getters && Setters
	public boolean isPeriferico() {
		return periferico;
	}

	public void setPeriferico(boolean periferico) {
		this.periferico = periferico;
	}
	
	//Metodos
	public void cambiarPeriferico(boolean nuevoPeriferico) {
		periferico = nuevoPeriferico;
	}
	
	@Override
	public double getPrecio() {
		double resu = 0;

		if(getCodigo() == 'A') {
			resu = Producto.A;
		}else {
			if(getCodigo() == 'B') {
				resu = Producto.B;
			}
		}
		
		if(periferico == true) {
			resu = (10 * resu) / 100;
		}
		
		return resu;
	}

}
