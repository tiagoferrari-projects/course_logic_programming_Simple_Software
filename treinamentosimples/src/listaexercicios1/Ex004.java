package listaexercicios1;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ler 3 notas - informar nota maior e se foi a primeira, segunda ou terceira
		
		System.out.print("Informe a 1ª Nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("\nInforme a 2ª Nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("\nInforme a 3ª Nota: ");
		double nota3 = sc.nextDouble();
		
		if(nota1 > nota2 & nota1 > nota3) {
			System.out.println("A 1ª Nota é " + nota1 + " , também é a MAIOR!");
		}else if(nota2 > nota1 & nota2 > nota3) {
			System.out.println("A 2ª Nota é " + nota2 + " , também é a MAIOR!");
		}else if(nota3 > nota2 & nota3 > nota1) {
			System.out.println("A 3ª Nota é " + nota3 + " , também é a MAIOR!");
		}
		
		sc.close();

	}

}
