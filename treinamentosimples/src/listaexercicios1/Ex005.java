package listaexercicios1;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Nota 01: ");
		double nota01 = sc.nextDouble();
		System.out.println("Nota 02: ");
		double nota02 = sc.nextDouble();
		System.out.println("Nota 03: ");
		double nota03 = sc.nextDouble();
		
		if(nota01 > nota02 & nota01 > nota03) {
			if(nota02 < nota03) {
				System.out.printf("MAIOR NOTA: %.2f", nota01);
				System.out.printf("\nMENOR NOTA: %.2f", nota02);
			}else if(nota03 < nota02) {
				System.out.printf("MAIOR NOTA: %.2f", nota01);
				System.out.printf("\nMENOR NOTA: %.2f", nota03);
			}
		}else if(nota02 > nota01 & nota02 > nota03) {
			if(nota01 < nota03) {
				System.out.printf("MAIOR NOTA: %.2f", nota02);
				System.out.printf("\nMENOR NOTA: %.2f", nota01);
			}else if(nota03 < nota01){
				System.out.printf("MAIOR NOTA: %.2f", nota02);
				System.out.printf("\nMENOR NOTA: %.2f", nota03);
			}
			
		}else if(nota03 > nota01 & nota03 > nota02) {
			if(nota01 < nota02) {
				System.out.printf("MAIOR NOTA: %.2f", nota03);
				System.out.printf("\nMENOR NOTA: %.2f", nota01);
			}else if(nota02 < nota01) {
				System.out.printf("MAIOR NOTA: %.2f", nota03);
				System.out.printf("\nMENOR NOTA: %.2f", nota02);
			}
		}
		sc.close();
	}

}
