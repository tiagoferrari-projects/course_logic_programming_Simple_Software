package listaexercicios2;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// numero par
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número "+ numero + " é um número PAR!!");
		}else{
			System.out.println("O número "+ numero + " NÃO é um número par!");
		}
		
		sc.close();
	}

}
