package aulaspraticas;

public class Aula06_Array {

	public static void main(String[] args) {
		
		// tipo[] nomeVariavel;
		int[] amigos;
		
		// valor default (padrão) é zero
		amigos = new int[10];
		
		amigos[5] = 10;
		
		//int amigos5 = amigos[5];
		//System.out.println(amigos5);
		
		for(int i = 0; i < amigos.length; i++) {
			amigos[i] = (int) (Math.random() * 100) + 1; 
			
		}
		
		for(int i = 0; i < 10; i++) {
			int amigo = amigos[i];
			System.out.print(amigo + " ");
		}
		
		System.out.println();
		
		// null
		String summer = "Summer";
		
		String[] nomes = new String[4];
		nomes[0] = "Rick";
		nomes[1] = "Morty";
		nomes[2] = summer;
		
		for(int i = 0; i < nomes.length; i++) {
			String nome  = nomes[i];
			if(nome == null) {
				continue;
			}
			char inicial = nome.charAt(0);
			System.out.print(inicial + " - " + nomes[i] + ", ");			
		}
		
		System.out.println();
		
		//matriz
		int[][] posicoes = new int[3][3];
		
		posicoes[0][0] = 1;
		posicoes[0][1] = 2;
		posicoes[1][0] = 3;
		posicoes[1][1] = 4;
		posicoes[2][0] = 5;
		posicoes[2][1] = 6;
		
		for(int linha = 0; linha < posicoes.length; linha++) {
			
			int[] colunas = posicoes[linha];
			
			for(int col = 0; col < colunas.length; col ++) {
				int posicao = posicoes[linha][col];
				System.out.print(posicao + " ");
			}
			
			System.out.println();
		}
		
	}

}
