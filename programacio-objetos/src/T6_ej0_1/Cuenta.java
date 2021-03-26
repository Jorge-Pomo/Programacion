package T6_ej0_1;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	// Constructor
	public Cuenta() {

	}

	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
	}

	public Cuenta(Cuenta c) {
		this.nombre = c.nombre;
		this.numeroCuenta = c.numeroCuenta;
		this.saldo = c.saldo;
		this.tipoInteres = c.tipoInteres;
	}

	// Geters y Seters
	// Nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// NumeroCuenta
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	// TipoInteres
	public void setTipoInteres(double TipoInteres) {
		this.tipoInteres = TipoInteres;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	// Saldo
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	// Metodos
	public boolean ingreso(double ingreso) {
		boolean resu = false;

		if (ingreso > 0) {
			this.saldo = saldo + ingreso;
			resu = true;
		} else {
			resu = false;
		}

		return resu;
	}

	public boolean reintegro(double reintegro) {
		boolean resu = false;

		if (this.saldo - reintegro >= 0) {
			this.saldo = saldo - reintegro;
			resu = true;
		} else {
			resu = false;
		}

		return resu;
	}

	public double transferencia(Cuenta c, double importe) {
		if (this.saldo >= importe) {
			this.saldo = saldo - importe;
			c.saldo = c.saldo + importe;
		}
		return importe;
	}
}
