package T6_ej5;

import java.util.Scanner;

public class Hora {

	// Atributos
	private String horas;
	private String minutos;
	private String segundos;

	// Constructor
	public Hora() {
		this.horas = "00";
		this.minutos = "00";
		this.segundos = "00";
	}

	public Hora(String horas, String minutos, String segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	// Getters & Setters
	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getHoras() {
		return horas + ":";
	}

	public void setminutos(String minutos) {
		this.minutos = minutos;
	}

	public String getminutos() {
		return minutos + ":";
	}

	public void setsegundos(String segundos) {
		this.segundos = segundos;
	}

	public String getsegundos() {
		return segundos;
	}

	// Metodos
	public void leer() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime las horas:");
		this.horas = sc.nextLine();
		
		System.out.println("Dime los minutos:");
		this.minutos = sc.nextLine();
		
		System.out.println("Dime segundos:");
		this.segundos = sc.nextLine();
		
		valida();
	}	
	
	private void valida() {
		int horas;
		int minutos;
		int segundos;
		
		horas = Integer.parseInt(this.horas);
		minutos = Integer.parseInt(this.minutos);
		segundos = Integer.parseInt(this.segundos);
		
		if(Integer.parseInt(this.segundos) > 60 || Integer.parseInt(this.segundos) < 0) {
			segundos = segundos / 60;
			this.segundos = String.valueOf(segundos);
		}
		if(Integer.parseInt(this.minutos) > 60 || Integer.parseInt(this.minutos) < 0) {
			minutos = minutos / 60;
			this.minutos = String.valueOf(minutos);
		}
		if(Integer.parseInt(this.horas) > 12 || Integer.parseInt(this.horas) < 0) {
			horas = horas / 12;
			this.horas = String.valueOf(horas);
		}
	}
	
	public int aSegundos() {
		int horas;
		int minutos;
		int segundos;

		int resu = 0;

		horas = Integer.parseInt(this.horas);
		minutos = Integer.parseInt(this.minutos);
		segundos = Integer.parseInt(this.segundos);

		horas = 12 - horas;
		minutos = 60 - minutos;
		segundos = 60 - segundos;

		resu = horas * 3600;
		resu = resu + minutos * 60;
		resu = resu + segundos;

		return resu;
	}

	public String deSegundos(int nSegundos) {
		String resu = "";

		int horas = 0;
		int minutos = 0;
		int segundos = 0;

		while (nSegundos != 0) {
			if (nSegundos > 3600) {
				nSegundos = nSegundos - 3600;
				horas++;
			} else {
				if (nSegundos >= 60) {
					nSegundos = nSegundos - 60;
					minutos++;
				} else {
					segundos = nSegundos;
				}
			}
		}

		horas = horas + Integer.parseInt(this.horas);
		minutos = minutos + Integer.parseInt(this.minutos);
		segundos = segundos + Integer.parseInt(this.segundos);

		if (segundos > 60) {
			minutos = minutos + (segundos / 60);
			segundos = segundos % 60;
		}
		if (minutos > 60) {
			horas = horas + (minutos / 60);
			minutos = minutos % 60;
		}
		if (horas > 12) {
			horas = 12 - horas;
		}

		resu = horas + ":" + minutos + ":" + segundos;

		return resu;
	}

	public int segundosDesde(int hora) {
		int resu = 0;

		int horas = 0;
		int minutos = 0;
		int segundos = 0;

		if (hora > Integer.parseInt(this.horas)) {
			horas = hora - Integer.parseInt(this.horas);
		} else {
			horas = Integer.parseInt(this.horas) - hora;
		}
		minutos = 60 - Integer.parseInt(this.minutos);
		segundos = 60 - Integer.parseInt(this.segundos);

		resu = (horas * 3600) + (minutos * 60) + segundos;
		return resu;
	}

	public String siguiente() {
		String resu = "";

		int horas = Integer.parseInt(this.horas);
		int minutos = Integer.parseInt(this.minutos);
		int segundos = Integer.parseInt(this.segundos);

		segundos++;
		if (segundos >= 60) {
			segundos = 0;
			minutos++;
		}
		if (minutos >= 60) {
			minutos = 0;
			horas++;
		}

		resu = horas + ":" + minutos + ":" + segundos;
		return resu;
	}

	public String anterior() {
		String resu = "";

		int horas = Integer.parseInt(this.horas);
		int minutos = Integer.parseInt(this.minutos);
		int segundos = Integer.parseInt(this.segundos);

		segundos--;

		if (segundos < 0) {
			segundos = 59;
			minutos--;
		}
		if (minutos < 0) {
			minutos = 59;
			horas--;
		}

		resu = horas + ":" + minutos + ":" + segundos;
		return resu;
	}

	public Hora copia() {
		return this;
	}
	
	public boolean igualQue(int hora, int minuto, int segundo) {
		boolean resu = false;
		
		if(hora == Integer.parseInt(this.horas) && minuto == Integer.parseInt(this.minutos) && segundo == Integer.parseInt(this.segundos)) {
			resu = true;
		}
		
		return resu;
	}
	
	public String menorQue(int hora, int minuto, int segundo) {
		String resu = "No";
		
		if(hora < Integer.parseInt(this.horas)) {
			resu = "Si";
		}
		if(hora == Integer.parseInt(this.horas) && minuto < Integer.parseInt(this.minutos)) {
			resu = "Si";
		}
		if(hora == Integer.parseInt(this.horas) && minuto == Integer.parseInt(this.minutos) && segundo < Integer.parseInt(this.segundos)) {
			resu = "Si";
		}
		
		return resu;
	}
	
	public String mayorQue(int hora, int minuto, int segundo) {
		String resu = "No";
		
		if(hora > Integer.parseInt(this.horas)) {
			resu = "Si";
		}
		if(hora == Integer.parseInt(this.horas) && minuto > Integer.parseInt(this.minutos)) {
			resu = "Si";
		}
		if(hora == Integer.parseInt(this.horas) && minuto == Integer.parseInt(this.minutos) && segundo > Integer.parseInt(this.segundos)) {
			resu = "Si";
		}
		
		return resu;
	}
	
}
