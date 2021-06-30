package aulaspraticas_arvorebinaria09;

public class No {
	
	No esquerda;
	No direita;
	int dado;
	
	public No(int dado) {
		this.dado = dado;
	}
	
	public void inserir(int dado) {
		if (dado <= this.dado) {
			// vai para a esquerda
			if (esquerda != null) {
				esquerda.inserir(dado);
			} else {
				esquerda = new No (dado);
			}
		} else {
			// vai para direita
			if (direita != null) {
				direita.inserir(dado);
			} else {
				direita = new No(dado);
			}
		}
	}
	
	public void print() {
		// inorder ou ordem simetrica
		if (esquerda != null) {
			esquerda.print();
		}
		
		System.out.print(dado + ", ");
		
		if (direita != null) {
			direita.print();
		}
	}	
	
}
