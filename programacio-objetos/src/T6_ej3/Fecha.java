package T6_ej3;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;

	// Constructor
	public Fecha() {

	}

	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	// Setters & Getters
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getA�o() {
		return a�o;
	}

	// Metodos
	private boolean esBisiesto() {
		boolean resu = false;

		if (this.a�o % 4 == 0) {
			resu = true;
		}else{
			if(this.a�o % 100 == 0 || this.a�o % 400 == 0) {
				resu = true;
			}
		}
		return resu;
	}

	public boolean fechaCorrecta() {
		boolean resu = false;

		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
				|| this.mes == 12) {
			if (this.dia <= 31) {
				resu = true;
			}
		}
		if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
			if (this.dia <= 30) {
				resu = true;
			}
		}
		if (this.mes == 2) {
			if (esBisiesto() == true) {
				if (this.dia <= 29) {
					resu = true;
				}
			} else {
				if (this.dia <= 28) {
					resu = true;
				}
			}
		}

		return resu;
	}

	public void diaSiguiente() {
		if (fechaCorrecta() == true) {
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10) {
				if (this.dia == 31) {
					this.dia = 1;
					this.mes = mes + 1;
				}
			}
			if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
				if (this.dia == 30) {
					this.dia = 1;
					this.mes = mes + 1;
				}
			}
			if (this.mes == 2) {
				if (esBisiesto() == true) {
					if (this.dia == 29) {
						this.dia = 1;
						this.mes = mes + 1;
					}
				} else {
					if (this.dia == 28) {
						this.dia = 1;
						this.mes = mes + 1;
					}
				}
			}

			if (this.mes == 12) {
				if (this.dia == 31) {
					this.dia = 1;
					this.mes = 1;
					this.a�o = a�o + 1;
				}
			}
		}

	}
}
