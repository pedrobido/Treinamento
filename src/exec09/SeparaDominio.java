package exec09;

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog(null, "Informe o email: ", "Validador de email", 1);
		int cont = email.indexOf("@");
		if (cont > 0) {
			System.out.println("Posi��o do @: " + cont);
			String dominio = email.substring(cont + 1);
			System.out.println("Dom�nio do email: " + dominio);
			String usuario = email.substring(0, cont);
			System.out.println("Usu�rio do email: " + usuario);
		}

	}

}
