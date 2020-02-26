/**
 * Exemplo de CheckBox
 * @author pbido
 * @since 19/02/2020
 * @version 0.1
 */
package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExemploCheckBox {

	// DECLARA��O DE VARI�VEIS
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;

	public static void main(String[] args) {// INICIO DO METODO MAIN
		new ExemploCheckBox();
	}// FIM DO METODO MAIN

	public ExemploCheckBox() {// INICIO DO METODO CONSTRUTOR
		iniciaGui();
	}// FIM DO METODO MAIN

	public void iniciaGui() {// INICIO DO M�TODO INICIAGUI

		// INSTANCIA DE VARI�VEIS
		janela = new JFrame("Exemplo de CheckBox");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();// Casting de um JPanel em uma JFrame

		// CONFIGURA��ES DA LABEL ESCOLHA
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento:");
		lblEscolha.setBounds(14, 15, 208, 18);

		// CONFIGURA��ES DA LABEL RESPOSTA
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 18);

		// CONFIGURA��ES DO CHECKBOX CARTAO DE CREDITO
		cbCC.setText("Cart�o de Cr�dito");// Primeiro par�metro para checkboxes por padr�o
		cbCC.setSelected(false);// Definindo como n�o selecionado
		cbCC.setBounds(42, 124, 145, 24);

		// CONFIGURA��ES DO CHECKBOX DEP�SITO BANC�RIO
		cbDB.setText("Dep�sito Banc�rio");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// CONFIGURA��ES DO CHECKBOX BOLETO BANC�RIO
		cbBB.setText("Boleto Banc�rio");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// CONFIGURA��ES DO BOT�O RESPOSTA
		btnResposta.setText("OK");
		btnResposta.setBounds(146, 196, 83, 28);
		btnResposta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
			}
		});

		// ADICIONAR COMPONENTES NO PAINEL DA TELA
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);

		// CONFIGURA��ES DA JANELA
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}// FIM DO M�TODO INICIAGUI

	public void verificaSelecionado() {// INICIO DO M�TODO QUE VERIFICA QUAL CHEBOX FOI SELECIONADO
		String resposta = "";
		if (cbCC.isSelected()) {
			resposta += (cbCC.getText());
		}
		if (cbDB.isSelected()) {
			resposta += (cbDB.getText());
		}
		if (cbBB.isSelected()) {
			resposta += (cbBB.getText());
		}
		if (!resposta.equals("")) {// Tratamento para caso n�o seja selecionado nenhum CheckBox
			lblResposta.setText(resposta);
		}
		resposta = "";// Limpar campos de controle de texto
	}// FIM DO M�TODO VERIFICA SELECIONADO

}
