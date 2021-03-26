package T6_ej8;

import java.util.Scanner;

public class DNI {

	//Atributos
	private int num;
	private char let;
	
	//Constructores
	public DNI(){
		
	}
	public DNI(int num) {
		this.num = num;
		letraNif();
	}
	
	//Getters & Setters
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
	public void setLet(char let) {
		this.let = let;
	}
	public char getLet() {
		return let;
	}
	
	//Metodos
	public void leer() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el numero del DNI:");
		this.num = sc.nextInt();
		
		letraNif();
	}
	
	public String toString() {
		String resu = "";
		
		resu=this.num +"-"+this.let+"";
		
		return resu;
	}
	
	private void letraNif() {
		int let = 0;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		let = this.num % 23;
		this.let = letras.charAt(let);
	}
}
