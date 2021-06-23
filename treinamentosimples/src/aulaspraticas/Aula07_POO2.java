package aulaspraticas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aula07_POO2 {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("C:\\Users\\Tiago\\git\\course_logic_programming_Simple_Software\\treinamentosimples\\src\\aulaspraticas\\arquivo.txt");
		arquivo.createNewFile();
		
		FileWriter escritor = new FileWriter(arquivo);
		escritor.append("Curso de Programação JAVA!");
		escritor.flush();
		escritor.close();
	}

}
