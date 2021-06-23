package listaexercicios1;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		// testes de idade
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println(nome + " você é maior de idade.");
			if(idade > 65) { 
				System.out.println("Maior de 65 anos.");
			}
		}else if (idade < 12) {
			System.out.println(nome + " você tem menos de 12 anos.");
		}else if (idade >=12) {
			System.out.println(nome + " você é menor de idade.");
		}	
		sc.close();
	}

}
