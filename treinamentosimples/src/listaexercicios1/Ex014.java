package listaexercicios1;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nome e idade para esolha de plano de sa�de
		
		System.out.println("--------------------------------");
		System.out.println("TABELA PLANO DE SA�DE");
		System.out.println("--------------------------------\n"
				+ "[Faixa 01] At� 10 anos - R$30.00\n"
				+ "[Faixa 02] Acima de 10 anos at� 29 anos - R$60.00\n"
				+ "[Faixa 03] Acima de 29 anos at� 45 anos - R$120.00\n"
				+ "[Faixa 04] Acima de 45 anos at� 59 anos - R$150.00\n"
				+ "[Faixa 05] Acima de 59 anos at� 65 anos - R$250.00\n"
				+ "[Faixa 06] Acima de 65 anos - R$400.00");
		
		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();
		System.out.println("Quantos anos voc� tem?");
		int idade = sc.nextInt();
		
		if(idade <= 10) {
			System.out.println(nome + ", seu Plano de Sa�de custar� R$30.00/m�s.");
		}else if (idade <= 29) {
			System.out.println(nome + ", seu Plano de Sa�de custar� R$60.00/m�s.");
		}else if (idade <= 45) {
			System.out.println(nome + ", seu plano de sa�de custar� R$120.00/m�s.");
		}else if (idade <= 59) {
			System.out.println(nome + ", seu plano de sa�de custar� R$150.00/m�s.");
		}else if (idade <= 65) {
			System.out.println(nome + ", seu plano de sa�de custar� R$250.00/m�s.");
		}else {
			System.out.println(nome + ", seu plano de sa�de custar� R$400.00/m�s.");
		}
		
		
		sc.close();
	}

}
