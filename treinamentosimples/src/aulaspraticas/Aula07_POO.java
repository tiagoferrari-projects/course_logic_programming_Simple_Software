package aulaspraticas;

public class Aula07_POO {

	public static void main(String[] args) {
		
		Aluno pedro = new Aluno("Pedro");
		pedro.nota1 = 10.0;
		pedro.nota2 = 9.0;
		pedro.nota3 = 5.0;
		
		// quando existir um parentese, significa que estamos invocando um m�todo
		double mediaPedro = pedro.caculcarMedia();
		
		System.out.println(pedro.nome);
		
		System.out.println("A M�dia do Pedro �: " + mediaPedro);
		
		System.out.println("Depois da chamada do m�todo");
		
		String nome = "Matheus(Cas�o)";
		pedro.imprimeNomeDoProfessor(nome);
		
	}

}

class Aluno {
	
	// construtor
	// toda vez que o new for invocado, o construtor ser� chamado
	Aluno(String nome){
		this.nome = "Meu nome �: " + nome;
	}
	
	// atributos
	String nome;
	int idade;
	double nota1;
	double nota2;
	double nota3;

	// metodos
	//<tipo de retorno> <nome do metodo>
	//void nao ira devolver/retornar nada para o codigo chamador
	double caculcarMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}
	
	void imprimeNomeDoProfessor(String nomeDoProfessor) {
		System.out.println("Nome do Professor: " + nomeDoProfessor);
	}
	
}
