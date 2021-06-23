package listaexercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// calculo de aluno aprovado, reprovado, realizar prova final
		
		// entrada das notas
		System.out.print("Digite a Primeira Nota do Aluno: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a Segunda Nota do Aluno: ");
		double nota2 = sc.nextDouble();
		System.out.print("Digite a Terceira Nota do Aluno: ");
		double nota3 = sc.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3) / 3.0;
		
		if(mediaFinal > 6.0) {
			System.out.printf("Média Final: %.2f\n", mediaFinal);
			System.out.println("ALUNO APROVADO!");
		}else if(mediaFinal <= 6.0 & mediaFinal >= 4.0) {
			System.out.printf("Média Final: %.2f\n", mediaFinal);
			System.out.println("ALUNO SUBMETIDO À PROVA FINAL!");
		}else {
			System.out.printf("Média Final: %.2f\n",mediaFinal);
			System.out.println("ALUNO REPROVADO!");
		}
		
		
		sc.close();

	}

}
