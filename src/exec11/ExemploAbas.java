package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class ExemploAbas {

	private JFrame janela;
	private JTabbedPane painelComAbas;

	private JPanel painelDaJanela;
	private JPanel primeiraAba;
	private JPanel segundaAba;
	private JPanel terceiraAba;

	public ExemploAbas() {
		iniciaGui();
	}

	public void iniciaGui() {

		janela = new JFrame("Exemplo de painel com abas");
		painelComAbas = new JTabbedPane();
		painelDaJanela = (JPanel) janela.getContentPane();
		primeiraAba = new JPanel();
		segundaAba = new JPanel();
		terceiraAba = new JPanel();

		painelComAbas.addTab("Aba 1", primeiraAba);
		painelComAbas.addTab("Aba 2", segundaAba);
		painelComAbas.addTab("Aba 3", terceiraAba);
		painelComAbas.setBounds(14, 21, 342, 200);

		primeiraAba.add(new JLabel("Esta é a primeira aba"));
		segundaAba.add(new JLabel("Esta é a segunda aba"));
		terceiraAba.add(new JLabel("Esta é a terceira aba"));

		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setLayout(null);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new ExemploAbas();
	}

}
