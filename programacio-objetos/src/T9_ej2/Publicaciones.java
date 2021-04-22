package T9_ej2;

public class Publicaciones implements Interf{

	//Atributos
	private int codigo;
	private String a�oPubli;
	private boolean prestado;
	
	//Consturcor
	public Publicaciones() {
		prestado = false;
	}
	
	public Publicaciones(int codigo, String a�oPubli) {
		this.codigo = codigo;
		this.a�oPubli = a�oPubli;
		prestado = false;
	}
	
	public Publicaciones(int codigo, String a�oPubli, boolean prestado) {
		this.codigo = codigo;
		this.a�oPubli = a�oPubli;
		this.prestado = prestado;
	}
	
	//Getters && Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getA�oPubli() {
		return a�oPubli;
	}

	public void setA�oPubli(String a�oPubli) {
		this.a�oPubli = a�oPubli;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//Metodos
	public String toString() {
		return "Codigo:" + codigo + " A�o de la Publicaci�n:" + a�oPubli + " Prestado=" + prestado;
	}

		//Interface
	@Override
	public boolean prestado() {
		boolean resu = false;
		if(prestado) {
			resu = true;
		}
		return resu;
	}

	@Override
	public void prestar() {
		if(prestado()) {
			System.out.println("NO esta disponible");
		}else {
			System.out.println("Si que esta disponible");
		}
	}

	@Override
	public void devolver() {
		if(prestado()) {
			System.out.println("El libro esta en el almacen");
		}else {
			System.out.println("Lo han prestado");
		}
		
	}
	
}
