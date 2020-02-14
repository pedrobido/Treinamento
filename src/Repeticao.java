import javax.swing.JOptionPane;

public class Repeticao {
	boolean exit = false;

	public Repeticao() {
//		while (!exit) {
//			processar();
//		}
//		testaDoWhile();
		testaWhile();
	}

	private void testaWhile() {
		int i = 10;
		while (i < 10) {
			System.out.println(i + " ao cubo é " + ((i * i) * i));
			i++;
		}
	}

	private void testaDoWhile() {
		int i = 10;
		do {
			System.out.println(i + " ao cubo é " + ((i * i) * i));
			i++;
		} while (i < 10);
	}

	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção:"));
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Opção 1.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Opção 2.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Opção 3.");
			break;
		case 9:
			exit = true;
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida.");
			break;
		}
	}

	public static void main(String[] args) {
		new Repeticao();
	}
}
