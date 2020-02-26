package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {

	public static void main(String[] args) {
		// Gera um novo arquivo
		File arquivo = new File("saida.txt");
		try {
			// Classe FileOutputStream para manipular o arquivo criado anteriormente
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.println("Olá");
			gravador.close();
			arquivoOutput.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de saída não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
