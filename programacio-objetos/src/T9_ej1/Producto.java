package T9_ej1;

public abstract class Producto implements IPrecios{

	// Atributos
	private char codigo;
	private String descripcion;

	// Constructores
	public Producto() {
		
	}
	public Producto(char codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	// Getters && Setters
	public char getCodigo() {
		return codigo;
	}

	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Metodos
	public void cambiarCodigo(char nuevoCodigo) {
		codigo = nuevoCodigo;
	}
	public void cambiarDescripcion(String nuevaDescripcion) {
		descripcion = nuevaDescripcion;
	}

}
