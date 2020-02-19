/**
 * Classe que armazena atributos e metodos de Produto
 * @author pbido
 * @since 11/02/2020
 * @version 0.1
 */

package exec03;

public class Produto {
	// Declaracao de variaveis
	String nome = "";
	int quantidade = 0;
	double custo = 0;
	int quantidadeVendida = 0;
	double percentualLucro = 0;

	public void exibirNome() {
		// Verifica se o nome nao e nulo
		// Imprime o nome
		if (nome != null) {
			System.out.println(nome);
		} else {
			System.out.println("A variavel nome nao tem valor");
		}
	}

	public void exibirValor() {
		// Verifica se o custo e o percentual de lucro sao maiores que zero
		// Imprime resultado do calculo do lucro somado ao custo do produto, que
		// resulta no valor do mesmo
		if ((custo > 0) && (percentualLucro > 0)) {
			System.out.println(custo + (custo * (percentualLucro / 100)));
		} else {
			System.out.println("Uma das variaveis nao tem valor");
		}
	}

	public void exibirLucro() {
		// Verifica se o custo e o percentual de lucro sao maiores que zero
		// Imprime o valor do lucro baseado no percentual de lucro e no custo de
		// cada produto
		if ((custo > 0) && (percentualLucro > 0)) {
			System.out.println(custo * (percentualLucro / 100));
		} else {
			System.out.println("Uma das variaveis nao tem valor");
		}
	}

	public void exibirTudo() {
		// Executa os metodos criados anteriormente
		exibirNome();
		exibirValor();
		exibirLucro();
		System.out.println(quantidade);
		System.out.println(quantidadeVendida);
	}
}
