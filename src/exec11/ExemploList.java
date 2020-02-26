package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExemploList {

	private JFrame janela;
	private JList list;
	private JLabel label;
	private JPanel painelDaJanela;
	private JScrollPane scroll;
	private String[] diasSemana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábadp" };

	public void iniciaGui() {
		janela = new JFrame("Exemplo de lista");
		list = new JList(diasSemana);
		label = new JLabel("Ctrl para multiseleções", JLabel.CENTER);
		scroll = new JScrollPane(list);
		painelDaJanela = (JPanel) janela.getContentPane();

		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				label.setText((String) list.getSelectedValue());
				
			}
		});

		scroll.setBounds(10, 60, 300, 90);

		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.black);
		label.setBounds(10, 10, 300, 30);

		painelDaJanela.setLayout(null);
		painelDaJanela.add(label);
		painelDaJanela.add(scroll);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new ExemploList().iniciaGui();

	}

}
