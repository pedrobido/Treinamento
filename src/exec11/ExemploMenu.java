/**
 * Exemplo de Menu
 * @author pbido
 * @since 19/02/2020
 * @version 0.1
 */
package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ExemploMenu {// INICIO DA CLASSE EXEMPLOMENU

	// DECLARAÇÃO DE VARIÁVEIS
	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu01;
	private JMenuItem itemMenu02;
	private JPanel painelDaJanela;

	public void iniciaGui() {// INICIO DO METODO INICIAGUI

		// INSTANCIA DAS VARIÁVEIS
		janela = new JFrame("Exemplo de Menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu01 = new JMenuItem("Item 1");
		itemMenu02 = new JMenuItem("Item 2");
		painelDaJanela = (JPanel) janela.getContentPane();

		// ACRESCENTAR MENUS NA BARRA DE MENUS
		barraMenu.add(menu01);
		barraMenu.add(menu02);

		// ACRESCENTAR ITENS DE MENU NOS MENUS
		menu01.add(itemMenu01);
		menu02.add(itemMenu02);
		itemMenu01.addActionListener(new ActionListener() {// Configurando a ação do item de menu 01
			@Override
			public void actionPerformed(ActionEvent e) {
				new ExemploRadioButton();
				// TODO Função DISPOSE
			}
		});

		itemMenu02.addActionListener(new ActionListener() {// Configurando a ação do item de menu 02
			@Override
			public void actionPerformed(ActionEvent e) {
				new ExemploCheckBox();
			}
		});

		// CONFIGURAR O PAINEL DE TELA
		painelDaJanela.setLayout(null);

		// CONFIGURAÇÕES DA TELA
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setJMenuBar(barraMenu);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setSize(300, 300);
	}// FIM DO METODO INICIAGUI

	public static void main(String[] args) {
		new ExemploMenu();
	}

	public ExemploMenu() {
		iniciaGui();
	}

}// FIM DA CLASSE EXEMPLOMENU
