package listaexercicios1;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ler 3 notas - informar nota maior e se foi a primeira, segunda ou terceira
		
		System.out.print("Informe a 1� Nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("\nInforme a 2� Nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("\nInforme a 3� Nota: ");
		double nota3 = sc.nextDouble();
		
		if(nota1 > nota2 & nota1 > nota3) {
			System.out.println("A 1� Nota � " + nota1 + " , tamb�m � a MAIOR!");
		}else if(nota2 > nota1 & nota2 > nota3) {
			System.out.println("A 2� Nota � " + nota2 + " , tamb�m � a MAIOR!");
		}else if(nota3 > nota2 & nota3 > nota1) {
			System.out.println("A 3� Nota � " + nota3 + " , tamb�m � a MAIOR!");
		}
		
		sc.close();

	}

}
