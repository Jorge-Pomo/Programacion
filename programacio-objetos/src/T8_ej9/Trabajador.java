package T8_ej9;

public class Trabajador {

	//Atributos
	private String nombre;
	private String puesto;
	private String direccion;
	private int telefono;
	private int fecha_nacimiento;
	private int fecha_contrataci�n;
	private int NSS;
	
	//Constructores
	public Trabajador() {
		
	}

	public Trabajador(String nombre, String puesto, String direccion, int telefono, int fecha_nacimiento,
			int fecha_contrataci�n, int NSS) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_contrataci�n = fecha_contrataci�n;
		this.NSS = NSS;
	}
	
	//getters && setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(int fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getFecha_contrataci�n() {
		return fecha_contrataci�n;
	}

	public void setFecha_contrataci�n(int fecha_contrataci�n) {
		this.fecha_contrataci�n = fecha_contrataci�n;
	}

	public int getNSS() {
		return NSS;
	}

	public void setNSS(int nSS) {
		NSS = nSS;
	}
	
	//Metodos
	public String toString() {
		return "Nombre:" + nombre + " NSS " + NSS;
	}
	
}
