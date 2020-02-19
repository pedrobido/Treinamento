/**
 * Casting
 * @author pbido
 * @since 11/02/2020
 * @version 0.1
 */
package exec04;

public class TestaValor {
	public static void main(String[] args) {
		// byte b = (byte) 128;
		// System.out.println("O valor de b :" + b);
		//	double d = 100;
		String d = "100";
		int i = Integer.parseInt(d);;
		String s = i + "";
		System.out.println(s);
	}
}
