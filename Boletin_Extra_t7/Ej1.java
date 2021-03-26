package Boletin_Extra_t7;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ej1 {

	public static void main(String[] args) {
		ArrayList<String> compa=new ArrayList<String>();
		compa.add("Diego");
		compa.add("Ximo");
		compa.add("Jrge");
		compa.add("Alex");
		compa.add("Carlos");
		compa.add("Joan");
		
		for(String obj:compa) {
			System.out.println(obj);
		}
		
	}

}
