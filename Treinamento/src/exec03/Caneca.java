/**
 * Classe que armazena atributos e metodos de Caneca
 * @author pbido
 * @since 11/02/2020
 * @version 0.1
 */

package exec03;

public class Caneca extends Produto {
	// Declaracao de variaveis
	boolean estampa = true;
	String material = "Porcelana";
	String medida = "350ml";

	public void exibirCaneca() {
		// Verifica se tem estampa
		if (estampa) {
			System.out.println("Estampa: sim");
		} else {
			System.out.println("Estampa: não");
		}

		// Verifica se material é nulo
		if (material != null) {
			System.out.println("Material: " + material);
		} else {
			System.out.println("Material não informado.");
		}

		// Verifica se medida é nulo
		if (medida != null) {
			System.out.println("Medida: " + medida);
		} else {
			System.out.println("Medida não informada.");
		}

		exibirTudo();
	}

}
