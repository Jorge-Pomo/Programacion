package proves;

public class condi {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		
		//Condicional 1
		if(x>y) {
			System.out.println("X es mayor");
		}else {
			System.out.println("Y es mayor");
		}
		
		//Condicional 2
		System.out.println((x > y)? "X es mayor" : "Y es mayor");
		

	}

}
