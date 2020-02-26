package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ExemploTabela {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] { "UF", "Estado" };
	private String[][] dados = new String[][] { { "SP", "São Paulo" }, { "RJ", "Rio de Janeiro" },
			{ "RN", "Rio Grande do Norte" }, { "PR", "Paraná" } };
	private JLabel lblIncluirUf;
	private JLabel lblIncluirEstado;
	private JTextField jtfIncluirUf;
	private JTextField jtfIncluirEstado;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;

	public void iniciaGui() {
		janela = new JFrame("Exemplo de tabela");
		painelDaJanela = (JPanel) janela.getContentPane();
		lblIncluirUf = new JLabel("Informe a UF");
		lblIncluirEstado = new JLabel("Informe o estado");
		jtfIncluirUf = new JTextField();
		jtfIncluirEstado = new JTextField();
		botaoIncluir = new JButton("Incluir");
		botaoExcluir = new JButton("Excluir");

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);
		tabela.setEnabled(true);

		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		painelDeScroll.setBounds(10, 100, 360, 95);
		tabela.setBounds(10, 30, 300, 95);
		botaoIncluir.setBounds(75, 200, 100, 50);
		botaoIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adicionaLinha();
			}
		});

		botaoExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				excluiLinha();

			}

		});

		botaoExcluir.setBounds(195, 200, 100, 50);
		lblIncluirEstado.setBounds(15, 55, 90, 25);
		lblIncluirUf.setBounds(15, 20, 70, 25);
		jtfIncluirEstado.setBounds(110, 55, 260, 25);
		jtfIncluirUf.setBounds(110, 20, 50, 25);

		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelDeScroll);
		painelDaJanela.add(lblIncluirEstado);
		painelDaJanela.add(lblIncluirUf);
		painelDaJanela.add(botaoExcluir);
		painelDaJanela.add(botaoIncluir);
		painelDaJanela.add(jtfIncluirEstado);
		painelDaJanela.add(jtfIncluirUf);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}

	public ExemploTabela() {
		iniciaGui();
	}

	public void adicionaLinha() {
		if (jtfIncluirUf.getText().equals("") || jtfIncluirEstado.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha os campos");
		} else {
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.addRow(new String[] { jtfIncluirUf.getText(), jtfIncluirEstado.getText() });
			jtfIncluirEstado.setText("");
			jtfIncluirUf.setText("");
			JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso!");
		}
	}

	private void excluiLinha() {
		if (tabela.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione uma linha");
		} else if (tabela.getSelectedRowCount()> 1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas uma linha");
		} else {
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Excluído com sucesso");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new ExemploTabela();
	}

}
