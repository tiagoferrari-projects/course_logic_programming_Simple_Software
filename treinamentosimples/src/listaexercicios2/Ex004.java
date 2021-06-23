package listaexercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// formula de Baskara
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de (a): ");
		double a = sc.nextDouble();
		System.out.print("Informe o valor de (b): ");
		double b = sc.nextDouble();
		System.out.print("Informe o valor de (c): ");
		double c = sc.nextDouble();
		
		System.out.print("a = " + a + "\n");
		System.out.print("b = " + b + "\n");
		System.out.print("c = " + c + "\n");
		
		System.out.println("C�lculo do Delta");
		double delta = ((b*b) - (4.0 * a * c));
		System.out.printf("DELTA = %.2f\n", delta);

		if (a == 0) {
			System.out.println("N�o formam uma Equa��o do 2� Grau!!");
		} else if (delta == 0) {
			System.out.print("Existe uma raiz Real: ");
			double x1 = (-b) / (2.0 * a);
			System.out.printf("%.2f", x1);
		} else if (delta < 0) {
			System.out.println("N�O possui solu��o REAL!");
		} else if (delta > 0) {
			System.out.println("Existe duas ra�zes reais...");
			double x1 = ((-b) + Math.sqrt(delta)) / (2.0 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2.0 * a);

			System.out.printf("X' = %.2f\n", x1);
			System.out.printf("X'' = %.2f", x2);
		}
		
		sc.close();
	}

}
