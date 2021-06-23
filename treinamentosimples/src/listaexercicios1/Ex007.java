package listaexercicios1;

import java.util.Scanner;


public class Ex007 {

	public static void main(String[] args) {
		// Menu de estado civil
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleciona uma das opções abaixo:");
		System.out.println(""
				+ "[1] SOLTEIRO(A)\n"
				+ "[2] DESQUITADO(A)\n"
				+ "[3] CASADO(A)\n"
				+ "[4] DIVORCIADO(A)\n"
				+ "[5] VIÚVO(A)");
		
		int estadoCivil = sc.nextInt();
		
		if(estadoCivil == 1) {
			System.out.println("Atualmente você está Solteiro(a)!");
		}else if (estadoCivil == 2) {
			System.out.println("Atualmente você está Desquitado(a)!");
		}else if (estadoCivil == 3) {
			System.out.println("Atualmente você está Casado(a)!");
		}else if (estadoCivil == 4) {
			System.out.println("Atualmente você está Divorciado(a)!");
		}else if (estadoCivil == 5) {
			System.out.println("Atualmente você está Viúvo(a)!");
		}else {
			System.out.println(" Valor digitado INVÁLIDO!");
		}
		sc.close();
	}

}
