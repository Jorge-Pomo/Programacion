package Boletin_Extra_t7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> orden = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Dime numro");
			orden.add(sc.nextInt());
		}
		
		Collections.sort(orden);
		
		for(int obj:orden) {
			System.out.println(obj);
		}
	}

}
