package listaexercicios1;

import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// quantidade de litros para uma viagem
		
		System.out.print("Tempo gasto na viagem (em horas): ");
		double tempo = sc.nextDouble();
		System.out.print("Velocidade média(Km / h): ");
		double velocidade = sc.nextDouble();
		
		double distancia = tempo * velocidade;
		double litrosUsados = distancia / 12.0;
		
		System.out.printf("Será necessário %.2fL para a viagem.", litrosUsados);
		
		sc.close();
	}

}
