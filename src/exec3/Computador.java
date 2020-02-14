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
			System.out.println("Processador não informado.");
		}

		if (memoria != null) {
			System.out.println("Processador: " + memoria);
		} else {
			System.out.println("Memória não informada.");
		}

		if (tela != null) {
			System.out.println("Tela: " + tela);
		} else {
			System.out.println("Tela não informada.");
		}

		if (hd != null) {
			System.out.println("HD: " + hd);
		} else {
			System.out.println("HD não informado.");
		}

		if (placaDeVideo != null) {
			System.out.println("Placa de vídeo: " + placaDeVideo);
		} else {
			System.out.println("Placa de vídeo não informada.");
		}
		exibirTudo();
	}
}
