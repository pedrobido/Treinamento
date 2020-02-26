/**
 * @author pbido
 * @since 18/02/2020
 * @version 0.1
 */

package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploButtonLabelField {
	public static void main(String[] args) {

		// Define frame and its properties
		JFrame window = new JFrame();
		window.setTitle("HEYEHEYEYEEYEEEE");
		window.setSize(300, 200);
		window.getContentPane().setLayout(null);
		window.setLocationRelativeTo(null);

		// Define button and its properties
		JButton button = new JButton();
		button.setText("Click here !!!");
		button.setBounds(160, 120, 100, 20);

		// Define label component
		JLabel label = new JLabel();
		label.setText("Nome: ");
		label.setBounds(10, 20, 40, 20);

		// Define text field
		JTextField txtField = new JTextField();
		txtField.setBounds(50, 20, 100, 20);

		// Add components to the frame
		window.getContentPane().add(button);
		window.getContentPane().add(label);
		window.getContentPane().add(txtField);

		// Set window's visibility
		window.setVisible(true);
	}

}
