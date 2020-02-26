package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ExemploRadioButton {

	// -------------------------Declaração de variáveis--------------------------
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	// Método main
	public static void main(String[] args) {
		new ExemploRadioButton();
	}

	// Método construtor vazio
	public ExemploRadioButton() {
		iniciaGui();
	}

	// Início do método iniciaGui
	public void iniciaGui() {

		// ----------------------Criar as instancias------------------------------
		janela = new JFrame("Exemplo de Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// ----------------------Cria o objeto de grupo de botoes------------------
		grpRadio = new ButtonGroup();

		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

		// ----------------------Configurações da Label Escolha--------------------
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);// Alinhamento do texto, centralizando
		lblEscolha.setText("Selecione o estado civil:");// Definicao do texto da label
		lblEscolha.setBounds(82, 18, 230, 18);// Definicao das coordenadas

		// ----------------------Configurações do Botão Solteiro-------------------
		rbtSolteiro.setText("Solteiro");// Definicao do texto do botão
		rbtSolteiro.setBounds(80, 50, 100, 24);// Definicao das coordenadas

		// ----------------------Configurações do Botão Casado---------------------
		rbtCasado.setText("Casado");// Definicao do texto do botão
		rbtCasado.setBounds(80, 75, 100, 24);// Definicao das coordenadas

		// ----------------------Configurações do Botão Viuvo----------------------
		rbtViuvo.setText("Viuvo");// Definicao do texto do botão
		rbtViuvo.setBounds(80, 100, 100, 24);// Definicao das coordenadas

		// ----------------------Configurações do Botão Divorciado-----------------
		rbtDivorciado.setText("Divorciado");// Definicao do texto do botão
		rbtDivorciado.setBounds(80, 125, 150, 24);// Definicao das coordenadas

		// -----------------------Configurações do Botão----------------------------
		btnVerificar.setText("Verificar");// Definição do texto do botão
		btnVerificar.setBounds(126, 176, 83, 28);// Definição das coordenadas

		// Adicionar ação do botão
		btnVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificaSelecionado();
			}
		});

		// ----------------------Configuraçãoes do Painel da Janela----------------
		painelDaJanela.setLayout(null);// Não utiliza um padrão de layout
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());// Cria bordas para o painel
		// ----------------------ADICIONA OS BOTOES AO PAINEL DA JANELA------------
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);

		// ----------------------CONFIGURAÇÕES DA JANELA---------------------------
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Fecha a janela ao cliclar no X
		janela.setSize(340, 273);// Define o tamanho da tela
		janela.setVisible(true);// Define a visibilidade da tela
		janela.setLocationRelativeTo(null);// Define a posição inicial da janela como centralizada

	}// Fim do método iniciaGui

	public void verificaSelecionado() {
		// Verificar qual Radio Button foi selecionado
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
		// Trocar a cor da fonte para vermelho
		if (!resposta.equals("")) {// Tratamento para caso não seja selecionado nenhum radio button
			lblEscolha.setForeground(Color.RED);// Muda cor da fonte
			lblEscolha.setText(resposta);
		}
		resposta = "";// Limpar campos de controle de texto
	}

}
