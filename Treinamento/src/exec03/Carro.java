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
		
		//Verifica se marca é nulo
		if (marca != null) {
			System.out.println("Marca: " + marca);
		}else{
			System.out.println("Marca não informada.");
		}
		
		//verifica se modelo é nulo
		if (modelo != null) {
			System.out.println("Modelo: " + modelo);
		} else {
			System.out.println("Modelo não informado.");
		}
		
		//Verifica se ano é nulo
		if (ano > 0) {
			System.out.println("Ano: " + ano);
		} else {
			System.out.println("Ano não informado.");
		}
		
		//Verifica se cor é nulo
		if (cor != null) {
			System.out.println("Cor: " + cor);
		} else {
			System.out.println("Cor não informada.");
		}
		
		//Verifica se motor é nulo
		if (motor != null) {
			System.out.println("Motor: " + motor);
		} else {
			System.out.println("motor não informado.");
		}
		exibirTudo();
	}
}
