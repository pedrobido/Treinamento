package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class ExemploPasswordField {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel jtfSenha;
	private JPasswordField jpwSenha;

	public void iniciaGui() {

		janela = new JFrame("Exemplo de Password Field");
		painelDaJanela = (JPanel) janela.getContentPane();
		jtfSenha = new JLabel();
		jpwSenha = new JPasswordField();

		jtfSenha.setText("Senha:");
		jtfSenha.setBounds(10, 40, 40, 20);

		jpwSenha.setBounds(60, 40, 100, 20);

		painelDaJanela.setLayout(null);
		painelDaJanela.add(jtfSenha);
		painelDaJanela.add(jpwSenha);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new ExemploPasswordField().iniciaGui();
	}

}
