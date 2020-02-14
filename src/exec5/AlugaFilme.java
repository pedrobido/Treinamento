/**
 * Classe com atributos e metodos para ver se um filme esta disponivel para aluguel e
 * verificar, de acordo com o valor pago, se pode ou nao alugar
 * @author pbido
 * @since 12/02/2020
 * @version 0.1
 */
package exec5;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class AlugaFilme {
// Declaração de variáveis
	double valorAluguelDiario = 2.99;
	double valorPago;
	int diasAlugados;
	String filmeAlugado;
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = true;

// Método construtor da classe AlugaFilme
	public AlugaFilme() {
		processar();
	}

	public void processar() {
		String filmeEscolhido = escolhaFilme();
		verificaDisponibilidade(filmeEscolhido);
		if (verificaDisponibilidade(filmeEscolhido) == true) {
			calculaPreco(qtdDias(), filmeEscolhido);
		} else {
			JOptionPane.showMessageDialog(null, "Filme não encontrado");
		}
	}

	public String escolhaFilme() {
		String filmeEscolhido = JOptionPane.showInputDialog("Quer alugar Inception ou Stolen?");
		if (filmeEscolhido.equals("Inception")) {
			return "Inception";
		} else if (filmeEscolhido.equals("Stolen")) {
			return "Stolen";
		} else {
			return "Outro";
		}
	}

// Método que verifica a dispopnibilidade do filme informado

	public boolean verificaDisponibilidade(String filmeEscolhido) {
		if (filmeEscolhido.equals("Inception")) {
			if (filmeInceptionDisponivel) {
				return true;
			} else {
				return false;
			}
		} else if (filmeEscolhido.equals("Stolen")) {
			if (filmeStolenDisponivel) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

// Método que calcula o preço baseado na quantidade de dias alugados e no preco por dia
	public void calculaPreco(int diasAlugados, String filmeEscolhido) {

		// DecimalFormat formata o valor desejado baseado na string pattern, que serve
		// de padrao para o formato
		String pattern = "###,###.00";
		DecimalFormat df = new DecimalFormat(pattern);

		// Verifica se o filme escolhido esta disponivel e calcula o preco do aluguel
		if (verificaDisponibilidade(filmeEscolhido)) {
			valorPago = Double.parseDouble(JOptionPane.showInputDialog("O valor do aluguel será R$"
					+ df.format(valorAluguelDiario * diasAlugados) + "\nQual será o valor pago? "));
			if (valorPago < valorAluguelDiario * diasAlugados) {
				JOptionPane.showMessageDialog(null, "Valor pago insuficiente.");
			} else if (valorPago > valorAluguelDiario * diasAlugados) {
				JOptionPane.showMessageDialog(null, "Filme alugado com sucesso\nTroco: R$"
						+ df.format((valorPago - valorAluguelDiario * diasAlugados)));
			}
		} else {
			JOptionPane.showMessageDialog(null, "Filme não disponivel");
		}

	}
	
	public int qtdDias() {
		return  Integer.parseInt(JOptionPane.showInputDialog("Por quantos dias?"));
	}

// Método main	
	public static void main(String[] args) {
		new AlugaFilme();
	}
}
