/**
 * @author pbido
 * @since 18/02/2020
 * @version 0.1
 */

package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExemploGetTextoCor {

	// Declarar os componentes da tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;

	public ExemploGetTextoCor() {
		iniciaGui();
	}

	public void iniciaGui() {

		// Cria a janela(Instância)
		janela = new JFrame();
		// Cria a area de texto
		area = new JTextArea();
		// Cria o primeiro botao
		botao1 = new JButton("Clique aqui");
		// Adicionar método desenvolvido na classe TextoListener
		botao1.addActionListener(new TextoListener());
		// Cria o segundo botao
		botao2 = new JButton("Troca cor");
		botao2.addActionListener(new CorListener());
		// Cria o campo de texto
		campo = new JTextField();
		campo.addActionListener(new TextoListener());
		// Adicionar o botão no painel da janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		// Adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER, area);
		// Adicionar o campo ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		// Configurar o tamanho do painel da tela
		janela.setSize(300, 300);
		// Configurar a visibilidade da tela
		janela.setVisible(true);
	}

	// Classe interna que implementa ActionListener
	public class TextoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			area.append(campo.getText() + "\n");
			campo.setText("");
			
		}

		
	}

	// Classe interna que implementa ActionListener
	public class CorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Se o fundo da JTextArea for neutro, troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				// Se o fundo for branco, as letras são pretas
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);

			} else {
				// Se o fundo for preto, as letras são brancas
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}
		}
	}

	public static void main(String[] geronimo) {
		new ExemploGetTextoCor();
	}

}
