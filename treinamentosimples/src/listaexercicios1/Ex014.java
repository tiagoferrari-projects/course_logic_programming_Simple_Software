package listaexercicios1;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nome e idade para esolha de plano de saúde
		
		System.out.println("--------------------------------");
		System.out.println("TABELA PLANO DE SAÚDE");
		System.out.println("--------------------------------\n"
				+ "[Faixa 01] Até 10 anos - R$30.00\n"
				+ "[Faixa 02] Acima de 10 anos até 29 anos - R$60.00\n"
				+ "[Faixa 03] Acima de 29 anos até 45 anos - R$120.00\n"
				+ "[Faixa 04] Acima de 45 anos até 59 anos - R$150.00\n"
				+ "[Faixa 05] Acima de 59 anos até 65 anos - R$250.00\n"
				+ "[Faixa 06] Acima de 65 anos - R$400.00");
		
		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();
		System.out.println("Quantos anos você tem?");
		int idade = sc.nextInt();
		
		if(idade <= 10) {
			System.out.println(nome + ", seu Plano de Saúde custará R$30.00/mês.");
		}else if (idade <= 29) {
			System.out.println(nome + ", seu Plano de Saúde custará R$60.00/mês.");
		}else if (idade <= 45) {
			System.out.println(nome + ", seu plano de saúde custará R$120.00/mês.");
		}else if (idade <= 59) {
			System.out.println(nome + ", seu plano de saúde custará R$150.00/mês.");
		}else if (idade <= 65) {
			System.out.println(nome + ", seu plano de saúde custará R$250.00/mês.");
		}else {
			System.out.println(nome + ", seu plano de saúde custará R$400.00/mês.");
		}
		
		
		sc.close();
	}

}
