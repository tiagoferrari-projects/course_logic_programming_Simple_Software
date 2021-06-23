package listaexercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Quantidade de Filmes");
		int quantidadeFilmes = sc.nextInt();
		System.out.println("Valor da Locação");
		double valorLocacao = sc.nextDouble();
		
		double faturamentoAnual = valorLocacao * ((double)quantidadeFilmes / 3.0 ) * 12.0;
		double multa = valorLocacao * 0.1;
		double qtdeDevolvidaMes = quantidadeFilmes * 0.1;
		double ganhoComMulta = multa * qtdeDevolvidaMes;
		double videosPerca = quantidadeFilmes * 0.02;
		double videosRepo = videosPerca * 0.1;
		double quantidadeFinalVideos = (quantidadeFilmes - videosPerca) + videosRepo; 
		
		System.out.printf("Faturamento Anual: R$%.2f", faturamentoAnual);
		System.out.printf("\nGanho com Multas por mês: R$%.2f", ganhoComMulta);
		System.out.println("\nQuantidade total de Vídeos: " + (int)quantidadeFinalVideos);
		
		sc.close();
	}

}
