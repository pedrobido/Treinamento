/**
 * Classe que armazena atributos e metodos de Caneta
 * @author pbido
 * @since 11/02/2020
 * @version 0.1
 */

package exec3;

public class Caneta extends Produto {
	// Declaracao de variaveis
	String cor = "Preta";
	String formato = "Nanquim";
	String marca = "Crown";

	public void exibirCaneta() {
		// Verifica se cor é nulo
		if (cor != null) {
			System.out.println("Cor: " + cor);
		} else {
			System.out.println("Cor não informada.");
		}

		// Verifica se formato é nulo
		if (formato != null) {
			System.out.println("Formato: " + formato);
		} else {
			System.out.println("Formato não informado.");
		}

		// Verifica se marca é nulo
		if (marca != null) {
			System.out.println("Marca: " + marca);
		} else {
			System.out.println("Marca não informada.");
		}

		exibirTudo();
	}
}
