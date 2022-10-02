
public class Ejercicio5 {

	public static void main(String[] args) {
		int A = 1, B = 2, C = 3, D = 4;
		
		int aux = B;
		
		System.out.println("A = " + A + ", B = " + B + ", C = " + C + " y D = " + D);
		B=C;
		C=A;
		A=D;
		D=aux;
		System.out.println("Los valores actualizados son: ");
		System.out.println("A = " + A + ", B = " + B + ", C = " + C + " y D = " + D);

		

		
	}

}
