package listaexercicios2;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// numero par
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero "+ numero + " � um n�mero PAR!!");
		}else{
			System.out.println("O n�mero "+ numero + " N�O � um n�mero par!");
		}
		
		sc.close();
	}

}
