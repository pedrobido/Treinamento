/**
 * Exemplo de ComboBox
 * @author pbido
 * @since 19/02/2020
 * @version 0.1
 */
package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploComboBox {// INICIO DA CLASSE EXEMPLOCOMBOBOX

	// DECLARA��O DE VARI�VEIS
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String[] equipamentos = { "Monitor", "Teclado", "Mouse", "Scanner", "Modem" };

	public static void main(String[] args) {// INICIO DO METODO MAIN
		new ExemploComboBox();
	}// FIM DO METODO MAIN

	public ExemploComboBox() {// INICIO DO METODO CONSTRUTOR
		iniciaGui();
	}// FIM DO METODO CONSTRUTOR

	public void iniciaGui() {// INICIO DO METODO INICIAGUI

		// INSTANCIA DAS VARI�VEIS
		janela = new JFrame("Exemplo de ComboBox");
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);

		// CONFIGURA��ES DO COMBOBOX
		cbox.setSelectedIndex(-1);// Inicia o combobox sem estar preenchido
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);

		// CONFIGURA��ES DO PAINEL DA TELA
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);

		// CONFIGURA��ES DA JANELA
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}// FIM DO METODO INICIAGUI

}// FIM DA CLASSE EXEMPLOCOMBOBOX
