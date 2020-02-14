/**
 * Classe locadora 
 * @author pbido
 * @since 12/02/2020
 * @version 0.1
 */
package exec7;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Locadora {
	static Carro vetorCarro[] = new Carro[10];
	Carro carroAux[] = new Carro[10];

	public Locadora() {
		processar();
	}

	public void processar() {
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua opção:\n " + "\n1-Buscar por modelo\n"
					+ "2-Buscar por Velocidade Máxima\n" + "3-Buscar por Combustível\n"
					+ "4-Mais Caros -> Mais Baratos\n" + "5-Buscar por Cor\n" + "6-Vender\n\n"));
			switch (opcao) {
			case 1:
				String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:").toUpperCase();
				buscaModelo(modelo);
				break;
			case 2:
				int velocidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite o modelo do carro:"));
				buscaVelocidadeMaxima(velocidadeMaxima);
				break;
			case 3:
				String combustivel = JOptionPane.showInputDialog("Digite o combustivel do carro:").toUpperCase();
				buscaCombustivel(combustivel);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, scrollJOptionDecrescente(), "Lista de carros",
						JOptionPane.PLAIN_MESSAGE);
				break;
			case 5:
				String cor = JOptionPane.showInputDialog("Digite a cor do carro:").toUpperCase();
				buscaCor(cor);
				break;
			case 6:
				String modeloVenda = JOptionPane.showInputDialog("Digite o modelo do carro:").toUpperCase();
				String corVenda = JOptionPane.showInputDialog("Digite a cor do carro:").toUpperCase();
				buscaModeloECor(modeloVenda, corVenda);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 9);
	}

	public void buscaModeloECor(String modeloVenda, String corVenda) {
		
		System.out.println(modeloVenda + "  " +  corVenda);
		boolean existeCarro = false;
		String listaCarro = "";
		ordenarVetorCrescente();
		int j = 0;

		for (int i = 0; i < vetorCarro.length; i++) {
			if ((vetorCarro[i].modelo.equals(modeloVenda)) && (vetorCarro[i].cor.equals(corVenda))) {
				carroAux[j] = vetorCarro[i];
				j++;
				listaCarro = listaCarro + "\n\n(" + j + ")-\nModelo: " + vetorCarro[i].modelo + "\nPlaca: "
						+ vetorCarro[i].placa + "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\nCombustivel: " + vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: "
						+ vetorCarro[i].cor + "\n";
				existeCarro = true;
			}

			if (existeCarro == false) {
				JOptionPane.showMessageDialog(null, "Carro não encontrado.");
				break;
			}
		}
		if (j > 1) {
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"Foram encontrados " + j + " carros: " + listaCarro + "\n\nPor favor escolha sua opção:"));
			escolha = escolha - 1;
			for (int x = 0; x < j; x++) {
				if (x == escolha) {
					comprarCarro(carroAux[escolha].valor, escolha);
				}
			}
		}
	}

	public void comprarCarro(double valor, int posicao) {
		double valorPago = Double.parseDouble(
				JOptionPane.showInputDialog("O valor do carro é: R$" + valor + "\n Qual o preço a ser pago?"));
		if (valorPago == valor) {
			JOptionPane.showMessageDialog(null, "Carro comprado com sucesso");
			vetorCarro[posicao].vendido = true;
		} else if (valorPago > valor) {
			JOptionPane.showMessageDialog(null, "Seu troco é de: R$" + (valorPago - valor));
			JOptionPane.showMessageDialog(null, "Carro comprado com sucesso");
			vetorCarro[posicao].vendido = true;
		} else {
			JOptionPane.showMessageDialog(null, "Valor pago não suficiente para a compra.\nValor do Carro: R$" + valor
					+ "\nValor pago: R$" + valorPago);
		}

		JOptionPane.showMessageDialog(null, scrollJOptionCrescente(), "Lista de carros", JOptionPane.PLAIN_MESSAGE);
	}

	private JScrollPane scrollJOptionCrescente() {
		JTextArea textArea = new JTextArea(exibirCrescente());
		JScrollPane scrollPane = new JScrollPane(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setPreferredSize(new Dimension(350, 500));
		return scrollPane;
	}

	private JScrollPane scrollJOptionDecrescente() {
		JTextArea textArea = new JTextArea(exibirDecrescente());
		JScrollPane scrollPane = new JScrollPane(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setPreferredSize(new Dimension(350, 500));
		return scrollPane;
	}

	public static void main(String[] args) {
		Carro carro1 = new Carro("CIVIC", "ABC-1234", 230, "GASOLINA", 92000, "PRETO", false);
		Carro carro2 = new Carro("CIVIC", "AJR-3847", 230, "ALCOOL", 90000, "PRATA", false);
		Carro carro3 = new Carro("CIVIC", "FOR-2134", 195, "GASOLINA", 82990, "PRATA", false);
		Carro carro4 = new Carro("M3", "BMW-0298", 250, "FLEX", 135990, "PRETO", false);
		Carro carro5 = new Carro("Z4", "BMW-1234", 266, "FLEX", 199990, "AZUL", false);
		Carro carro6 = new Carro("RENEGADE", "JEE-5674", 187, "GASOLINA", 67990, "PRATA", false);
		Carro carro7 = new Carro("RENEGADE", "JEE-9398", 190, "DIESEL", 56990, "PRATA", false);
		Carro carro8 = new Carro("COMPASS", "OKJ-3334", 199, "GASOLINA", 10, "BRANCO", false);
		Carro carro9 = new Carro("COMPASS", "JKF-1432", 230, "DIESEL", 90990, "BRANCO", false);
		Carro carro10 = new Carro("CLK 200", "MER-0001", 255, "FLEX", 237990, "PRATA", false);
		vetorCarro[0] = carro1;
		vetorCarro[1] = carro2;
		vetorCarro[2] = carro3;
		vetorCarro[3] = carro4;
		vetorCarro[4] = carro5;
		vetorCarro[5] = carro6;
		vetorCarro[6] = carro7;
		vetorCarro[7] = carro8;
		vetorCarro[8] = carro9;
		vetorCarro[9] = carro10;
		new Locadora();
	}

	public void buscaModelo(String modelo) {
		String listaCarro = "";
		boolean existeCarro = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(modelo)) {
				listaCarro = listaCarro + "\nModelo: " + vetorCarro[i].modelo + "\nPlaca: " + vetorCarro[i].placa
						+ "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
						+ vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: " + vetorCarro[i].cor
						+ "\n";
				existeCarro = true;
			}
			if (existeCarro == false) {
				JOptionPane.showMessageDialog(null, "Carro não encontrado.");
				break;
			}
		}

	}

	public void buscaVelocidadeMaxima(int velocidadeMaxima) {
		String listaCarro = "";
		boolean existeCarro = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].velocidadeMaxima == (velocidadeMaxima)) {
				listaCarro = listaCarro + "\nModelo: " + vetorCarro[i].modelo + "\nPlaca: " + vetorCarro[i].placa
						+ "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
						+ vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: " + vetorCarro[i].cor
						+ "\n";
				existeCarro = true;
			}
			if (existeCarro == false) {
				JOptionPane.showMessageDialog(null, "Carro não encontrado.");
				break;
			}
		}

	}

	public void buscaCombustivel(String combustivel) {
		String listaCarro = "";
		boolean existeCarro = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(combustivel)) {
				listaCarro = listaCarro + "\nModelo: " + vetorCarro[i].modelo + "\nPlaca: " + vetorCarro[i].placa
						+ "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
						+ vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: " + vetorCarro[i].cor
						+ "\n";
				existeCarro = true;
			}
			if (existeCarro == false) {
				JOptionPane.showMessageDialog(null, "Carro não encontrado.");
				break;
			}
		}
	}

	public void ordenarVetorDecrescente() {
		Carro aux;
		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {
					aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
				}
			}
		}
	}

	public void ordenarVetorCrescente() {
		Carro aux;
		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {
					aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
				}
			}
		}
	}

	public String exibirDecrescente() {
		String listaCarro = "";
		ordenarVetorDecrescente();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				listaCarro = listaCarro + "Modelo: " + vetorCarro[i].modelo + "\nPlaca: " + vetorCarro[i].placa
						+ "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
						+ vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: " + vetorCarro[i].cor
						+ "\n\n";
			}
		}
		return listaCarro;
	}

	public String exibirCrescente() {
		String listaCarro = "";
		ordenarVetorCrescente();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				listaCarro = listaCarro + "Modelo: " + vetorCarro[i].modelo + "\nPlaca: " + vetorCarro[i].placa
						+ "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
						+ vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: " + vetorCarro[i].cor
						+ "\n\n";
			}
		}
		return listaCarro;
	}

	public void buscaCor(String cor) {
		String listaCarro = "";
		boolean existeCarro = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(cor)) {
				listaCarro = listaCarro + "\nModelo: " + vetorCarro[i].modelo + "\nPlaca: " + vetorCarro[i].placa
						+ "\nVelocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
						+ vetorCarro[i].combustivel + "\nValor: " + vetorCarro[i].valor + "\nCor: " + vetorCarro[i].cor
						+ "\n";
				JOptionPane.showMessageDialog(null, listaCarro);
				existeCarro = true;
			}
			if (existeCarro == false) {
				JOptionPane.showMessageDialog(null, "Carro não encontrado.");
				break;
			} else {
				JOptionPane.showMessageDialog(null, listaCarro);
			}
		}

	}
}
