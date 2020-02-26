package exec09;

public class ConversorString {
	public static void main(String[] args) {
		String lista[] = new String[5];
		lista[0] = "Pedro Henrique dos Santos Bido";
		String str = lista[0];
		String maiuscula = str.toUpperCase();
		String minuscula = str.toLowerCase();
		System.out.println("Original: " + str);
		System.out.println("Maiúscula: " + maiuscula);
		System.out.println("Minúscula: " + minuscula);

	}
}
