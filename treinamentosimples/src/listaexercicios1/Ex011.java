package listaexercicios1;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		// 100KW -> 1 / 7 Salario Minimo
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do Salário Minímo: R$");
		double salario = sc.nextDouble();
		System.out.print("Quantidade de kW consumidos: ");
		double kiloWatt = sc.nextDouble();
		
		double custoKiloWatt = (salario / 7.0) / 100;
		double valorTotal = custoKiloWatt * kiloWatt;
		double totalComDesc = valorTotal - (valorTotal * 10/100);
		
		System.out.printf("Custo unitário do kW: R$%.2f\n", custoKiloWatt);
		System.out.printf("Valor total a pagar: R$%.2f\n", valorTotal);
		System.out.printf("Total a pagar com Desconto: R$%.2f",totalComDesc);
		
		sc.close();
	}

}
