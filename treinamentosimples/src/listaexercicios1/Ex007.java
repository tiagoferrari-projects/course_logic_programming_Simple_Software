package listaexercicios1;

import java.util.Scanner;


public class Ex007 {

	public static void main(String[] args) {
		// Menu de estado civil
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleciona uma das op��es abaixo:");
		System.out.println(""
				+ "[1] SOLTEIRO(A)\n"
				+ "[2] DESQUITADO(A)\n"
				+ "[3] CASADO(A)\n"
				+ "[4] DIVORCIADO(A)\n"
				+ "[5] VI�VO(A)");
		
		int estadoCivil = sc.nextInt();
		
		if(estadoCivil == 1) {
			System.out.println("Atualmente voc� est� Solteiro(a)!");
		}else if (estadoCivil == 2) {
			System.out.println("Atualmente voc� est� Desquitado(a)!");
		}else if (estadoCivil == 3) {
			System.out.println("Atualmente voc� est� Casado(a)!");
		}else if (estadoCivil == 4) {
			System.out.println("Atualmente voc� est� Divorciado(a)!");
		}else if (estadoCivil == 5) {
			System.out.println("Atualmente voc� est� Vi�vo(a)!");
		}else {
			System.out.println(" Valor digitado INV�LIDO!");
		}
		sc.close();
	}

}
