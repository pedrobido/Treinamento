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

	// DECLARAÇÃO DE VARIÁVEIS
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

	public void iniciaGui() {// INICIO DO MÉTODO INICIAGUI

		// INSTANCIA DE VARIÁVEIS
		janela = new JFrame("Exemplo de CheckBox");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();// Casting de um JPanel em uma JFrame

		// CONFIGURAÇÕES DA LABEL ESCOLHA
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento:");
		lblEscolha.setBounds(14, 15, 208, 18);

		// CONFIGURAÇÕES DA LABEL RESPOSTA
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 18);

		// CONFIGURAÇÕES DO CHECKBOX CARTAO DE CREDITO
		cbCC.setText("Cartão de Crédito");// Primeiro parâmetro para checkboxes por padrão
		cbCC.setSelected(false);// Definindo como não selecionado
		cbCC.setBounds(42, 124, 145, 24);

		// CONFIGURAÇÕES DO CHECKBOX DEPÓSITO BANCÁRIO
		cbDB.setText("Depósito Bancário");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// CONFIGURAÇÕES DO CHECKBOX BOLETO BANCÁRIO
		cbBB.setText("Boleto Bancário");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// CONFIGURAÇÕES DO BOTÃO RESPOSTA
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

		// CONFIGURAÇÕES DA JANELA
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}// FIM DO MÉTODO INICIAGUI

	public void verificaSelecionado() {// INICIO DO MÉTODO QUE VERIFICA QUAL CHEBOX FOI SELECIONADO
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
		if (!resposta.equals("")) {// Tratamento para caso não seja selecionado nenhum CheckBox
			lblResposta.setText(resposta);
		}
		resposta = "";// Limpar campos de controle de texto
	}// FIM DO MÉTODO VERIFICA SELECIONADO

}
