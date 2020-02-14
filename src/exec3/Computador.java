/**
 * Classe que armazena atributos e metodos de Computador
 * @author pbido
 * @since 11/02/2020
 * @version 0.1
 */

package exec3;

public class Computador extends Produto {
	String processador = "Intel i9";
	String memoria = "32GB de RAM";
	String tela = "16\"";
	String hd = "2TB";
	String placaDeVideo = "RTX 2080";

	public void exibirComputador() {
		if (processador != null) {
			System.out.println("Processaodr: " + processador);
		} else {
			System.out.println("Processador n�o informado.");
		}

		if (memoria != null) {
			System.out.println("Processador: " + memoria);
		} else {
			System.out.println("Mem�ria n�o informada.");
		}

		if (tela != null) {
			System.out.println("Tela: " + tela);
		} else {
			System.out.println("Tela n�o informada.");
		}

		if (hd != null) {
			System.out.println("HD: " + hd);
		} else {
			System.out.println("HD n�o informado.");
		}

		if (placaDeVideo != null) {
			System.out.println("Placa de v�deo: " + placaDeVideo);
		} else {
			System.out.println("Placa de v�deo n�o informada.");
		}
		exibirTudo();
	}
}
