package listaexercicios2;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// imprimindo fatorial
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE UM NÚMERO INTEIRO: ");
		int numero = sc.nextInt(); 
		
		for(int i = numero - 1; i < 0; i--) {
			numero *= i;
			System.out.println(numero);
		}
		
		
		sc.close();
	}

}
