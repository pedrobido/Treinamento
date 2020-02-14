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
		// Verifica se cor � nulo
		if (cor != null) {
			System.out.println("Cor: " + cor);
		} else {
			System.out.println("Cor n�o informada.");
		}

		// Verifica se formato � nulo
		if (formato != null) {
			System.out.println("Formato: " + formato);
		} else {
			System.out.println("Formato n�o informado.");
		}

		// Verifica se marca � nulo
		if (marca != null) {
			System.out.println("Marca: " + marca);
		} else {
			System.out.println("Marca n�o informada.");
		}

		exibirTudo();
	}
}
