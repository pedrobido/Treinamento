/**
 * @author pbido
 * @since 18/02/2020
 * @version 0.1
 */
package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui01 {

	// Declare reference variables
	private static JFrame window;
	private static JButton button;

	public static void main(String[] args) {

		// Create a new window(Instance)
		window = new JFrame("My first window!");

		// Create a new button(Instance)
		button = new JButton("Click here!");

		// Add button to window pane
		window.getContentPane().add(button);

		// Set window size
		window.setSize(300, 300);

		// Set visibility of the window
		window.setVisible(true);

		// Set window's default layout
		window.getContentPane().setLayout(null);

	}

}
