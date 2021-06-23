package listaexercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// calculo salario  e desconto INSS
		// entradas da dados
		System.out.print("Informar o valor do s�lario/hora do Funcion�rio: R$");
		double salarioHora = sc.nextDouble();
		System.out.print("Informar horas trabalhas no m�s: ");
		int horasTrab = sc.nextInt();
		
		// calculo salario bruto
		double salarioBruto = salarioHora * horasTrab;
		
		// calculo do INSS (nao progressivo) conforme o valor do salario bruto
		if(salarioBruto <= 1100.00 ) {
			double salarioLiquido = salarioBruto - (salarioBruto * (7.5 / 100)); // al�quota de 7.5%
			System.out.print("S�lario Bruto R$" + salarioBruto);
			System.out.print("\nSal�rio L�quido R$" + salarioLiquido);
		} else if(salarioBruto <=2203.48) {
			double salarioLiquido = salarioBruto - (salarioBruto * (9.0/100)); // al�quota de 9%
			System.out.print("S�lario Bruto R$" + salarioBruto);
			System.out.print("\nSal�rio L�quido R$" + salarioLiquido);
		} else if(salarioBruto <=3305.22) {
			double salarioLiquido = salarioBruto - (salarioBruto * (12.0/100)); // al�quota de 12%
			System.out.print("S�lario Bruto R$" + salarioBruto);
			System.out.print("\nSal�rio L�quido R$" + salarioLiquido);
		} else if(salarioBruto <= 6433.57) {
			double salarioLiquido = salarioBruto - (salarioBruto * (14.0/100)); // al�quota de 14%
			System.out.print("S�lario Bruto R$" + salarioBruto);
			System.out.print("\nSal�rio L�quido R$" + salarioLiquido);
		}else {
			double salarioLiquido = salarioBruto - (salarioBruto * (20.0/100)); // al�quota de 20%
			System.out.print("S�lario Bruto R$" + salarioBruto);
			System.out.print("\nSal�rio L�quido R$" + salarioLiquido);
		}
		
		sc.close();
	}

}
