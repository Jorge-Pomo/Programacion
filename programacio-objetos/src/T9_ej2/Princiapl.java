package T9_ej2;

public class Princiapl {

	public static void main(String[] args) {
		Publicaciones[] publi = new Publicaciones[4];
		
		publi[0] = new Revistas(0001, "2021", true, 7);
		publi[1] = new Revistas(0002, "2020", false, 4);
		
		publi[2] = new Libros(0003, "2019", true, "Diego");
		publi[3] = new Libros(0004, "2019", false, "Jorge");
		
		for (int i = 0; i < publi.length; i++) {
			System.out.println(publi[i].toString());
		}
		
		publi[0].devolver();
		publi[1].devolver();
		
		publi[2].prestar();
		publi[3].prestar();
	}

}
