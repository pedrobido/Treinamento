/**
 * Exercício de caixa eletrônico para sacar um valor recebendo apenas notas de 50, 20, 10 e 2
 * @author pbido
 * @since 17/02/2020
 * @version 0.1
 */

package exec08;

import javax.swing.JOptionPane;

public class CaixaEletronico {// inicio da classe
	// DeclaraÃ§Ã£o das variÃ¡veis utilizadas no programa

	static int valorSacado = 0;
	static int notaCinquenta = 0;
	static int notaVinte = 0;
	static int notaDez = 0;
	static int notaCinco = 0;
	static int notaDois = 0;

	public CaixaEletronico() {
		processar();
	}

	public void processar() {
		try {
			String strSaque = JOptionPane.showInputDialog("Quanto deseja sacar ?");
			if (strSaque == null)
				System.exit(0);
			valorSacado = Integer.parseInt(strSaque);

			if (valorSacado <= 0) {
				JOptionPane.showMessageDialog(null, "Por favor insira um valor válido.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números.");
			processar();
		}
		// Inicio dos condicionais para calculo de notas
		if (valorSacado == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 103);
			exibirResultado();
		}
		if (valorSacado == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 53);
			exibirResultado();
		} else if (valorSacado >= 50) {
			notaCinquenta = (valorSacado / 50);
			valorSacado = (valorSacado - (notaCinquenta * 50));
			exibirResultado();
		}
		if (valorSacado == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 43);
			exibirResultado();
		}
		if (valorSacado == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 23;
			exibirResultado();
		} else if (valorSacado >= 20) {
			notaVinte = (valorSacado / 20);
			valorSacado = (valorSacado - (notaVinte * 20));
			exibirResultado();
		}
		if (valorSacado == 13) {
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 13;
			exibirResultado();
		}
		if (valorSacado == 11) {
			notaCinco = 1;
			notaDois = 3;
			valorSacado = valorSacado - 11;
			exibirResultado();
		} else if (valorSacado >= 10) {
			notaDez = (valorSacado / 10);
			valorSacado = (valorSacado - (notaDez * 10));
			exibirResultado();

		}

		switch (valorSacado) {
		case 9:
			notaCinco = 1;
			notaDois = 2;
			exibirResultado();
			break;
		case 8:
			notaDois = 4;
			exibirResultado();
			break;
		case 7:
			notaCinco = 1;
			notaDois = 1;
			exibirResultado();
			break;
		case 6:
			notaDois = 3;
			exibirResultado();
			break;
		case 5:
			notaCinco = 1;
			exibirResultado();
			break;
		case 4:
			notaDois = 2;
			exibirResultado();
			break;
		case 3:
			notaDois = 1;
			exibirResultado();
			break;
		case 2:
			notaDois = 1;
			exibirResultado();
			break;
		}

		exibirResultado();
	}

	public static void main(String[] args) {// inicio do mÃ©todo main
		new CaixaEletronico();
	}// fim do mÃ©todo main

	public void exibirResultado() {
		JOptionPane.showMessageDialog(null, "\nR$50,00 -> " + notaCinquenta + "\nR$20,00 -> " + notaVinte
				+ "\nR$10,00 -> " + notaDez + "\nR$5,00 -> " + notaCinco + "\nR$2,00 -> " + notaDois);
	}

}// fim da classe