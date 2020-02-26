/**
 * Classe que armazena atributos e metodos de Carro
 * @author pbido
 * @since 11/02/2020
 * @version 0.1
 */

package exec03;

public class Carro extends Produto {
	String marca = "Honda";
	String modelo = "Civic";
	int ano = 2020;
	String cor = "Preto";
	String motor = "VTEC";

	public void exibirCarro() {
		
		//Verifica se marca � nulo
		if (marca != null) {
			System.out.println("Marca: " + marca);
		}else{
			System.out.println("Marca n�o informada.");
		}
		
		//verifica se modelo � nulo
		if (modelo != null) {
			System.out.println("Modelo: " + modelo);
		} else {
			System.out.println("Modelo n�o informado.");
		}
		
		//Verifica se ano � nulo
		if (ano > 0) {
			System.out.println("Ano: " + ano);
		} else {
			System.out.println("Ano n�o informado.");
		}
		
		//Verifica se cor � nulo
		if (cor != null) {
			System.out.println("Cor: " + cor);
		} else {
			System.out.println("Cor n�o informada.");
		}
		
		//Verifica se motor � nulo
		if (motor != null) {
			System.out.println("Motor: " + motor);
		} else {
			System.out.println("motor n�o informado.");
		}
		exibirTudo();
	}
}
