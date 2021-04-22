package T9_ej2;

public class Publicaciones implements Interf{

	//Atributos
	private int codigo;
	private String añoPubli;
	private boolean prestado;
	
	//Consturcor
	public Publicaciones() {
		prestado = false;
	}
	
	public Publicaciones(int codigo, String añoPubli) {
		this.codigo = codigo;
		this.añoPubli = añoPubli;
		prestado = false;
	}
	
	public Publicaciones(int codigo, String añoPubli, boolean prestado) {
		this.codigo = codigo;
		this.añoPubli = añoPubli;
		this.prestado = prestado;
	}
	
	//Getters && Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAñoPubli() {
		return añoPubli;
	}

	public void setAñoPubli(String añoPubli) {
		this.añoPubli = añoPubli;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//Metodos
	public String toString() {
		return "Codigo:" + codigo + " Año de la Publicación:" + añoPubli + " Prestado=" + prestado;
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
