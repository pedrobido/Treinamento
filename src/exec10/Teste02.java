package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	public static void main(String[] args) {
		try {
			PrintStream gravador = new PrintStream("saida.txt");
			gravador.println("linha 1");
			gravador.println("linha 2");
			gravador.println("linha 3");
			gravador.println("linha 4");
			gravador.println("linha 5");
			gravador.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de saída não encontrado.");
			e.printStackTrace();
		}
	}
}
