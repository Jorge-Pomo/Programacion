package T6_ej3;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	// Constructor
	public Fecha() {

	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public void setAño(int año) {
		this.año = año;
	}

	public int getAño() {
		return año;
	}

	// Metodos
	private boolean esBisiesto() {
		boolean resu = false;

		if (this.año % 4 == 0) {
			resu = true;
		}else{
			if(this.año % 100 == 0 || this.año % 400 == 0) {
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
					this.año = año + 1;
				}
			}
		}

	}
}
