/*

Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int,
una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.

A continuación muestra por pantalla:

	El valor de cada variable.
	
	La suma de N + A
	La diferencia de A - N
	el valor numérico correspondiente al carácter que contiene la variable C.

*/

public class Ejercicio2 {

	public static void main(String[] args) {
		int N = 5;
		double A = 4.56;
		char C = 'a';
		int aux = C;
		System.out.println("Variable N: " + N);
		System.out.println("Variable A: " + A);
		System.out.println("Variable C: " + C);
		System.out.println("Suma de N + A: " + (A+N));
		System.out.println("Diferencia de A - N: " + (A-N));
		System.out.println("Valor numerico de C: " + aux);

	}

}
