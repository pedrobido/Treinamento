/**
 * Classe carro
 * @author pbido
 * @since 13/02/2020
 * @version 0.1
 */
package exec7;

public class Carro {
	String modelo;
	String placa;
	int velocidadeMaxima;
	String combustivel;
	double valor;
	String cor;
	boolean vendido = false;

	public Carro() {

	}

	public Carro(String modelo, String placa, int velocidadeMaxima, String combustivel, double valor, String cor,
			boolean vendido) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.velocidadeMaxima = velocidadeMaxima;
		this.combustivel = combustivel;
		this.valor = valor;
		this.cor = cor;
		this.vendido = vendido;
	}
}
