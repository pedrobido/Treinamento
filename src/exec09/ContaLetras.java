/**
 * Classe que conta letras
 * @author pbido
 * @since 17/02/2020
 * @version 0.1
 */

package exec09;

public class ContaLetras {
	public static void main(String[] args) {
		String[] lista = new String[5];
		lista[0] = "java";
		int cont = lista[0].length();
		System.out.print("A lista " + lista[0]);
		System.out.println(" possui " + cont + " caracteres.");
	}
}
