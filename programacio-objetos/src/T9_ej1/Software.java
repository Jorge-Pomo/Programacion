package T9_ej1;

public class Software extends Producto {

	// Atributo
	private String tipo;

	// Constructores
	public Software() {

	}

	public Software(char codigo, String descripcion, String tipo) {
		super(codigo, descripcion);
		this.tipo = tipo;
	}

	// Getters && Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Metodos
	public void cambiarTipo(String nuevoTipo) {
		tipo = nuevoTipo;
	}

	@Override
	public double getPrecio() {
		double resu = 0;

		if(getCodigo() == 'B') {
			resu = Producto.B;
		}else {
			if(getCodigo() == 'C') {
				resu = Producto.C;
			}
		}

		if(tipo.equals("ProgramaJuegos")) {
			resu = (20 * resu) / 100;
		}

			return resu;
	}

}
